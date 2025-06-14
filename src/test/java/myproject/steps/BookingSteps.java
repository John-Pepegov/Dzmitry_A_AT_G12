package myproject.steps;

import myproject.driver.DriverManager;
import myproject.objects.BookingDetails;
import myproject.pages.ResultsPage;
import myproject.pages.SearchPage;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class BookingSteps {

    private final SearchPage searchPage = new SearchPage(DriverManager.getDriver());
    private final ResultsPage resultsPage = new ResultsPage(DriverManager.getDriver());
    private String actualRating;

    @Given("I open the Booking search page")
    public void i_open_booking_page() {
        searchPage.openBookingApp();
        searchPage.rejectCookies();
        searchPage.closeSignInPopupIfVisible();
    }

    @When("I search hotels in {string} from {int} to {int} days ahead for {int} adults and {int} rooms")
    public void i_search_hotels(String city, int startDays, int endDays, int adults, int rooms) {
        BookingDetails details = new BookingDetails();
        details.setCity(city);
        details.setCheckInDate(LocalDate.now().plusDays(startDays));
        details.setCheckOutDate(LocalDate.now().plusDays(endDays));
        details.setAdults(adults);
        details.setRooms(rooms);

        searchPage.enterSearchCriteria(details);
        searchPage.setGuests(adults, rooms);
        searchPage.submitSearch();
    }

    @And("I filter by 5-star hotels and sort by stars ascending")
    public void i_filter_and_sort() {
        resultsPage.filterByFiveStars();
        resultsPage.sortByStarsAsc();
    }

    @Then("the first hotel rating should be {string}")
    public void the_rating_should_be(String expectedRating) {
        actualRating = resultsPage.getFirstHotelRating();
        assertEquals("Expected hotel rating to be '" + expectedRating + "' but got '" + actualRating + "'",
                expectedRating, actualRating);
    }
}


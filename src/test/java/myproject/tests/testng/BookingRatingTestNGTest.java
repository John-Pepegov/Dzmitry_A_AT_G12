package myproject.tests.testng;

import myproject.driver.DriverManager;
import myproject.objects.BookingDetails;
import myproject.pages.ResultsPage;
import myproject.pages.SearchPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;


public class BookingRatingTestNGTest extends BaseTestNGSteps {

    @Test
    public void testHotelRatingShouldBeFiveOutOfFive() {
        SearchPage searchPage = new SearchPage(DriverManager.getDriver());
        ResultsPage resultsPage = new ResultsPage(DriverManager.getDriver());

        BookingDetails data = new BookingDetails();
        data.setCity("Париж");
        data.setCheckInDate(LocalDate.now().plusDays(3));
        data.setCheckOutDate(LocalDate.now().plusDays(7));
        data.setAdults(3);
        data.setRooms(2);

        searchPage.openBookingApp();
        searchPage.rejectCookies();
        searchPage.closeSignInPopupIfVisible();
        searchPage.enterSearchCriteria(data);
        searchPage.setGuests(data.getAdults(), data.getRooms());
        searchPage.submitSearch();

        resultsPage.filterByFiveStars();
        resultsPage.sortByStarsAsc();

        String rating = resultsPage.getFirstHotelRating();
        assertEquals(rating, "5 из 5", "Ожидаемый рейтинг отелей не соответствует");
    }
}
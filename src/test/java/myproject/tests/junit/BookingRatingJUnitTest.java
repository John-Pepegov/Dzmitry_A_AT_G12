package myproject.tests.junit;

import myproject.driver.DriverManager;
import myproject.objects.BookingDetails;
import myproject.pages.ResultsPage;
import myproject.pages.SearchPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class BookingRatingJUnitTest extends BaseJUnitSteps {

    @Test
    public void testHotelRatingIsFiveOutOfFive() {
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
        searchPage.enterSearchCriteria(data);
        searchPage.setGuests(data.getAdults(), data.getRooms());
        searchPage.submitSearch();

        resultsPage.closeSignInPopupIfVisible();
        resultsPage.filterByFiveStars();
        resultsPage.sortByStarsAsc();

        String rating = resultsPage.getFirstHotelRating();
        assertEquals("Ожидаемый рейтинг отелей не соответствует", "5 из 5", rating);
    }
}


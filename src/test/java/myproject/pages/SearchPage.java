package myproject.pages;

import myproject.objects.BookingDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBookingApp() {
        driver.get("https://booking.com");
    }

    public void rejectCookies() {
        driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
    }

    public void enterSearchCriteria(BookingDetails details) {
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys(details.getCity());

        driver.findElement(By.xpath("//*[@data-testid='searchbox-dates-container']")).click();
        driver.findElement(By.xpath("//span[@data-date='" + details.getCheckInDate() + "']")).click();
        driver.findElement(By.xpath("//span[@data-date='" + details.getCheckOutDate() + "']")).click();
    }

    public void setGuests(int adults, int rooms) {
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();

        for (int i = 1; i < adults; i++) {
            driver.findElement(By.xpath("//input[@id='group_adults']/preceding-sibling::div/button[2]")).click();
        }

        for (int i = 1; i < rooms; i++) {
            driver.findElement(By.xpath("//input[@id='no_rooms']/preceding-sibling::div/button[2]")).click();
        }

        driver.findElement(By.xpath("//button/span[contains(text(),'Готово')]")).click();
    }

    public void submitSearch() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

package homework.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;

public class BookingTestDraft {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        LocalDate dateStart = LocalDate.now().plusDays(3);
        LocalDate dateEnd = dateStart.plusDays(7);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://booking.com");

        driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Париж");
        driver.findElement(By.xpath("//*[@data-testid='searchbox-dates-container']")).click();
        driver.findElement(By.xpath("//*[@data-testid='searchbox-datepicker-calendar']//span[@data-date='" + dateStart + "']")).click();
        driver.findElement(By.xpath("//*[@data-testid='searchbox-datepicker-calendar']//span[@data-date='" + dateEnd + "']")).click();
        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
        driver.findElement(By.xpath("//input[@id='group_adults']/preceding-sibling::div/button[2]")).click();
        driver.findElement(By.xpath("//input[@id='group_adults']/preceding-sibling::div/button[2]")).click();
        driver.findElement(By.xpath("//input[@id='no_rooms']/preceding-sibling::div/button[2]")).click();
        driver.findElement(By.xpath("//button/span[contains(text(),'Готово')]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")).click();
        driver.findElement(By.xpath("//*[@data-filters-item='class:class=5']/input[@type='checkbox']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@data-testid='skeleton-loader']"))
        );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//button[@data-id='class_asc']")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@data-testid='skeleton-loader']"))
        );
        String cardRating = driver
                .findElement(By.xpath("//*[@data-testid='property-card'][1]//*[@aria-label='5 из 5']"))
                .getAttribute("aria-label");

        System.out.println(cardRating);
        driver.quit();
    }
}

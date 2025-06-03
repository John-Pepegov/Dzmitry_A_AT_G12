package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.time.LocalDate;

public class Classwork_03_06_2025 {

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

    }
}

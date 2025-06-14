package classwork.cw_27_05_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Classwork_27_05_2025 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        String tomorrowDate = tomorrow.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String tomorrowDay = tomorrow.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ru"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//button/div[contains(text(),'Отклонить все')]")).click();
        driver.findElement(By.xpath("//textarea[@title='Поиск']")).sendKeys("погода минск");
        driver.findElement(By.xpath("//*[@role='listbox']/li[1]")).click();
        String weatherData = driver
                .findElement(By.xpath("//*[contains(@aria-label,'Celsius " + tomorrowDay + " 12:00')][1]"))
                .getAttribute("aria-label");
        String temperature = weatherData.split("°")[0];
        System.out.println("Завтра " + tomorrowDate + " " + tomorrowDay + " - температура в 12:00 будет " + temperature + "°C");
        driver.quit();
    }
}

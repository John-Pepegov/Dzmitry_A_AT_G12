package myproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ResultsPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void closeSignInPopupIfVisible () {
        try {
            WebElement popupButton = wait.until(ExpectedConditions
                    .presenceOfElementLocated(By.xpath("//button[@aria-label='Скрыть меню входа в аккаунт.']")));

            if (popupButton.isDisplayed() && popupButton.isEnabled()) {
                popupButton.click();
            }
        } catch (TimeoutException ignored) {
            // Popup not shown — safe to continue
        }
    }

    public void filterByFiveStars() {
        driver.findElement(By.xpath("//*[@data-filters-item='class:class=5']/input[@type='checkbox']")).click();
        waitForLoadingToComplete();
    }

    public void sortByStarsAsc() {
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']")).click();
        driver.findElement(By.xpath("//button[@data-id='class_asc']")).click();
        waitForLoadingToComplete();
    }

    private void waitForLoadingToComplete() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@data-testid='skeleton-loader']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public String getFirstHotelRating() {
        return driver
                .findElement(By.xpath("//*[@data-testid='property-card'][1]//*[@aria-label[contains(., 'из 5')]]"))
                .getAttribute("aria-label");
    }
}

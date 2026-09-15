import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class selenium_4 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://v1.training-support.net/selenium");

        Thread.sleep(2000);

        // Click Dynamic Controls
        driver.findElement(
                By.xpath("//div[@class='header' and contains(.,'Dynamic Controls')]")
        ).click();

        Thread.sleep(2000);

        // Find checkbox
        WebElement checkbox = driver.findElement(
                By.xpath("//input[@name='toggled']")
        );

        // Tick checkbox
        checkbox.click();

        Thread.sleep(2000);

        // Find toggle button
        WebElement toggle = driver.findElement(
                By.id("toggleCheckbox")
        );

        Thread.sleep(2000);

        // Remove checkbox
        toggle.click();

        Thread.sleep(2000);

        // Wait until checkbox disappears
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        Thread.sleep(2000);

        // Add checkbox
        toggle.click();

        Thread.sleep(2000);

        // Find the new checkbox
        checkbox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@name='toggled']")
                )
        );

        Thread.sleep(2000);

        // Check whether it is still ticked
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is still ticked");
        } else {
            System.out.println("Checkbox is NOT ticked");
        }

        Thread.sleep(3000);

        driver.quit();
    }
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_2 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net");
        String page_title=driver.getTitle();
        System.out.println(page_title);
        driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
        WebElement firstname= driver.findElement(By.name("username"));
        firstname.sendKeys("sujin");
        WebElement lastname=driver.findElement(By.name("password"));
        lastname.sendKeys("123");
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
        driver.quit();


    }

}

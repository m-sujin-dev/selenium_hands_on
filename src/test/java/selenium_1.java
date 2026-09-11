import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_1 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net");
        String page_title=driver.getTitle();
        System.out.println(page_title);
        driver.findElement(By.id("about-link")).click();
        String page_title2=driver.getTitle();
        System.out.println(page_title2);


    }

}

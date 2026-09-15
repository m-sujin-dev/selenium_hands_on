import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_3 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        WebElement name =driver.findElement(By.id("third-header"));
        String header=name.getText();
        System.out.println(header);
        WebElement name2 =driver.findElement(By.xpath("//h5[text()='Fifth header']"));
        String header2=name2.getText();
        System.out.println(header2);
        System.out.println(
                driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class")
        );
        WebElement color=driver.findElement(By.xpath("//button[text()='Grey']"));
        System.out.println(color.getText());







    }
}

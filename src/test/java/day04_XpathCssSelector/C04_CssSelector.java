package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //NOT: cssSelector kullanarak elementleri locate ediniz.

        // Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.navigate().to(" http://a.testaddressbook.com/sign_in");

        //    b. Locate email textbox
        WebElement emailBox = driver.findElement(By.cssSelector("input[name='session[email]']"));
        //    c. Locate password textbox ve
        WebElement passwordBox = driver.findElement(By.cssSelector("input[name='session[password]']"));
        //    d. Locate signin button
        WebElement signIn = driver.findElement(By.cssSelector("input[name='commit']"));
        //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        i. Username : testtechproed@gmail.com
        emailBox.sendKeys("testtechproed@gmail.com");
        //        ii. Password : Test1234!
        passwordBox.sendKeys("Test1234!", Keys.ENTER);



    }
}

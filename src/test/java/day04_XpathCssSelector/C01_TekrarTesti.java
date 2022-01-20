package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a.google web sayfasına gidin. https://www. amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //    b. Search(ara) “city bike”
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike");
        searchBox.submit();
        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement amauntOfTheElements = driver.findElement(By.className("sg-col-inner"));
        System.out.println(amauntOfTheElements.getText());

        //    d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        //    d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement firstResuld = driver.findElement(By.className("s-image"));
        firstResuld.click();
        Thread.sleep(3000);
        driver.close();

    }
}

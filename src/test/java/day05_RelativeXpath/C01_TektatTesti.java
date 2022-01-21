package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//1-C01_TekrarTesti isimli bir class olusturun
public class C01_TektatTesti {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.amazon.com/ adresine gidin
        driver.navigate().to("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
       String actualTitle= driver.getTitle();
       String expectedTitle= "Spend less";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Test Passed");
        }else{
            System.out.println("Title Test Failed");
        }
        //6- Gift Cards sekmesine basin
        WebElement giftCards = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        giftCards.click();
        //7- Birthday butonuna basin
        WebElement birthDay = driver.findElement(By.xpath("//img[@alt='Birthday Gift Cards']"));
        birthDay.click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        WebElement firstProduct = driver.findElement(By.xpath("(//li[@class='a-carousel-card acswidget-carousel__card'])[1]"));
        firstProduct.click();
        //9- Gift card details’den 25 $’i  secin
        WebElement twentyFive = driver.findElement(By.xpath("//button[@value='25.00']"));
        twentyFive.click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement priceCheck = driver.findElement(By.xpath("//span[text()='$25.00']"));
        String expectedPrice ="$25.00";
        if (priceCheck.getText().equals(expectedPrice)) {
            System.out.println("price test : passed");
        }else{
            System.out.println("price test : failed");
        }
        //10-Sayfayi kapatin
        driver.close();


    }
}

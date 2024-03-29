package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Yeni bir Class olusturalim.C07_ManageWindowSet
public class C07_Manage_WindowSet {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage( ).window( ).setPosition(new Point(800,600));
        driver.manage( ).window( ).setSize(new Dimension(300,500));
        //5. Sayfayi kapatin
        driver.close();

    }
}

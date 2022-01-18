package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMetotlari {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());// -> sayfanin title 'ini getirir

        System.out.println(driver.getCurrentUrl()); // --> sayafanin adresini getirir

        System.out.println("Window Handle : "+driver.getWindowHandle());

        System.out.println(driver.getPageSource());


        driver.close();
    }
}

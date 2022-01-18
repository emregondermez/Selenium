package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        // setProperty method'u 2 parametre ister
        // ilki kullanacagimiz browser'a ait driver
        // ikinci parametre ise selenium sitesinden indirip projemize ekledigimiz
        // chromedriver'in path'i --> sonunda exe olmali

        WebDriver driver = new ChromeDriver();

    driver.get("https://www.amazon.com");
    Thread.sleep(5000);
    driver.close();
 }


}

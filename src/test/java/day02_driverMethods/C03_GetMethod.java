package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethod {
    /*
1. Yeni bir package olusturalim : day03
2. Yeni bir class olusturalim : C03_GetMethod
  */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//3. Amazon sayfasina gidelim. https://www.amazon.com/
       driver.get("https://www.amazon.com");
//4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
//5. Sayfa basliginin “Amazon” icerdigini test edin
      String actualTitle ="Amazon";
      String testTitle = driver.getTitle();
      if (testTitle.contains(actualTitle)){
          System.out.println("Title test : Pass");
      }else {
          System.out.println("Title Test : Failed");
      }
//6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

//7. Sayfa url’inin “amazon” icerdigini test edin.
    String actualUrl="amazon";
    String testUrl = driver.getCurrentUrl();
    if (testUrl.contains(actualUrl)){
        System.out.println("Url Test : Pass");
    }else{
        System.out.println("Url Test : Failed");
    }

//8. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandle());
//9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
      String actualWord="alisveris";
      String testHtml= driver.getPageSource();
        if (testHtml.contains(actualWord)) {
            System.out.println("word test : Pass");
        }else {
            System.out.println("word test : Failed");
        }
//10. Sayfayi kapatin.
        driver.close();
    }


    }


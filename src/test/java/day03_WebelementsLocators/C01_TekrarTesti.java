package day03_WebelementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//1. Yeni bir class olusturun (TekrarTesti)
public class C01_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String testTitle ="youtube";
        if (actualTitle.equals(testTitle)) {
            System.out.println("Title test : Pass");
        }else{
            System.out.println("Title test : Failed");
            System.out.println("Actual Title : "+actualTitle);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String testUrl= "youtube";
        if (actualUrl.contains(testUrl)) {
            System.out.println("Url test : Pass");
        }else{
            System.out.println("Url test : Failed");
            System.out.println("Actual Title : "+actualUrl);
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String amazonActualTitle= driver.getTitle();
        String amazonTestTitle= "Amazon";
        if (amazonActualTitle.contains(amazonTestTitle)){
            System.out.println("Amazon Url Test : Pass");
        }else{
            System.out.println("Amazon Url Test : Failed");
            System.out.println(driver.getTitle());
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String amazonActualUrl= driver.getCurrentUrl();
        String amazonTestUrl= "https://www.amazon.com/";
        if (amazonActualUrl.contains(amazonTestUrl)) {
            System.out.println("Url test : Pass");
        }else{
            System.out.println("Url test : Failed");
            System.out.println("Actual Title : "+amazonActualUrl);
        }
        //11.Sayfayi kapatin
        driver.close();


    }
}

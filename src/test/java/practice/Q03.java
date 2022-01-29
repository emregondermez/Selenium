package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q03 {
    // ...Exercise3...
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the firstname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Emre");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("G");
        driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
        driver.findElement(By.xpath("(//input[@name='exp'])[4]")).click();
       WebElement date= driver.findElement(By.xpath("(//input[@id='datepicker'])"));
        date.sendKeys("29.01.2022");
       date.sendKeys(Keys.PAGE_DOWN);

       WebElement prof= driver.findElement(By.xpath("(//input[@name='profession'])[2]"));
       prof.click();

       driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();

        WebElement dropDown = driver.findElement(By.xpath("(//select[@class='input-xlarge'])[1]"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Antartica");

        driver.findElement(By.xpath("//option[normalize-space()='Browser Commands']")).click();



        driver.close();
    }

}

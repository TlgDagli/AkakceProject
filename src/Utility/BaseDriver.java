package Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

     static  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();//ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti implicitly
         wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public static void Aksiyon(){

        WebElement klnm = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='H_a_v8']")));

        klnm.click();
        //Actions aksiyonDriver2 = new Actions(driver);
        //Action aksiyon2 = aksiyonDriver2.moveToElement(klnm).build();
        //aksiyon2.perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Hesabım']")));
    }

    public static void Basla(){
        driver.get("https://www.akakce.com/");
        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/"));

        WebElement girisyap = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        girisyap.click();
        WebElement mailgiris = driver.findElement(By.xpath("//input[@id='life']"));
        mailgiris.sendKeys("tolgahelmet@gmail.com");
        WebElement passgiris = driver.findElement(By.xpath("//input[@id='lifp']"));
        passgiris.sendKeys("Sdet123**");
        WebElement giris = driver.findElement(By.xpath("//input[@id='lfb']"));
        giris.click();
    }





    public static void BekleKapat() {
        Myfunc.Bekle(5);
        driver.quit();
    }


}

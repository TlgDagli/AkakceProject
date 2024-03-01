import Utility.BaseDriver;

import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AkakceTest extends BaseDriver {
    @Test
    public void us_101() {
        driver.get("https://www.akakce.com/");

        Myfunc.Bekle(2);
        WebElement hspac = driver.findElement(By.xpath("//a[text()='Hesap Aç']"));
        hspac.click();
        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Sdet");

        WebElement soyad = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys("Tears");

        WebElement mail = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        mail.sendKeys("tolgahelmet@gmail.com");

        WebElement mail2 = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        mail2.sendKeys("tolgahelmet@gmail.com");

        WebElement pass1 = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        pass1.sendKeys("Sdet123**");

        WebElement pass2 = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        pass2.sendKeys("Sdet123**");

        WebElement gender = driver.findElement(By.xpath("//input[@id='rngm']"));
        gender.click();

        WebElement il = driver.findElement(By.xpath("//select[@id='locpr']"));
        Select ilSelect = new Select(il);
        ilSelect.selectByIndex(1);

        WebElement ilce = driver.findElement(By.xpath("//select[@id='locds']"));
        Select ilceSelect = new Select(ilce);
        ilceSelect.selectByIndex(4);

        WebElement gun = driver.findElement(By.xpath("//select[@id='bd']"));
        Select gunSelect = new Select(gun);
        gunSelect.selectByIndex(25);

        WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
        Select aySelect = new Select(ay);
        aySelect.selectByIndex(12);

        WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
        Select yilSelect = new Select(yil);
        yilSelect.selectByVisibleText("1982");

        WebElement ksggp = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        ksggp.click();

        WebElement kampanya = driver.findElement(By.xpath("//input[@id='rnufnee']"));
        kampanya.click();
        WebElement olustur = driver.findElement(By.xpath("//input[@id='rfb']"));
        olustur.click();}
    @Test
    public void us_102() {



        WebElement kullanici = driver.findElement(By.cssSelector("[href='/akakcem/']"));
        System.out.println("kullanici = " + kullanici.getText());
        Assert.assertTrue("Kullanıcı Doğrulanamadı", kullanici.getText().contains("Sdet"));
    }
    @Test
    public void us103(){
        WebElement kullanici = driver.findElement(By.cssSelector("[href='/akakcem/']"));

        Actions aksiyonDriver = new Actions(driver);
        Action aksiyon = aksiyonDriver.moveToElement(kullanici).build();
        aksiyon.perform();
        WebElement cik = driver.findElement(By.xpath("//a[@href='#Çık']"));
        cik.click();
    }
    @Test
    public void us_104() {

        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/"));

        WebElement girisyap = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        girisyap.click();


        WebElement mailgiris = driver.findElement(By.xpath("//input[@id='life']"));
        mailgiris.sendKeys("tolgahelmet@gmail.com");

        WebElement passgiris = driver.findElement(By.xpath("//input[@id='lifp']"));
        passgiris.sendKeys("Sdet123**");

        WebElement giris = driver.findElement(By.xpath("//input[@id='lfb']"));
        giris.click();
        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/"));
    }
    @Test
    public void us_105(){

        WebElement klnm = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        Actions aksiyonDriver2 = new Actions(driver);
        Action aksiyon2 = aksiyonDriver2.moveToElement(klnm).build();
        aksiyon2.perform();

        WebElement hesabim = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        hesabim.click();

        WebElement siparis = driver.findElement(By.xpath("//a[text()='Siparişlerim']"));
        siparis.click();
        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/siparislerim/"));


        BekleKapat();


    }


}

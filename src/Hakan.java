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
import org.openqa.selenium.support.ui.Wait;

public class Hakan extends BaseDriver {

    @Test
    public void US_101() {

        driver.get("https://www.akakce.com/");

        WebElement hesapAcBtn = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[text()='Hesap Aç']"));
        hesapAcBtn.click();


        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Hakan");

        WebElement soyad = driver.findElement(By.xpath("//input[@name='rnufs']"));
        soyad.sendKeys("Gül");


        WebElement email = driver.findElement(By.xpath("//input[@name='rnufe1']"));
        email.sendKeys("kaanhakang@gmail.com");

        WebElement email2 = driver.findElement(By.xpath("//input[@name='rnufe2']"));
        email2.sendKeys("kaanhakang@gmail.com");


        WebElement sifre = driver.findElement(By.xpath("//input[@name='rnufp1']"));
        sifre.sendKeys("Hakan5535.");

        WebElement sifre2 = driver.findElement(By.xpath("//input[@name='rnufp2']"));
        sifre2.sendKeys("Hakan5535.");


        WebElement cinsiyet = driver.findElement(By.xpath("//input[@id=\"rngm\"]"));
        cinsiyet.click();

        WebElement il = driver.findElement(By.xpath("//select[@id='locpr']"));
        Select ilSelect = new Select(il);
        ilSelect.selectByVisibleText("İstanbul - Avrupa");


        WebElement ilce = driver.findElement(By.xpath("//select[@id='locds']"));
        Select ilceSelect = new Select(ilce);
        ilceSelect.selectByVisibleText("Bayrampaşa");

        WebElement gun = driver.findElement(By.xpath("//select[@id='bd']"));
        Select gunSelect = new Select(gun);
        gunSelect.selectByVisibleText("13");


        WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
        Select aySelect = new Select(ay);
        aySelect.selectByVisibleText("5");

        WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
        Select yilSelect = new Select(yil);
        yilSelect.selectByVisibleText("1997");

        WebElement kullaniciS = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        kullaniciS.click();

        WebElement hesapAc = driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapAc.click();


        BekleKapat();

    }

    @Test
    public void US_101_Negative() {

        driver.get("https://www.akakce.com/");

        WebElement hesapAcBtn = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[text()='Hesap Aç']"));
        hesapAcBtn.click();


        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Hakan");

        //WebElement soyad = driver.findElement(By.xpath("//input[@name='rnufs']"));
        //soyad.sendKeys("Gül");


        WebElement email = driver.findElement(By.xpath("//input[@name='rnufe1']"));
        email.sendKeys("kaanhakangul@gmail.com");

        WebElement email2 = driver.findElement(By.xpath("//input[@name='rnufe2']"));
        email2.sendKeys("kaanhakang@gmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@name='rnufp1']"));
        sifre.sendKeys("Hakan5535.");

        WebElement sifre2 = driver.findElement(By.xpath("//input[@name='rnufp2']"));
        sifre2.sendKeys("Hakan5535.");


        //WebElement cinsiyet = driver.findElement(By.xpath("//input[@id=\"rngm\"]"));
        //cinsiyet.click();

        WebElement il = driver.findElement(By.xpath("//select[@id='locpr']"));
        Select ilSelect = new Select(il);
        ilSelect.selectByVisibleText("İstanbul - Avrupa");


        WebElement ilce = driver.findElement(By.xpath("//select[@id='locds']"));
        Select ilceSelect = new Select(ilce);
        ilceSelect.selectByVisibleText("Bayrampaşa");

        WebElement gun = driver.findElement(By.xpath("//select[@id='bd']"));
        Select gunSelect = new Select(gun);
        gunSelect.selectByVisibleText("13");


        WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
        Select aySelect = new Select(ay);
        aySelect.selectByVisibleText("5");

        //WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
        //Select yilSelect = new Select(yil);
        //yilSelect.selectByVisibleText("1997");

        WebElement kullaniciS = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        kullaniciS.click();

        WebElement hesapAc = driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapAc.click();

        WebElement hataMsj = driver.findElement(By.xpath("//div[@class='alertX t2']//p"));


        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='alertX t2']//p"), "E-posta adresleri aynı olmalı."));
        Assert.assertTrue("Başarılı bir şekilde kayıt olundu.", hataMsj.getText().contains("E-posta adresleri aynı olmalı."));
        BekleKapat();


    }

    @Test
    public void US_102() {

        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='life']"));
        emailInput.sendKeys("kaanhakang@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Hakan5535.");

        WebElement girisYButton = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='/akakcem/']")));
        WebElement ka = driver.findElement(By.cssSelector("[href='/akakcem/']"));
        System.out.println("ka.getText() = " + ka.getText());

        Assert.assertTrue("Kullanıcı doğrulanamadı.", ka.getText().contains("Hakan"));

        BekleKapat();

    }

    @Test
    public void US_103() {

        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='life']"));
        emailInput.sendKeys("kaanhakang@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Hakan5535.");

        WebElement girisYButton = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYButton.click();

        Actions actionD = new Actions(driver);
        WebElement hesabim = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='H_a_v8']")));

        Action actionHowe = actionD.moveToElement(hesabim).build();
        actionHowe.perform();

        WebElement cik = driver.findElement(By.xpath("//a[@href='#Çık']"));
        cik.click();

        WebElement textGirisYap2 = driver.findElement(By.linkText("Giriş Yap"));
        wait.until(ExpectedConditions.textToBe(By.linkText("Giriş Yap"), "Giriş Yap"));
        Assert.assertTrue("Çıkış yapılamadı.", textGirisYap2.getText().contains("Giriş Yap"));

        BekleKapat();
    }

}

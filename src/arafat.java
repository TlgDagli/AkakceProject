import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class arafat extends BaseDriver {

    @Test
    public void test_US_104(){

        /*
        1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
2. Kullanıcı ana sayfada "Giriş Yap" veya benzer bir seçeneği bulur
ve tıklar.
3. Kullanıcı, test datada verilen geçerli bilgileri girer:
1. E-posta:
testuser@example.com
2. Şifre: Password123
(doğru ve geçerli şifre)
4. "Giriş Yap" butonuna tıklar
         */

        driver.get("https://www.akakce.com/");
        Myfunc.Bekle(3);

        WebElement loginSet= driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        loginSet.click();

        WebElement email= driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("tolgahelmet@gmail.com");

        WebElement passWord= driver.findElement(By.xpath("//input[@id='lifp']"));
        passWord.sendKeys("Sdet123**");

        WebElement loginButton= driver.findElement(By.xpath("//input[@id='lfb']"));
        loginButton.click();

        BekleKapat();
    }
    @Test
    public void test_US_105(){

        /*
        1. Kullanıcı Akakce.com sitesini tarayıcıda açar.
2. Kullanıcı ana sayfada "Giriş Yap" veya benzer bir seçeneği bulur
ve tıklar.
3. Kullanıcı, test data'daki geçerli bilgileri girer.
4. "Giriş Yap" butonuna tıklar.
5. Kullanıcı hesabına başarılı bir şekilde giriş yapar.


6. Kullanıcı sağ üst köşede bulunan account kısmından "Hesabım"
linkine tıklayarak profil sayfasına ulaşır.
7. Kullanıcı profil sayfasında Siparişlerim linkine tıklayarak sipariş
listesine yönlendirilir.
6. Eğer sipariş listesi boşsa, uygun bir mesajın görüntülendiğini
kontrol eder
         */

        BaseDriver.Basla();

       BaseDriver.Aksiyon();

        WebElement hesabim= driver.findElement(By.xpath("//*[text()='Hesabım']"));
        hesabim.click();

        WebElement siparislerim= driver.findElement(By.xpath("//*[text()='Siparişlerim']"));
        siparislerim.click();


        WebElement msg= driver.findElement(By.xpath("//div[text()='Kayıtlı siparişiniz bulunmuyor.']"));
        Assert.assertTrue("Siparişiniz Bulunmaktadır", msg.getText().equals("Kayıtlı siparişiniz bulunmuyor."));











    }



}

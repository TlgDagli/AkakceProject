package AliKemal;

import Utility.BaseDriver;
import Utility.Myfunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AliKemal extends BaseDriver{
    @Test
    public void us_101() {
        driver.get("https://www.akakce.com/");
        Myfunc.Bekle(2);

        // US_101 //////////////////////////////////////////////////////////////////////////////////////////

        // Hesap aç
        WebElement hesapAc = driver.findElement(By.xpath("//a[@href='/akakcem/giris/?m=1&s=1']"));
        hesapAc.click();
        Myfunc.Bekle(2);

        // Ad girildi
        WebElement name = driver.findElement(By.xpath("//input[@id='rnufn']"));
        name.sendKeys("ali");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='rnufn']")));
        Myfunc.Bekle(2);

        // Soyad girildi
        WebElement lastName = driver.findElement(By.xpath("//input[@id='rnufs']"));
        lastName.sendKeys("cakıral");
        Myfunc.Bekle(2);

        // Mail girildi
        WebElement mail = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        mail.sendKeys("dranoispira@gmail.com");
        Myfunc.Bekle(2);

        // Mail tekrar girildi
        WebElement mailAgain = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        mailAgain.sendKeys("dranoispira@gmail.com");
        Myfunc.Bekle(2);

        // Şifre girildi
        WebElement password = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        password.sendKeys("Al56_snd<gıo");
        Myfunc.Bekle(2);

        // Şifre tekrar girildi
        WebElement passwordAgain = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        passwordAgain.sendKeys("Al56_snd<gıo");
        Myfunc.Bekle(2);

        // Cinsiyet seçildi
        WebElement sex = driver.findElement(By.xpath("//input[@id='rngm']"));
        sex.click();
        Myfunc.Bekle(2);

        // Şehir seçildi
        WebElement city = driver.findElement(By.xpath("//select[@id='locpr']"));
        city.sendKeys("İstanbul - Avrupa");
        Myfunc.Bekle(2);

        // İlçe seçildi
        WebElement district = driver.findElement(By.xpath("//select[@id='locds']"));
        district.sendKeys("Güngören");
        Myfunc.Bekle(2);

        // Doğum günü seçildi
        WebElement day = driver.findElement(By.xpath("//select[@id='bd']"));
        day.sendKeys("29");
        Myfunc.Bekle(2);

        // Doğum ayı seçildi
        WebElement month = driver.findElement(By.xpath("//select[@id='bm']"));
        month.sendKeys("7");
        Myfunc.Bekle(2);

        // Doğum yılı seçildi
        WebElement year = driver.findElement(By.xpath("//select[@id='by']"));
        year.sendKeys("1987");
        Myfunc.Bekle(2);

        // Kullanıcı sözleşmesi kabul edildi
        WebElement userAgreement = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        userAgreement.click();
        Myfunc.Bekle(2);

        // Kampanya seçildi
        WebElement campaigns = driver.findElement(By.xpath("//input[@id='rnufnee']"));
        campaigns.click();
        Myfunc.Bekle(2);

        // Hesap oluşturdu
        WebElement createAccount = driver.findElement(By.xpath("//input[@id='rfb']"));
        createAccount.click();
        Myfunc.Bekle(2);


        //================================================================================================//

        // US_102 //////////////////////////////////////////////////////////////////////////////////////////


            // Hesaba mail yazıldı
            WebElement mail1 = driver.findElement(By.xpath("//input[@id='life']"));
            mail1.sendKeys("dranoispira@gmail.com");
            Myfunc.Bekle(1);

            // Hesaba şifre yazıldı
            WebElement password1 = driver.findElement(By.xpath("//input[@id='lifp']"));
            password1.sendKeys("Al56_snd<gıo");
            Myfunc.Bekle(1);

            // Beni hatırla seçeneği işaretlendi
            WebElement rememberMe = driver.findElement(By.xpath("//input[@id='lifr']"));
            rememberMe.click();
            Myfunc.Bekle(1);

            // Giriş yap butonuna tıklandı
            WebElement login = driver.findElement(By.xpath("//input[@id='lfb']"));
            login.click();
            Myfunc.Bekle(1);

            // Profil linkine tıklandı
            WebElement profileLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/akakcem/']")));
            String userName = profileLink.getText();
            if (userName.equals("Ali")) {
                System.out.println("Başarıyla giriş yapıldı. Kullanıcı adı: " + userName);

            } else {
                System.out.println("Giriş başarısız veya kullanıcı adı hatalı: " + userName);
            }


        //================================================================================================//

        // US_103 //////////////////////////////////////////////////////////////////////////////////////////

        // Çıkışa  yönlendirme
        WebElement ac = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        ac.click();

        // Çıkış yap
        WebElement out = driver.findElement(By.xpath("//a[@href='#Çık']"));
        out.click();    //Çıkış yapılıyor

        // Giriş sayfasına geri dön
        WebElement profileLink2= driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        profileLink2.click();

        //================================================================================================//

        // US_104 //////////////////////////////////////////////////////////////////////////////////////////

        // Hesaba mail yazıldı
        WebElement mail2 = driver.findElement(By.xpath("//input[@id='life']"));
        mail2.sendKeys("dranoispira@gmail.com");
        Myfunc.Bekle(1);

        // Hesaba şifre yazıldı
        WebElement password2 = driver.findElement(By.xpath("//input[@id='lifp']"));
        password2.sendKeys("Al56_snd<gıo");
        Myfunc.Bekle(1);

        // Beni hatırla seçeneği işaretlendi
        WebElement rememberMe1 = driver.findElement(By.xpath("//input[@id='lifr']"));
        rememberMe1.click();
        Myfunc.Bekle(1);

        // Giriş yap butonuna tıklandı
        WebElement login1 = driver.findElement(By.xpath("//input[@id='lfb']"));
        login1.click();
        Myfunc.Bekle(1);

        // Çıkışa  yönlendirme
        WebElement ac1 = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        ac1.click();

        // Çıkış yap
        WebElement out1 = driver.findElement(By.xpath("//a[@href='#Çık']"));
        out1.click();    //Çıkış yapılıyor

        //================================================================================================//

        // US_105 //////////////////////////////////////////////////////////////////////////////////////////

        // Giriş sayfasına geri dön
        WebElement profileLink3= driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        profileLink3.click();

        // Hesaba mail yazıldı
        WebElement mail3 = driver.findElement(By.xpath("//input[@id='life']"));
        mail3.sendKeys("dranoispira@gmail.com");
        Myfunc.Bekle(1);

        // Hesaba şifre yazıldı
        WebElement password3 = driver.findElement(By.xpath("//input[@id='lifp']"));
        password3.sendKeys("Al56_snd<gıo");
        Myfunc.Bekle(1);

        // Beni hatırla seçeneği işaretlendi
        WebElement rememberMe2 = driver.findElement(By.xpath("//input[@id='lifr']"));
        rememberMe2.click();
        Myfunc.Bekle(1);

        // Giriş yap butonuna tıklandı
        WebElement login2 = driver.findElement(By.xpath("//input[@id='lfb']"));
        login2.click();
        Myfunc.Bekle(1);

        // Hasaba yönlendirme
        WebElement me = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        me.click();

        // Hesabım linkine tıklandı
        WebElement account = driver.findElement(By.xpath("//a[text()='Hesabım']"));
        account.click();

        // Siparişlerim linkine tıklandı
        WebElement order = driver.findElement(By.xpath("//a[text()='Siparişlerim']"));
        order.click();

        // Siparişlerim sayfası kontrol edildi
        WebElement orderList = driver.findElement(By.xpath("//div[@class='no-record']"));
        if (orderList.getText().equals("Kayıtlı siparişiniz bulunmuyor.")) {
            System.out.println("Siparişiniz bulunmamaktadır.");
        } else {
            System.out.println("Siparişiniz bulunmaktadır.");
        }

        // Kullanıcıya tıklandı
        WebElement ac2 = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        ac2.click();
        Myfunc.Bekle(2);

        // Çıkış yapıldı
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement out2 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='#Çık']")));
        out2.click();

        //================================================================================================//

        // US_106 //////////////////////////////////////////////////////////////////////////////////////////

        // Giriş sayfasına geri dön
        Myfunc.Bekle(2);
        WebElement profileLink4= driver.findElement(By.xpath("//a[@href='https://www.akakce.com/akakcem/giris/']"));
        profileLink4.click();

        // Hesaba mail yazıldı
        WebElement mail4 = driver.findElement(By.xpath("//input[@id='life']"));
        mail4.sendKeys("dranoispira@gmail.com");
        Myfunc.Bekle(1);

        // Hesaba şifre yazıldı
        WebElement password4 = driver.findElement(By.xpath("//input[@id='lifp']"));
        password4.sendKeys("Al56_snd<gıo");
        Myfunc.Bekle(1);

        // Beni hatırla seçeneği işaretlendi
        WebElement rememberMe3 = driver.findElement(By.xpath("//input[@id='lifr']"));
        rememberMe3.click();
        Myfunc.Bekle(1);

        // Giriş yap butonuna tıklandı
        WebElement profileLink5= driver.findElement(By.xpath("//input[@id='lfb']"));
        profileLink5.click();

        // Giriş sayfasına yönlenildi
        WebElement profileLink6= driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        profileLink6.click();

        // Sağ üst köşedeki kullanıcıya tıklandı
        WebElement ac3 = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        ac3.click();

        // Hesabım linkine tıklandı
        WebElement account1 = driver.findElement(By.xpath("//a[@href='/akakcem/']"));
        account1.click();

        // Mesajlarım linkine tıklandı
        WebElement message = driver.findElement(By.xpath("//a[@href='/akakcem/mesajlarim/']"));
        message.click();

        // Mesaj kutusu kontrol edildi
        WebElement messageBox = driver.findElement(By.xpath("//div[@class='wbb_v8']"));
        String messageText = messageBox.getText();

        if (messageText.isEmpty()) {
            System.out.println("Mesaj kutusu boş.");
        } else {
            System.out.println("Mesaj kutusunda içerik var: " + messageText);
        }

        // Kullanıcıya tıklandı
        WebElement ac4 = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        ac4.click();
        Myfunc.Bekle(2);

        // Çıkış yapıldı
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement out3 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='#Çık']")));
        out3.click();

        //================================================================================================//

        // US_107 //////////////////////////////////////////////////////////////////////////////////////////

        // Giriş sayfasına git
        WebElement profileLink7= driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        profileLink7.click();

        // Hesaba mail yazıldı
        WebElement mail5 = driver.findElement(By.xpath("//input[@id='life']"));
        mail5.sendKeys("dranoispira@gmail.com");
        Myfunc.Bekle(1);

        // Hesaba şifre yazıldı
        WebElement password5 = driver.findElement(By.xpath("//input[@id='lifp']"));
        password5.sendKeys("Al56_snd<gıo");
        Myfunc.Bekle(1);

        // Beni hatırla seçeneği işaretlendi
        WebElement rememberMe4 = driver.findElement(By.xpath("//input[@id='lifr']"));
        rememberMe4.click();
        Myfunc.Bekle(1);

        // Giriş yap butonuna tıklandı
        WebElement profileLink8= driver.findElement(By.xpath("//input[@id='lfb']"));
        profileLink8.click();
        Myfunc.Bekle(1);

        // Hesap ayarlarına git
        WebElement ac5 = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        ac5.click();

        // Hesap tıkla
        WebElement account2 = driver.findElement(By.xpath("//a[@href='/akakcem/']"));
        account2.click();
        Myfunc.Bekle(4);

        // Hesap iptal tıkla
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement myAccountDelete1 = driver.findElement(By.xpath("//a[@href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        wait2.until(ExpectedConditions.elementToBeClickable(myAccountDelete1));
        myAccountDelete1.click();

        // Şifre girildi
        WebElement passwordDelete = driver.findElement(By.xpath("//input[@id='p']"));
        passwordDelete.sendKeys("Al56_snd<gıo");
        Myfunc.Bekle(1);

        // Hesabı sil
        WebElement deleteAccount = driver.findElement(By.xpath("//input[@id='u']"));
        deleteAccount.click();


    }
}


package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {
    public static void main(String[] args) {
        /*
            a.web sayfasına gidin. https://www.amazon.com/
            Search(ara) “city bike”
            Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
            Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        a.web sayfasına gidin. https://www.amazon.com/
        driver.get(" https://www.amazon.com/");
//        Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
//        Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());//Web elementlerini testb etmek icin getText() i kullaniyoruz
//        Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    }
}

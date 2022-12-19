package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetmetohods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon saYFAsina gidelm
        driver.get("https://amazon.com");
        //Search bolumunu locate edip ,iphone aratalim
       // WebElement aramaBolumu=driver.findElement(By.id("twotabsearchtextbox"));
       // aramaBolumu.sendKeys("iphone", Keys.ENTER);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Arama sonuc yazisinda iphone yazisini locate edip konsola yazdiralim
        WebElement aramaSonucYazisi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());//Web elementlerini testb etmek icin getText() i kullaniyoruz
        //Sayfayi kapatalm
        driver.close();

    }
}

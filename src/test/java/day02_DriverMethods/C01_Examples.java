package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        /*
            İlk once browser'i maximize yapalim sonra tum sayfa icn max bekleme suresi olarak 15 sn belirtelim
            Sırasiyla amazon ,facebook,ve youtube sayfalarina gidelim.
            Amazon sayfasina tekrar donelim.
            Amozon sayfasinin Url!inin https://www.amazon.com/ adresine esit oldugunu test edelim
            Sayfanin konumunu  ve size!ini yazdiralim.
            Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
            ve İstedigimiz sekilde oldugunu test edelim.
            Sayfayi kapatalim.
         */
        //             Browser 'i avcalim
                          WebDriver driver=new ChromeDriver();
        //             browser'i maximize yapalim sonra tum sayfa icn max bekleme suresi olarak 15 sn belirtelim
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //            Sırasiyla amazon ,facebook,ve youtube sayfalarina gidelim.
                        driver.get("https://www.amazon.com/");
                        driver.get("https://www.facebook.com/");
                        driver.get("https://www.youtube.com/");
        //            Amazon sayfasina tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();
        //            Amozon sayfasinin Url!inin https://www.amazon.com/ adresine esit oldugunu test edelim
        String url=driver.getCurrentUrl();
        if (url.contains(" https://www.amazon.com/")){
            System.out.println("passed");
        }else System.out.println("failed");
        //            Sayfanin konumunu  ve size!ini yazdiralim.
        System.out.println("getPosition :"+driver.manage().window().getPosition());;
        System.out.println("getSize :"+driver.manage().window().getSize());
        //            Sayfanin konumunu ve size'ini istedigimiz sekilde ayarlayalim
        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
        System.out.println("getPosition :"+driver.manage().window().getPosition());;
        System.out.println("getSize :"+driver.manage().window().getSize());
        //            ve İstedigimiz sekilde oldugunu test edelim.
        Dimension actualNewSize=driver.manage().window().getSize();
        if (actualNewSize.getWidth()==600&& actualNewSize.getHeight()==600){
            System.out.println("passed");
        }else System.out.println("failed");
        Point actualNewPosition=driver.manage().window().getPosition();
        if (actualNewPosition.getX()==50&&actualNewPosition.getY()==50){
            System.out.println("New positon test passed");
        }else System.out.println("New positon test Failed");
        //            Sayfayi kapatalim.
        driver.close();
    }
}

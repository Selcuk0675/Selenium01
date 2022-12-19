package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ManageMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();//Bos bir browswer actik

            //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("Sayfanib Boyutlari"+driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().maximize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("Sayfanib Boyutlari"+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin konumu"+driver.manage().window().getPosition());
        System.out.println("Sayfanib Boyutlari"+driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}

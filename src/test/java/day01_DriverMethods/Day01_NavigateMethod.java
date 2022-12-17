package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();//Browseri actil
        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        //Hepsiburada Sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");
        //tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();//back to amazon
        //tekrar Hepsiburada sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//go to techpro
        //Son sayfada sayfayi yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Ve sayfayi kapatalim
        driver.close();
        /*
        get(), belirli bir URL’de (web sitesinde) gezinmek ve
        sayfa yüklenene kadar beklemek için kullanılır. sürücü. Navigation(),
        belirli bir URL’ye gitmek için kullanılır ve sayfanın yüklenmesini beklemez
         */


    }
}

package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {
    /*

       Amazon sayfasina gidelim. https://www.amazon.com/
       Sayfa basligini(title) yazdirin
       Sayfa basliginin “Amazon” icerdigini test edin
       Sayfa adresini(url) yazdirin
       Sayfa url’inin “amazon” icerdigini test edin.
       Sayfa handle degerini yazdirin
       Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
       Sayfayi kapatin.
     */
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();//Bos bir browswer actik
        driver.get("https://www.amazon.com");

        System.out.println("Sayfa Basligi"+driver.getTitle());
        String actualTitle= driver.getTitle();
        if (actualTitle.contains("Amazon")){
            System.out.println("title tests passed");
        }else System.out.println("test failed");

        System.out.println("Sayfa url!i"+driver.getCurrentUrl());
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains("amozon")){
            System.out.println("Url tests Passef");
        }else System.out.println("Url tests  failed");

        String sayfaKodlari=driver.getPageSource();
        if (sayfaKodlari.contains("Gateway")){
            System.out.println("Source Code tests Passed");
        }else System.out.println("Source Code tests failed");

        driver.close();


    }
}

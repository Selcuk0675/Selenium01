package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();//Bos bir browswer actik
        driver.get("https://www.amazon.com");//ilk olarak gitmek istedigimiz sayfayi belirtiriz
        System.out.println(" Sayfa Basligi"+driver.getTitle());
        System.out.println("Sayfa url si===> "+driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());//Bize o window!a ait hash degerini verir.Biz bu Hash degerlerini
                                                      // bir stringe atayip pencereler arasi gecis yapabiliriz

    }
}

package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amozon sayfasina gidelim
        driver.get("https://amazon.com");
        // search bolumunu locate edelim
        //WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));//burda search bolumunu locate ettik
        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));//burda search bolumunu locate ettik
        // Search bolumunde iphone aratalim
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

        /*
            Eger bir webelementi (Web sayfasindaki herbir buton yada text/yazili) locate (konumu belirleme)
            etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
            karsimiza cikan html kodlarindan locater'lardan (konumu belirleyiciler) essiz olani seceriz.
            Genellikle id Attribute'u kullanilir.Sectigimiz attribute degerini findElement() methodu icine
            findelement(By.id("atribute degeri")) seklinde yazariz
         */
        //Amozon sayfasindaki <input> ve <a> tag'larinn sayisini yazdiriniz
        List<WebElement> inputTag=driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayisi"+inputTag.size());

        //Not list kullanacagimiz zaman findElements kullaniriz


        List<WebElement> LinklerList=driver.findElements(By.tagName("a"));
        System.out.println("LinklerList.size() = " + LinklerList.size());
      for (WebElement w :LinklerList){
          System.out.println(w.getText());
      }
        //linklerList.stream().forEach(t-> System.out.println(t.getText()));






    }
}

package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class WebDriverFactory {

    public static void main(String[] args) {
      //ödev
     //static bir method oluştur, ismi getDriver olsun, parametresi browserType
     //Parametreye göre 'chrome'yazarsak chromedriver,'firefox' yazarsak firefoxdriver olsun
     //methodun return type driver olsun

    }
    public static WebDriver getDriver(String browserType ){
        WebDriver driver=null;
        switch (browserType.toLowerCase(Locale.ROOT)){
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                 driver=new ChromeDriver();
                 break;
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

        }
        return driver;

    }
}

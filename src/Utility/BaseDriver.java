package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static E_Junkie_Elements eje;

    @BeforeClass
    public void InitialProcedure() { // TearStart böyle deniyor

        driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(-1000, 0));

        //driver.manage().window().maximize(); // Ekranı max yapıyor.

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // 15 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        eje = new E_Junkie_Elements();
        LoginTest();
    }

    @AfterClass
    public void CloseProcedure() { // TearDown
        System.out.println("CloseProcedure");
        Tools.wait(2);
        driver.quit();
    }

    public void LoginTest() {
        System.out.println("Test Started");
        driver.get("https://shopdemo.e-junkie.com/");
        Tools.wait(1);
        System.out.println("Test Finished");
    }
}

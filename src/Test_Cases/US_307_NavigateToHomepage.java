package Test_Cases;

import Utility.BaseDriver;
import Utility.E_Junkie_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_307_NavigateToHomepage extends BaseDriver {
    @Test
    public void NavigateToHomepage() {

        // Click Navigation Bar logo, check for if it's navigates to the homepage
        eje.homePageBtn.click();
        wait.until(ExpectedConditions.urlToBe("https://shopdemo.e-junkie.com/"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://shopdemo.e-junkie.com/");

        WebElement closeBox = driver.findElement(By.cssSelector("div[class=\"columns is-mobile\"] a[href=\"/\"]"));
        closeBox.click();

    }
}

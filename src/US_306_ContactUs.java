import Utility.BaseDriver;
import Utility.E_Junkie_Elements;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_306_ContactUs extends BaseDriver {
    @Test
    public void ContactUs() {

        // Click Contact Us button on the homepage
        eje.contactUsBtn.click();

        wait.until(ExpectedConditions.urlToBe("https://shopdemo.e-junkie.com/contact"));

        // Contact Us Info
        eje.contactUsName.sendKeys("Radames Forst");
        eje.contactUsEmail.sendKeys("pegah_warringtonf@poverty.jc");
        eje.contactUsSubject.sendKeys("dayton");
        eje.contactUsMessage.sendKeys("Transfers sublime dropped turkish second chess marcus");

        // Switch Recaptcha frame and Click Recaptcha
        driver.switchTo().frame(eje.recaptchaFrame);
        eje.recaptchaBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(eje.recaptchaIMGFrame);

        // Take the Recaptcha images list and click
        List<WebElement> img = driver.findElements(By.cssSelector("div[class=\"rc-image-tile-wrapper\"] img:nth-child(1)"));
        img.get(0).click();

        // Click Verify button
        wait.until(ExpectedConditions.visibilityOf(eje.recaptchaVerifyBtn));
        eje.recaptchaVerifyBtn.click();

        WebElement warning = driver.findElement(By.xpath("//div[@class=\"rc-imageselect-error-select-more\"]"));

        // Assertion for Recaptcha works correctly
        Assert.assertTrue(warning.getText().contains("Lütfen tüm eşleşen resimleri seçin."));

    }

}

import Utility.BaseDriver;
import Utility.E_Junkie_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class US_301_AddToCart extends BaseDriver {
    @Test
    public void AddToCart() {

        // add e-book to the cart
        eje.addToCartBtn.click();

        // click promo code button
        WebElement cartFrame = driver.findElement(By.xpath("//iframe[@class=\"EJIframeV3 EJOverlayV3\"]"));
        driver.switchTo().frame(cartFrame);
        eje.addPromoCodeBtn.click();


        //fill promo code placaholder and apply button
        eje.promoCodePlc.sendKeys("23545");
        eje.promoCodeApplyBtn.click();

        wait.until(ExpectedConditions.visibilityOf(eje.invalidPromoCodeTxt));
        Assert.assertEquals(eje.invalidPromoCodeTxt.getText(), "Invalid promo code");

    }

}

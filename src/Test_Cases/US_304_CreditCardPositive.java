package Test_Cases;

import Utility.BaseDriver;
import Utility.E_Junkie_Elements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_304_CreditCardPositive extends BaseDriver {
    @Test
    public void CreditCardPositive() {

        // add e-book to the cart
        eje.addToCartBtn.click();

        // click promo code button
        driver.switchTo().frame(eje.checkoutFrame);
        eje.payDebitBtn.click();


        // Filling the Credit Card Information
        driver.switchTo().frame(eje.cardNumPlcFrame); // switch to the credit card frame

        eje.cardNumberPlc.sendKeys("4242 4242 4242 4242");
        eje.cardExpirationDate.sendKeys("12 24");
        eje.cardCVC.sendKeys("000");

        driver.switchTo().parentFrame(); // return to the parent frame

        // Invoice information placeholders
        eje.emailPlc.sendKeys("ıban_swaniganax7@principal.kdr");
        eje.confirmEmailPlc.sendKeys("ıban_swaniganax7@principal.kdr");
        eje.nameOnCardPlc.sendKeys("Hebah Vaughan");
        eje.payBtn.click();

        // Wait and assert for confirmation message
        wait.until(ExpectedConditions.visibilityOf(eje.orderConfirmMessage));
        Assert.assertTrue(eje.orderConfirmMessage.getText().contains("Hebah, your order is confirmed. Thank you!"));

    }

}

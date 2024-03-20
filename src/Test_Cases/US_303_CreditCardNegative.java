package Test_Cases;

import Utility.BaseDriver;
import Utility.E_Junkie_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_303_CreditCardNegative extends BaseDriver {
    @Test
    public void CreditCardNegative() {

        // add e-book to the cart
        eje.addToCartBtn.click();

        // click Pay Debit button
        driver.switchTo().frame(eje.checkoutFrame);
        eje.payDebitBtn.click();

        // Switch frame to the Card Information Frame
        driver.switchTo().frame(eje.cardNumPlcFrame);

        // Fill with the wrong credentials
        eje.cardNumberPlc.sendKeys("1111 1111 1111 1111");
        driver.switchTo().parentFrame();

        // Check if warning shows up
        Assert.assertEquals(eje.invalidCardNumTxt.getText(), "Kart numaranız geçersiz.");

    }
}

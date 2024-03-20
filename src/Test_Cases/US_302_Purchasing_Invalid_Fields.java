package Test_Cases;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_302_Purchasing_Invalid_Fields extends BaseDriver {
    @Test
    public void PurchasingInvalidFields() {

        // add e-book to the cart
        eje.addToCartBtn.click();

        // click Pay Debit button
        WebElement cartFrame = driver.findElement(By.xpath("//iframe[@class=\"EJIframeV3 EJOverlayV3\"]"));
        driver.switchTo().frame(cartFrame);
        eje.payDebitBtn.click();

        // Click pay button and assert warning box text
        eje.payBtn.click();
        String[] invalid_fields = eje.invalidPaymentDetailsTxt.getText().split("\n");
        for (String txt : invalid_fields) {
            Assert.assertTrue(eje.invalidPaymentDetailsTxt.getText().contains(txt));
        }

    }

}

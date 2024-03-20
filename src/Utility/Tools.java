package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools extends BaseDriver {
    public static void wait(int sn) {

        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void JSClick(WebElement e) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.driver;
        js.executeScript("arguments[0].click();", e); // js click : sayfanın içinden click
    }

    public static int randomGenerator(int range) {
        return (int) (Math.random() * range);
    }

    public static boolean ListContainsString(List<WebElement> list, String aranacak) {
        boolean isFound = false;
        for (WebElement e : list) {
            if (e.getText().equalsIgnoreCase(aranacak))
                isFound = true;
        }

        return isFound;
    }

}

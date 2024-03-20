import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_308_AccessToVideo extends BaseDriver {
    @Test
    public void AccessToVideo() {

        // Navigate to the Wiki site
        eje.eJunkieWikiSite.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.e-junkie.com/"));

        // Click How It Works button
        eje.seeHiwBtn.click();

        // Switch to the video frame
        driver.switchTo().frame(eje.videoFrame);

        // Assert for button and click
        Assert.assertTrue(eje.playVideoBtn.isDisplayed());
        eje.playVideoBtn.click();

    }

}

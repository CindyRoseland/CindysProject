package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ConfigReader;
import utilities.Waiter;

public class DiscoverTest extends Base {


    @Test(testName = "Validate  the APR for Cash Advances is greater than 20%")
    public void ValidateTheAPRCashAdvancesIsGreaterThan20Percentage() {

        driver.get(ConfigReader.getProperty("discoverURL"));

        discoverHomePage.creditCardsIcon.click();
        discoverHomePage.applyNow.click();
        Waiter.waitForWebElementToBeVisible(driver, 3, discoverHomePage.skipThisTestLink);
        discoverHomePage.skipThisTestLink.click();

        String aprRate = discoverHomePage.aprRate.getText().replace("%", "");
        Assert.assertTrue(Integer.parseInt(aprRate) > 20 , " the APR for Cash Advances is greater than 20%");
    }
}

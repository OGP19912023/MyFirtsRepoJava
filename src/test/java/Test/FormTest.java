package Test;

import Steps.*;
import Utilities.Base_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FormTest {
    public ChromeDriver driver = new ChromeDriver();

    @BeforeSuite
    public void setting() {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Base_1.UtilsDriver.CHROME_DRIVER_LOCATION);
        driver.get(Base_1.UtilsDriver.BASE_URL);
    }

    @Test
    public void submitForm() {

        FormSteps actions = new FormSteps(driver);
        actions.enterFirstName();
        actions.enterLastName();
        actions.enterJob();
        actions.click_sex();
        actions.click_highest_level_of_education();

    }

    @AfterSuite
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}

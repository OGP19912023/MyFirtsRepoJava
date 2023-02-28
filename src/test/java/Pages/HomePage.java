package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "first-name")
    public WebElement first_name;
    @FindBy(id = "last-name")
    public WebElement last_name;
    @FindBy(id = "job-title")
    public WebElement job_title;

    @FindBy(xpath = "//input[@id='radio-button-2']")
    public WebElement college;

}

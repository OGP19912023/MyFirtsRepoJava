package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    protected ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first-name")
    public WebElement first_name;
    @FindBy(id = "last-name")
    public WebElement last_name;
    @FindBy(id = "job-title")
    public WebElement job_title;

    @FindBy(xpath = "//input[@id='checkbox-1']")
    public WebElement college;
    @FindBy(xpath = "//input[@id='radio-button-2']")
    public WebElement sex;

}

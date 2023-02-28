package Steps;
import Pages.HomePage;
public class FormSteps extends HomePage {

    public void enterFirstName (){
        String First_Name = "Oswaldo";
        this.first_name.sendKeys(First_Name);
    }

    public void enterLastName (){
        String Last_Name = "Galicia";
        this.last_name.sendKeys(Last_Name);
    }

    public void enterJob (){
        String Name_Job = "Automation";
        this.job_title.sendKeys(Name_Job);
    }

    public void click_highest_level_of_education (){
        this.college.click();
    }
}

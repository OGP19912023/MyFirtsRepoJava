package Test;
import Steps.*;
import org.testng.annotations.Test;

public class FormTest {

    @Test
    public void submitForm(){

        FormSteps actions = new FormSteps();

        actions.enterFirstName();
        actions.enterLastName();
        actions.enterJob();
        actions.click_highest_level_of_education();

    }


}

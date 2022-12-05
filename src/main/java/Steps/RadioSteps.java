package Steps;


import Pages.RadioPage;
import io.qameta.allure.Step;

public class RadioSteps {
    RadioPage radioPage = new RadioPage();
    @Step
    public void chooseFemale() {
        radioPage.optionFemale.click();
    }
}

import org.testng.annotations.Test;
import Steps.RadioSteps;

import static com.codeborne.selenide.Selenide.open;

public class RadioTests extends Configs {
    RadioSteps radioSteps = new RadioSteps();
    @Test
    public void chooseFemale() {
        open("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
        radioSteps.chooseFemale();
    }
}

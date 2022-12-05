import com.codeborne.selenide.SelenideElement;
import Data.CheckboxTestData;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.CheckboxTestSteps;
import static com.codeborne.selenide.Selenide.open;
@Epic("CheckBox")
public class CheckBoxTests extends Configs {
    CheckboxTestSteps checkboxTestSteps = new CheckboxTestSteps();
    CheckboxTestData checkboxTestData = new CheckboxTestData();
@BeforeMethod
public void openLink() {
    open("https://www.lambdatest.com/selenium-playground/checkbox-demo");
}
    //with POM
    @Test(description = "text validation scenario with correct text")
    @Description("click on checkbox and validate value of message text")
    @Feature("value validation")
    @Story("correct text")
    @Severity(SeverityLevel.NORMAL)
    public void validateText() {
        checkboxTestSteps.clickOnCheckbox()
                .validateText(checkboxTestData.message);
    }
    @Test(description = "text validation scenario with incorrect text")
    @Description("click on checkbox and validate value of message text")
    @Feature("value validation")
    @Story("incorrect text")
    @Severity(SeverityLevel.NORMAL)
    public void validateTextNegative() {
        checkboxTestSteps.clickOnCheckbox()
                .validateTextNegative(checkboxTestData.negative);
    }
    @Test(description = "text is visible scenario")
    @Description("click on checkbox and validate message text is visible")
    @Feature("visibility validation")
    @Severity(SeverityLevel.NORMAL)
    public void validateTextIsVisible() {
        checkboxTestSteps.clickOnCheckbox()
                .validateTextIsVisible();
    }

}
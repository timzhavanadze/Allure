package Steps;


import Pages.CheckboxTestPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.exactText;

public class CheckboxTestSteps {
    CheckboxTestPage checkboxTestPage = new CheckboxTestPage();
    @Step("click on checkbox")
    public CheckboxTestSteps clickOnCheckbox() {
        checkboxTestPage.isSelectedCheckbox.click();
        return this;
    }
    @Step("validate text is correct {0}")
    public CheckboxTestSteps validateText(String text) {
        checkboxTestPage.successText.shouldHave(exactText(text));
        return this;
    }
    @Step
    public CheckboxTestSteps validateTextNegative(String text) {
        checkboxTestPage.successText.shouldNotHave(exactText(text));
        return this;
    }
    @Step
    public CheckboxTestSteps validateTextIsVisible() {
        checkboxTestPage.successText.shouldBe(enabled);
        return this;
    }
}

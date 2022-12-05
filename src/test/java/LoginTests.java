import Steps.DashboardSteps;
import Steps.LoginSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
@Listeners(Configs.class)
public class LoginTests extends Configs{
    LoginSteps loginSteps = new LoginSteps();
    DashboardSteps dashboardSteps = new DashboardSteps();

//failed test
    @Test(description = "Login Scenario")
    @Description("Success login scenario")
    @Story("Valid username and password login test")
    @Severity(SeverityLevel.CRITICAL)
    public void successLogin(){
        open("https://www.google.com/");
         loginSteps.setUserName()
                 .setPassword();
         dashboardSteps.validateWelcomeText();
    }
    @Test(enabled = false)
    @Severity(SeverityLevel.TRIVIAL)
    public void skipTest(){
        open("https://www.google.com/");
        loginSteps.setUserName()
                .setPassword();
        dashboardSteps.validateWelcomeText();
    }
}

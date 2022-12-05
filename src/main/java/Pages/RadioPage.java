package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RadioPage {
    public SelenideElement optionFemale= $(By.xpath("//input[@value='Female']"));
}

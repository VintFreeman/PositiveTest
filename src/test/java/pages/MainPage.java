package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement loginButton = $(By.xpath("//a[@class='login-button']"));

    public void chackVisibleLoginButton() {
        loginButton.shouldBe(Condition.visible);
    }
}

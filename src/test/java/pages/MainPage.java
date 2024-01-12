package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement status = $(By.xpath("//h3[@class='mr-2']"));
    private final SelenideElement loginFild = $(By.xpath("//input[@type='text']"));
    public void inputData() {
        loginFild.setValue("Alexeygarmanov@inbox.ru");
        loginFild.sendKeys(Keys.TAB);
        passwordFild.setValue("Emerald100");
        passwordFild.sendKeys(Keys.ENTER);
    }

    public void checkStatus() {
        status.shouldBe(Condition.visible);
    }
    private final SelenideElement passwordFild = $(By.xpath("//input[@type='password']"));

    private final SelenideElement loginButton = $(By.xpath("//a[@class='login-button']"));


    public void clickLoginButton() {
        loginButton.click();
    }
}

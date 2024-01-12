package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class ExampleUiTest extends BaseTest {

    @Test
    @DisplayName("Успешное прохождение аутентификации")
    void testOpenMainPage() {

        MainPage MainPage = new MainPage();
        MainPage.clickLoginButton();
        MainPage.inputData();
        MainPage.checkStatus();
    }


}

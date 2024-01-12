package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class ExampleUiTest extends BaseTest {

    @Test
    @DisplayName("Открытие главной страницы сайта")
    void testOpenMainPage() {



        new MainPage()
                .chackVisibleLoginButton();


    }
}

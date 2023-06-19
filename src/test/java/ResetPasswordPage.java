import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ResetPasswordPage {
    private SelenideElement forgotYourPassword = $(byXpath("//div[@class='orangehrm-login-forgot']/p"));


    public void forgotGoToTheReset() {
        resetPassword.shouldHave(text("requestPasswordResetCode"));

    }
}
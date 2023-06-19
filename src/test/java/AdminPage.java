import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class AdminPage {
    private SelenideElement addButton = $(byClassName("oxd-button oxd-button--medium oxd-button--secondary"));
}

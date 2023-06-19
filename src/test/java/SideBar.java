import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Collections;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SideBar {

   private SelenideElement searchInput = $(byCssSelector(“[placeholder='Search']”));

    private ElementsCollection sideBarCollection = $$(byClassName("oxd-text oxd-text--span oxd-main-menu-item--name"));

    //private SelenideElement adminLink = $(byClassName("oxd-text oxd-text--span oxd-main-menu-item--name"));

    public void allElementIsVisible() {
        for (SelenideElement elementSideBar:
                sideBarCollection)
            sideBarCollection.filterBy(visible).shouldHave(CollectionCondition.size(11));

    }
}


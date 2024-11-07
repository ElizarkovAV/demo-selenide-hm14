package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class EventsPage {

    SelenideElement pageTitle = $(byTagName("h1"));

    @Step("Проверить отображение и содержаени заголовка страницы")
    public EventsPage checkTitle() {
        pageTitle.shouldBe(visible);
        pageTitle.shouldHave(text("СОБЫТИЯ"));
        return this;
    }
}

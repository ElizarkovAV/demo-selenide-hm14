package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class MediaPage {

    SelenideElement pageTitle = $(byTagName("h1"));

    @Step("Проверка отображения и содержания заголовка страницы Медиа")
    public MediaPage checkPageTitle() {
        pageTitle.shouldBe(visible);
        pageTitle.shouldHave(text("МЕДИА"));
        return this;
    }
}

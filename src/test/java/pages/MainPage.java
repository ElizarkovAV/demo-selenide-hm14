package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement technologyHeaderSpan = $(byTagAndText("span", "Технологии")),
            techPrinciplesLink = $(byAttribute("href", "/technology/tech_principles/")),
            strategyLink = $(byAttribute("href", "/technology/strategy/")),
            workWithUsHeaderSpan = $(byTagAndText("span", "Работа у нас")),
            joinUsLink = $(byAttribute("href", "/career/join_us/")),
            tourLink = $(byAttribute("href", "/career/tour/")),
            pageTitle = $(byTagName("h1")),
            mediaHeaderLink = $(byAttribute("href", "/media/")),
            eventsHeaderLink = $(byAttribute("href", "/events/"));

    @Step("Проверка отображения и содержания заголовка главной страницы")
    public MainPage checkPageTitle() {
        pageTitle.shouldBe(visible);
        pageTitle.shouldHave(text("СЕРДЦЕ ЦИФРОВОЙ ЭКОСИСТЕМЫ МТС"));
        return this;
    }

    @Step("Открыть главную страницу")
    public MainPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Навести курсор на надпись Технологии в шапке страницы")
    public MainPage hoverToTechnologyText() {
        technologyHeaderSpan.hover();
        return this;
    }

    @Step("Навести курсор на надпись Работа у нас в шапке страницы")
    public MainPage hoverToWorkWithUsText() {
        workWithUsHeaderSpan.hover();
        return this;
    }

    @Step("Проверить что при наведении на Технологии выпадающее меню содержит две ссылки Тех. принципы и Стратегия")
    public MainPage checkTechnologyDropdownMenuLinks() {
        techPrinciplesLink.shouldBe(visible);
        strategyLink.shouldBe(visible);
        return this;
    }

    @Step("Проверить что при наведении на Работа у нас выпадающее меню содержит две ссылки Присоединяйся и тур")
    public MainPage checkWorkWithUsDropdownLinks() {
        joinUsLink.shouldBe(visible);
        tourLink.shouldBe(visible);
        return this;
    }

    @Step("Перейти на страницу Медиа по ссылки в шапке главной страницы")
    public MediaPage openMediaPageByHeaderLink() {
        mediaHeaderLink.click();
        return new MediaPage();
    }

    @Step("Перейти на страницу События по ссылке в шапке главной страницы")
    public EventsPage openEventsPageByHeaderLink() {
        eventsHeaderLink.click();
        return new EventsPage();
    }
}

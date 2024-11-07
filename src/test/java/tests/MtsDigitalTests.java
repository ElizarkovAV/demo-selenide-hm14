package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.EventsPage;
import pages.MainPage;
import pages.MediaPage;

@Tag("MTS Digital tests")
public class MtsDigitalTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка отображения и содержания заголовка главной страницы")
    void checkMainPageTitle() {
        mainPage.openMainPage()
                .checkPageTitle();
    }

    @Test
    @DisplayName("Проверка ссылок выпадающего меню Технологии в шапке сайта")
    void checkLinksInTheTechnologyDropdownHeaderTest() {
        mainPage.openMainPage()
                .hoverToTechnologyText()
                .checkTechnologyDropdownMenuLinks();
    }

    @Test
    @DisplayName("Проверка ссылок выпадающего меню Работа у нас в шапке сайта")
    void checkLinksInTheWorkWithUsDropdownHeaderTest() {
        mainPage.openMainPage()
                .hoverToWorkWithUsText()
                .checkWorkWithUsDropdownLinks();
    }

    @Test
    @DisplayName("Открыть страницу Медиа по ссылки в шапке страницы. Проверить отображение заголовка  Медиа")
    void openMediaPageCheckTitleTest() {
        MediaPage mediaPage = mainPage.openMainPage()
                                      .openMediaPageByHeaderLink();
        mediaPage.checkPageTitle();
    }

    @Test
    @DisplayName("Открыть страницу События по ссылке в шапке страницы. Проверить отображение заголовка События")
    void openEventsPageCheckTitleTest() {
        EventsPage eventsPage = mainPage.openMainPage()
                                        .openEventsPageByHeaderLink();
        eventsPage.checkTitle();
    }
}

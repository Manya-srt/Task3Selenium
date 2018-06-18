package steps;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

    public class MainPageSteps extends BaseSteps {
        @Step("Выбран пункт меню - Застраховать")
        public void stepSelectMainMenu(String menuItem) {
            new MainPage(driver).selectMainMenu(menuItem);
        }
        @Step("Выбран пункт меню - Страхование путешественников")
        public void setSelectSubMenu(String путешествия_и_покупки) {
            new MainPage(driver).selectSubMenu(driver);
        }
    }
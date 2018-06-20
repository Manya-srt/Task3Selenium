package steps;

import pages.ProgramChoicePage;
import ru.yandex.qatools.allure.annotations.Step;

public class ProgramChoicePageSteps extends BaseSteps {

    @Step("Выбор суммы страховой защиты")
    public void selectSum (String menuItem){
        new ProgramChoicePage(driver).summa.click();
    }

    @Step("Нажатие кнопки - Оформить")
    public void stepIssueButton(){
        new ProgramChoicePage(driver).issueButton.click();
    }
}
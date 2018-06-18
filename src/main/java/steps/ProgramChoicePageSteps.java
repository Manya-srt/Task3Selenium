package steps;

import pages.ProgramChoicePage;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

public class ProgramChoicePageSteps extends BaseSteps {
    @Step("Выбор суммы страховой защиты")
    public void selectSum (){
        WebElement select = new ProgramChoicePage().selectSum;
        new ProgramChoicePage().waitAppearence(select);
        new ProgramChoicePage().selectSum.click();
    }

    @Step("Нажатие кнопки - Отправить")
    public void issueButton(){
        new ProgramChoicePage().sendAppBtn.click();
    }
}
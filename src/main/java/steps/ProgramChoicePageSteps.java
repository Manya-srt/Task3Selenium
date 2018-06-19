package steps;

import pages.ProgramChoicePage;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

public class ProgramChoicePageSteps extends BaseSteps {
    @Step("Выбор суммы страховой защиты")
    public void selectSum (){
        new ProgramChoicePage(driver).summa.click();
    }

    @Step("Нажатие кнопки - Отправить")
    public void issueButton(){
        new ProgramChoicePage(driver).issueButton.click();
    }
}
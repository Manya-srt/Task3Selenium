package steps;

import pages.BlanckPage;
import ru.yandex.qatools.allure.annotations.Step;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BlanckPageSteps extends BaseSteps {

    @Step("Поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value) {
        new BlanckPage(driver).fillField(field, value);
    }

    @Step("Заполняются поля:")
    public void stepFillFields(HashMap<String, String> fields) {
        fields.forEach(this::stepFillField);
    }

    @Step("Поле {0} заполнено значением {1}")
    public void stepCheckFillField(String field, String value) {
        String actual = new BlanckPage(driver).getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("Поля заполнены верно:")
    public void stepCheckFillFields(HashMap<String, String> fields) {
        fields.forEach(this::stepCheckFillField);
    }

    @Step("Выполнено нажатие на кнопку - Продолжить")
    public void continueButton() {
        new BlanckPage(driver).continueButton.click();
    }

    @Step("Выполнена проверка наличия ошибки на странице")
    public void checkErrorMessageField(String expectedErrorMessage) {
        String actualErrorMessage = new BlanckPage(driver).errorMessage.getText();
        assertEquals(String.format("Заголовок равен [%s]. Ожидалось - [%s]", actualErrorMessage, expectedErrorMessage),
                expectedErrorMessage, actualErrorMessage);
    }
}
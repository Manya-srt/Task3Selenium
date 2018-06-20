import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

    public class Task3Test extends BaseSteps {

        MainPageSteps mainPageSteps = new MainPageSteps();
        InsurancePageSteps insurancePageSteps =new InsurancePageSteps();
        ProgramChoicePageSteps programChoicePageSteps = new ProgramChoicePageSteps();
        BlanckPageSteps blanckPageSteps = new BlanckPageSteps();


        HashMap<String, String> testData = new HashMap<>();

        @Title("Заявка на страхование")
        @Test
        public void Test(){

            // Фамилию и Имя, Дату рождения застрахованных
            testData.put("Застрахованные: Фамилия", "Smirnova");
            testData.put("Застрахованные: Имя", "Anna");
            testData.put("Застрахованные: Дата рождения", "12.11.1990");

            // Данные страхователя: Фамилия, Имя, Отчество, Дата рождения, Пол
            testData.put("Фамилия", "Смирнова");
            testData.put("Имя", "Олеся");
            testData.put("Отчество", "Петровна");
            testData.put("Дата рождения", "13.05.1987");

            // Паспортные данные
            testData.put("Серия паспорта", "5204");
            testData.put("Номер паспорта", "424578");
            testData.put("Дата выдачи", "02.06.2014");
            testData.put("Место выдачи", "ОУФМС России по г. Новосибирск");

            // Контактные данные не заполняем

            mainPageSteps.selectMainMenu("Страхование");
            mainPageSteps.selectSubMenu("Путешествия и покупки");

            insurancePageSteps.stepCheckTitle("Страхование путешественников");
            insurancePageSteps.stepSendButton();
            insurancePageSteps.switchWindow();

            programChoicePageSteps.selectSum();
            programChoicePageSteps.stepIssueButton();


            blanckPageSteps.stepFillFields(testData);
            blanckPageSteps.stepCheckFillFields(testData);
            blanckPageSteps.continueButton();
            blanckPageSteps.stepPhone("Номер телефона вводится в 10-ти значном формате");
        }
    }
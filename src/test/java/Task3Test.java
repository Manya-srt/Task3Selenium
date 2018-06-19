import steps.*;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import java.util.HashMap;


    public class Task3Test extends BaseSteps {

            @Test
            @Title("Заявка на страхование")
            public void Test(){
                MainPageSteps mainPageSteps = new MainPageSteps();
                InsurancePageSteps insurancePageSteps =new InsurancePageSteps();
                ProgramChoicePageSteps programChoicePageSteps = new ProgramChoicePageSteps();
                BlanckPageSteps blanckPageSteps = new BlanckPageSteps();
                
                HashMap<String, String> testData = new HashMap<>();
                // Фамилию и Имя, Дату рождения застрахованных
                testData.put("Застрахованные: Фамилия", "Smirnova");
                testData.put("Застрахованные: Имя", "Anna");
                testData.put("Застрахованные: Дата рождения", "12.11.1990");

                // Данные страхователя: Фамилия, Имя, Отчество, Дата рождения, Пол
                testData.put("Фамилия", "Смирнова");
                testData.put("Имя", "Олеся");
                testData.put("Отчество", "Петровна");
                testData.put("Дата рождения", "13.05.1987");
                testData.put("Пол","");

                // Паспортные данные
                testData.put("Серия паспорта", "5204");
                testData.put("Номер паспорта", "424578");
                testData.put("Дата выдачи паспорта", "02.06.2014");
                testData.put("Кем выдан", "ОУФМС России по г. Новосибирск");

                // Контактные данные не заполняем

                mainPageSteps.stepSelectMainMenu("Страхование");
                mainPageSteps.stepSelectSubMenu("Путешествия и покупки");

                insurancePageSteps.stepCheckTitle("Страхование путешественников");
                insurancePageSteps.stepSendButton();

                for (String winHandle : driver.getWindowHandles()) {
                    driver.switchTo().window(winHandle);
                }

                programChoicePageSteps.selectSum();
                programChoicePageSteps.issueButton();

                blanckPageSteps.stepFillFields(testData);
                //    testData.put("Дата выдачи паспорта", "12.05.2010");
                blanckPageSteps.checkFillFields(testData);
                blanckPageSteps.continueButton();
              //  blanckPageSteps.stepCheckMassegeError("Заполнены не все обязательные поля");
            }
        }
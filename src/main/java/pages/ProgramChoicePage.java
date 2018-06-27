package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class ProgramChoicePage {

        @FindBy(xpath = "//h3 [text()='Выберите сумму страховой защиты']/parent::section")
        public WebElement summa;

        @FindBy(xpath = "//span[contains(text(),'Оформить')]")
        public WebElement issueButton;

        public ProgramChoicePage(WebDriver driver){
            PageFactory.initElements(driver, this);
            Wait<WebDriver> wait = new WebDriverWait(driver,10, 1000);
            wait.until(ExpectedConditions.visibilityOf(summa));
            wait.until(ExpectedConditions.visibilityOf(issueButton));
        }
        public void selectSum(String menuItem) {
            summa.findElement(By.xpath("//div[contains(text(),'" + menuItem + "')]")).click();
        }
    }

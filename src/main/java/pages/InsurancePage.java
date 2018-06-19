package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InsurancePage {
    @FindBy(xpath = "//div[@class='sbrf-rich-outer']/h3[contains(text(),'Страхование путешественников')]")
    public WebElement title;

    @FindBy(xpath = "//div[@data-pid='SBRF-TEXT-2247407']//a[contains(text(),'Оформить онлайн')]")
    public WebElement issueButtonClick;

    public InsurancePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Wait<WebDriver> wait = new WebDriverWait(driver, 40, 1000);
        wait.until(ExpectedConditions.visibilityOf(issueButtonClick));
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends MainPage {

    @FindBy(css = "[id='user_login']")
    private WebElement userloginInput;

    @FindBy(css = "[id='user_email']")
    private WebElement useremailInput;

    @FindBy(css = "[id='wp-submit']")
    private WebElement registerUserButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public RegistrationPage setUserLogin(String userLogin) {
        userloginInput.sendKeys(userLogin);
        return this;
    }

    public RegistrationPage setUserEmail(String userEmail) {
        useremailInput.sendKeys(userEmail);
        return this;
    }

}

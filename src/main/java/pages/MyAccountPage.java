package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends MainPage {


    @FindBy(css = "[id=log]")
    private WebElement usernameInput;

    @FindBy(css = "[id=pwd")
    private WebElement passwordInput;

    @FindBy(css = "[id=login")
    private WebElement loginButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MyAccountPage setLogin(String login) {
        usernameInput.sendKeys(login);
        return this;
    }

    public MyAccountPage setPassword(String password){
        passwordInput.sendKeys(password);
        return this;
    }

    public YourAccountPage clickLoginButton(){
        loginButton.click();
        return new YourAccountPage(driver);
    }

}

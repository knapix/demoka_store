package pages;

import assertions.LoginAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage extends MainPage {
    public LoginAssertion loginAssertion;

//    @FindBy(css = "#account_logout > a")
//    private WebElement logoutButton;

    public YourAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        loginAssertion = new LoginAssertion(driver);
    }


}

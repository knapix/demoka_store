package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.MainPage;

public class LoginAssertion extends MainPage {

    @FindBy(css = "[href$='/profile.php']")
    private WebElement logoutButton;

    public LoginAssertion(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void isUserLoggedIn2() {Assert.assertTrue(logoutButton.isDisplayed()); }
}

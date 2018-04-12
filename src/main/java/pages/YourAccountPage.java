package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage extends MainPage {
    public YourAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}

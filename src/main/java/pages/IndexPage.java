package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends MainPage {

    @FindBy(css = "[id=account]")
    private WebElement openMyAccountLink;

    @FindBy(css = ".search")
    private WebElement searchInput;

    @FindBy(css = ".search")
    private  WebDriver searchButton;

    public IndexPage(WebDriver driver, String url) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.url = url;
    }

    public IndexPage openIndexPage() {
        driver.get(url);
        waitForJStoLoad();
        return this;
    }
    public MyAccountPage openMyAccountPage(){
        openMyAccountLink.click();
        return new MyAccountPage(driver);

    }

    public IndexPage setSearcher(String product) {
        searchInput.sendKeys(product);
       // searchInput.sendKeys(Keys.ENTER);
        return this;
    }

    public IndexPage clickEnterButton(){
        searchInput.sendKeys(Keys.ENTER);
      return this;
    }
    
}

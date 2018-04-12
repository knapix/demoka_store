import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.IndexPage;
import pages.MyAccountPage;

public class MainTest {

    WebDriver driver;
    IndexPage indexPage;
    MyAccountPage myAccountPage;

    @BeforeMethod
    @Parameters({"url"})
    public void before(String url) {
        driver = new ChromeDriver();


        indexPage = new IndexPage(driver, url);
        myAccountPage = new MyAccountPage(driver);
    }

    @AfterMethod
    public void after() {driver.close();}
}

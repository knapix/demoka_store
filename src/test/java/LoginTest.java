import org.testng.annotations.Test;

public class LoginTest extends MainTest {

    private String login = "pkpk";
    private String password = "123456";

    @Test
    public void shouldLogin(){
        indexPage.openIndexPage()
                .openMyAccountPage()
                .setLogin(login)
                .setPassword(password)
                .clickLoginButton();

    }
}

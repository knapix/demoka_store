import org.testng.annotations.Test;

public class SeacherTest extends MainTest {

    public String product = "mouse";

    @Test
    public void shouldSearchProducts() {
        indexPage.openIndexPage()
                .setSearcher(product)
                .clickEnterButton();

    }
}

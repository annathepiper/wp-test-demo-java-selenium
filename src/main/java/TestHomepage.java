import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * TestHomepage
 * @author Angela Korra'ti
 *
 * Last updated 1/29/2019
 * This class conducts tests against the homepage of the test Wordpress site.
 */
public class TestHomepage extends BaseTest {

    @Test
    public void TestHomepageTitle() {
        open(wpBaseUri);
        $(byClassName("site-title"))
                .shouldBe(visible)
                .shouldHave(text("Anna's Dev Wordpress"));
    }
}

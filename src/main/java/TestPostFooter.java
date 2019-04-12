import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostFooter
 * @author Angela Korra'ti
 *
 * Last updated 4/12/2019
 * This test class extends the TestFooter class, which tests against the homepage, and conducts the same tests
 * against an example post.
 */

public class TestPostFooter extends TestFooter {

    /**
     * Setup
     * This method opens up a target post of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        suiteSetup();
        open(wpPostUri);
    }
}

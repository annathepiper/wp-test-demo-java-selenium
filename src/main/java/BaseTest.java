import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import java.util.ResourceBundle;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * BaseTest
 * @author Angela Korra'ti
 *
 * Last updated 1/29/2019
 * This is the master class for the wptestdemoselenium suite. Does the necessary setup for all the other classes.
 */
public class BaseTest {
    // Use these to set up the base URI for our testing
    public String protocol;
    public String host;
    public String wpBaseUri;

    // Resource bundle we're using to pull all the property strings out of
    private static ResourceBundle rb = ResourceBundle.getBundle("wp-test-demo-selenium");

    @BeforeClass
    public void classSetup() {
        // Get the needed properties out of the file
        protocol = rb.getString("protocol");
        host = rb.getString("host");
        wpBaseUri = String.format("%s://%s", protocol, host);

        // Set our Selenium locale for Selenide to use.
        Configuration.remote="http://localhost:4444/wd/hub";
    }
}

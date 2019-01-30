import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

import java.util.ResourceBundle;

/**
 * BaseTest
 * @author Angela Korra'ti
 *
 * Last updated 1/30/2019
 * This is the master class for the wptestdemoselenium suite. Does the necessary setup for all the other classes.
 */
public class BaseTest {
    // Use these to set up the base URI for our testing
    public String protocol;
    public String host;
    public String wpBaseUri;
    public String siteTitleClass;
    public String siteTitle;
    public String siteDescriptionClass;
    public String siteDescription;
    public String menuId;
    public String contentId;

    // Resource bundle we're using to pull all the property strings out of
    private static ResourceBundle rb = ResourceBundle.getBundle("wp-test-demo-selenium");

    @BeforeTest
    public void classSetup() {
        // Get the needed properties out of the file to build some URIs to test
        protocol = rb.getString("protocol");
        host = rb.getString("host");
        wpBaseUri = String.format("%s://%s", protocol, host);

        // Assorted values we'll need for test cases
        siteTitleClass = rb.getString("siteTitleClass");
        siteTitle = rb.getString("siteTitle");
        siteDescriptionClass = rb.getString("siteDescriptionClass");
        siteDescription = rb.getString("siteDescription");
        menuId=rb.getString("menuId");
        contentId=rb.getString("contentId");

        // Set our Selenium locale for Selenide to use.
        Configuration.remote="http://localhost:4444/wd/hub";
    }
}

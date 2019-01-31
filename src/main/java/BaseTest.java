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
    // This is the location for the Selenium grid
    public String seleniumHost;

    // Use these to set up the base URI for our testing
    public String protocol;
    public String host;
    public String wpBaseUri;

    // Assorted strings we need for the test cases
    public String siteTitleClass;
    public String siteTitle;
    public String siteDescriptionClass;
    public String siteDescription;
    public String menuId;
    public String contentId;
    public String primaryContentId;
    public String secondaryContentId;
    public String footerId;
    public String footerSocialMenuId;
    public String footerSiteInfoClass;

    // Resource bundle we're using to pull all the property strings out of
    private static ResourceBundle rb = ResourceBundle.getBundle("wp-test-demo-selenium");

    @BeforeTest
    public void classSetup() {
        // Get the location for the Selenium grid
        seleniumHost = rb.getString("seleniumHost");

        // Get the needed properties out of the file to build some URIs to test
        protocol = rb.getString("protocol");
        host = rb.getString("host");
        wpBaseUri = String.format("%s://%s", protocol, host);

        // Assorted values we'll need for test cases
        siteTitleClass = rb.getString("siteTitleClass");
        siteTitle = rb.getString("siteTitle");
        siteDescriptionClass = rb.getString("siteDescriptionClass");
        siteDescription = rb.getString("siteDescription");
        menuId = rb.getString("menuId");
        contentId = rb.getString("contentId");
        primaryContentId = rb.getString("primaryContentId");
        secondaryContentId = rb.getString("secondaryContentId");
        footerId = rb.getString("footerId");
        footerSocialMenuId = rb.getString("footerSocialMenuId");
        footerSiteInfoClass = rb.getString("footerSiteInfoClass");

        // Set our Selenium locale for Selenide to use.
        Configuration.remote=seleniumHost;
    }
}

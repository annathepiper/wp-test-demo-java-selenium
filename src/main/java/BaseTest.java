import com.codeborne.selenide.Configuration;
import java.util.ResourceBundle;

/**
 * BaseTest
 * @author Angela Korra'ti
 *
 * Last updated 1/31/2019
 * This is the master class for the wptestdemoselenium suite. Does the necessary setup for all the other classes.
 */
public class BaseTest {
    // This is the location for the Selenium grid
    public static String seleniumHost;

    // Use these to set up the base URI for our testing
    public static String protocol;
    public static String host;
    public static String wpBaseUri;

    // Assorted strings we need for the test cases
    public static String siteTitleClass;
    public static String siteTitle;
    public static String siteDescriptionClass;
    public static String siteDescription;
    public static String menuId;
    public static String contentId;
    public static String primaryContentId;
    public static String secondaryContentId;
    public static String footerId;
    public static String footerSocialMenuId;
    public static String footerSiteInfoClass;
    public static String menuHomeXPath;
    public static String menuHomeText;
    public static String menuHomeLink;
    public static String menuAboutXPath;
    public static String menuAboutText;
    public static String menuAboutLink;
    public static String menuBooksXPath;
    public static String menuBooksText;
    public static String menuBooksLink;
    public static String menuBlogXPath;
    public static String menuBlogText;
    public static String menuBlogLink;
    public static String menuContactXPath;
    public static String menuContactText;
    public static String menuContactLink;
    public static String menuStoreXPath;
    public static String menuStoreText;
    public static String menuStoreLink;

    // Resource bundle we're using to pull all the property strings out of
    private static ResourceBundle rb = ResourceBundle.getBundle("wp-test-demo-selenium");

    public static void suiteSetup() {
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
        menuHomeXPath = rb.getString("menuHomeXPath");
        menuHomeText = rb.getString("menuHomeText");
        menuHomeLink = rb.getString("menuHomeLink");
        menuAboutXPath = rb.getString("menuAboutXPath");
        menuAboutText = rb.getString("menuAboutText");
        menuAboutLink = rb.getString("menuAboutLink");
        menuBooksXPath = rb.getString("menuBooksXPath");
        menuBooksText = rb.getString("menuBooksText");
        menuBooksLink = rb.getString("menuBooksLink");
        menuBlogXPath = rb.getString("menuBlogXPath");
        menuBlogText = rb.getString("menuBlogText");
        menuBlogLink = rb.getString("menuBlogLink");
        menuContactXPath = rb.getString("menuContactXPath");
        menuContactText = rb.getString("menuContactText");
        menuContactLink = rb.getString("menuContactLink");
        menuStoreXPath = rb.getString("menuStoreXPath");
        menuStoreText = rb.getString("menuStoreText");
        menuStoreLink = rb.getString("menuStoreLink");

        // Set our Selenium locale for Selenide to use.
        Configuration.remote=seleniumHost;
    }
}
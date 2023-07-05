import org.testng.annotations.BeforeSuite;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static com.codeborne.selenide.Configuration.*;

/**
 * BaseTest
 * @author Angela Korra'ti
 * Last updated 7/4/2023
 * This is the master class for the wptestdemoselenium suite. Does the necessary setup for all the other classes.
 */
abstract class BaseTest {
    // Uris for our testing
    static String wpBaseUri;
    static String wpPostUri;
    static String wpLoginUri;
    static String wpProfileUri;

    // General site descriptor strings
    static String siteTitleClass;
    static String siteTitle;
    static String siteDescriptionClass;
    static String siteDescription;
    static String pageTitleClass;
    static String entryTitleClass;

    // General post descriptor strings
    static String postTitle;

    // Content areas (including sidebar)
    static String contentId;
    static String primaryContentId;
    static String secondaryContentId;

    // For logging purposes
    protected final Logger wpLogger = LogManager.getLogger(this.getClass().getName());

    // Resource bundle we're using to pull all the property strings out of
    public static final ResourceBundle rb = ResourceBundle.getBundle("wp-test-demo-selenium");

    @BeforeSuite
    void suiteSetup() {
        // Set our Selenium locale for Selenide to use.
        remote = rb.getString("seleniumHost");

        // Setting a default timeout because Firefox tends to be a bit pokier in my test runs than Chrome or Edge.
        timeout = 10000;

        // I'm pulling in the browser property from the Maven command line. This lets me run parallel tests in
        // different browsers, either inside IntelliJ via test configs OR in parallel Jenkins jobs. I'm also checking
        // to see if the browser property has been set in general, and if not, setting a default value of Chrome.
        browser = (System.getProperty("browser") != null) ? System.getProperty("browser") : "chrome";

        // Get the needed properties out of the file to build some URIs to test
        wpBaseUri = String.format("%s://%s/", rb.getString("protocol"), rb.getString("host"));
        wpPostUri = wpBaseUri + rb.getString("wpPostUri");
        wpLoginUri = wpBaseUri + rb.getString("metaLoginUri");
        wpProfileUri = wpBaseUri + rb.getString("profileUri");

        // Assorted values we'll need for main site info
        siteTitleClass = rb.getString("siteTitleClass");
        siteTitle = rb.getString("siteTitle");
        siteDescriptionClass = rb.getString("siteDescriptionClass");
        siteDescription = rb.getString("siteDescription");
        pageTitleClass = rb.getString("pageTitleClass");
        entryTitleClass = rb.getString("entryTitleClass");

        // General post values
        postTitle = rb.getString("postTitle");

        // Assorted items pertaining to content areas
        contentId = rb.getString("contentId");
        primaryContentId = rb.getString("primaryContentId");
        secondaryContentId = rb.getString("secondaryContentId");
    }
}
import com.codeborne.selenide.Configuration;
import java.util.ResourceBundle;

/**
 * BaseTest
 * @author Angela Korra'ti
 *
 * Last updated 2/14/2019
 * This is the master class for the wptestdemoselenium suite. Does the necessary setup for all the other classes.
 */
public abstract class BaseTest {
    // This is the location for the Selenium grid
    private static String seleniumHost;

    // Use these to set up the base URI for our testing
    protected static String protocol;
    protected static String host;
    protected static String wpBaseUri;

    // Assorted strings we need for the test cases
    protected static String siteTitleClass;
    protected static String siteTitle;
    protected static String siteDescriptionClass;
    protected static String siteDescription;

    // Content areas (including sidebar)
    protected static String contentId;
    protected static String primaryContentId;
    protected static String secondaryContentId;

    // Footer
    protected static String footerId;
    protected static String footerSocialMenuId;
    protected static String footerSiteInfoClass;
    protected static String footerSiteTitleXPath;
    protected static String footerWPLinkXPath;
    protected static String footerWPLink;
    protected static String footerWPLinkText;
    protected static String footerSocialFacebookXPath;
    protected static String footerSocialFacebookLink;
    protected static String footerSocialFacebookText;
    protected static String footerSocialTwitterXPath;
    protected static String footerSocialTwitterLink;
    protected static String footerSocialTwitterText;
    protected static String footerSocialGithubXPath;
    protected static String footerSocialGithubLink;
    protected static String footerSocialGithubText;
    protected static String footerSocialLinkedInXPath;
    protected static String footerSocialLinkedInLink;
    protected static String footerSocialLinkedInText;

    // Primary menu items
    protected static String menuId;
    protected static String menuHomeXPath;
    protected static String menuHomeText;
    protected static String menuHomeLink;
    protected static String menuAboutXPath;
    protected static String menuAboutText;
    protected static String menuAboutLink;
    protected static String menuBooksXPath;
    protected static String menuBooksText;
    protected static String menuBooksLink;
    protected static String menuBlogXPath;
    protected static String menuBlogText;
    protected static String menuBlogLink;
    protected static String menuContactXPath;
    protected static String menuContactText;
    protected static String menuContactLink;
    protected static String menuStoreXPath;
    protected static String menuStoreText;
    protected static String menuStoreLink;

    // Secondary menu items
    protected static String submenuBooksXPath;
    protected static String submenuHomeXPath;
    protected static String submenuHomeText;
    protected static String submenuHomeLink;
    protected static String submenuFaerieXPath;
    protected static String submenuFaerieText;
    protected static String submenuFaerieLink;
    protected static String submenuBoneXPath;
    protected static String submenuBoneText;
    protected static String submenuBoneLink;
    protected static String submenuValorXPath;
    protected static String submenuValorText;
    protected static String submenuValorLink;
    protected static String submenuVengeanceXPath;
    protected static String submenuVengeanceText;
    protected static String submenuVengeanceLink;
    protected static String submenuVictoryXPath;
    protected static String submenuVictoryText;
    protected static String submenuVictoryLink;
    protected static String submenuShortXPath;
    protected static String submenuShortText;
    protected static String submenuShortLink;
    protected static String submenuStoreXPath;
    protected static String submenuStoreText;
    protected static String submenuStoreLink;

    // Resource bundle we're using to pull all the property strings out of
    private static ResourceBundle rb = ResourceBundle.getBundle("wp-test-demo-selenium");

    protected static void suiteSetup() {
        // Get the location for the Selenium grid
        seleniumHost = rb.getString("seleniumHost");

        // Get the needed properties out of the file to build some URIs to test
        protocol = rb.getString("protocol");
        host = rb.getString("host");
        wpBaseUri = String.format("%s://%s", protocol, host);

        // Assorted values we'll need for main site info
        siteTitleClass = rb.getString("siteTitleClass");
        siteTitle = rb.getString("siteTitle");
        siteDescriptionClass = rb.getString("siteDescriptionClass");
        siteDescription = rb.getString("siteDescription");

        // Assorted items pertaining to content areas
        contentId = rb.getString("contentId");
        primaryContentId = rb.getString("primaryContentId");
        secondaryContentId = rb.getString("secondaryContentId");

        // Items pertaining to the footer
        footerId = rb.getString("footerId");
        footerSocialMenuId = rb.getString("footerSocialMenuId");
        footerSiteInfoClass = rb.getString("footerSiteInfoClass");
        footerSiteTitleXPath = rb.getString("footerSiteTitleXPath");
        footerWPLinkXPath = rb.getString("footerWPLinkXPath");
        footerWPLink = rb.getString("footerWPLink");
        footerWPLinkText = rb.getString("footerWPLinkText");
        footerSocialFacebookXPath = rb.getString("footerSocialFacebookXPath");
        footerSocialFacebookLink = rb.getString("footerSocialFacebookLink");
        footerSocialFacebookText = rb.getString("footerSocialFacebookText");
        footerSocialTwitterXPath = rb.getString("footerSocialTwitterXPath");
        footerSocialTwitterLink = rb.getString("footerSocialTwitterLink");
        footerSocialTwitterText = rb.getString("footerSocialTwitterText");
        footerSocialGithubXPath = rb.getString("footerSocialGithubXPath");
        footerSocialGithubLink = rb.getString("footerSocialGithubLink");
        footerSocialGithubText = rb.getString("footerSocialGithubText");
        footerSocialLinkedInXPath = rb.getString("footerSocialLinkedInXPath");
        footerSocialLinkedInLink = rb.getString("footerSocialLinkedInLink");
        footerSocialLinkedInText = rb.getString("footerSocialLinkedInText");

        // Items pertaining to the primary menu items
        menuId = rb.getString("menuId");
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

        // Items pertaining to the submenus
        submenuBooksXPath = rb.getString("submenuBooksXPath");
        submenuHomeXPath = rb.getString("submenuHomeXPath");
        submenuHomeText = rb.getString("submenuHomeText");
        submenuHomeLink = rb.getString("submenuHomeLink");
        submenuFaerieXPath = rb.getString("submenuFaerieXPath");
        submenuFaerieText = rb.getString("submenuFaerieText");
        submenuFaerieLink = rb.getString("submenuFaerieLink");
        submenuBoneXPath = rb.getString("submenuBoneXPath");
        submenuBoneText = rb.getString("submenuBoneText");
        submenuBoneLink = rb.getString("submenuBoneLink");
        submenuValorXPath = rb.getString("submenuValorXPath");
        submenuValorText = rb.getString("submenuValorText");
        submenuValorLink = rb.getString("submenuValorLink");
        submenuVengeanceXPath = rb.getString("submenuVengeanceXPath");
        submenuVengeanceText = rb.getString("submenuVengeanceText");
        submenuVengeanceLink = rb.getString("submenuVengeanceLink");
        submenuVictoryXPath = rb.getString("submenuVictoryXPath");
        submenuVictoryText = rb.getString("submenuVictoryText");
        submenuVictoryLink = rb.getString("submenuVictoryLink");
        submenuShortXPath = rb.getString("submenuShortXPath");
        submenuShortText = rb.getString("submenuShortText");
        submenuShortLink = rb.getString("submenuShortLink");
        submenuStoreXPath = rb.getString("submenuStoreXPath");
        submenuStoreText = rb.getString("submenuStoreText");
        submenuStoreLink = rb.getString("submenuStoreLink");

        // Set our Selenium locale for Selenide to use.
        Configuration.remote=seleniumHost;
    }
}
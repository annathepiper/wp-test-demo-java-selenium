import com.codeborne.selenide.Configuration;
import java.util.ResourceBundle;

/**
 * BaseTest
 * @author Angela Korra'ti
 *
 * Last updated 2/1/2019
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

    // Content areas (including sidebar)
    public static String contentId;
    public static String primaryContentId;
    public static String secondaryContentId;

    // Footer
    public static String footerId;
    public static String footerSocialMenuId;
    public static String footerSiteInfoClass;
    public static String footerSiteTitleXPath;
    public static String footerWPLinkXPath;
    public static String footerWPLink;
    public static String footerWPLinkText;
    public static String footerSocialFacebookXPath;
    public static String footerSocialFacebookLink;
    public static String footerSocialFacebookText;
    public static String footerSocialTwitterXPath;
    public static String footerSocialTwitterLink;
    public static String footerSocialTwitterText;
    public static String footerSocialGithubXPath;
    public static String footerSocialGithubLink;
    public static String footerSocialGithubText;
    public static String footerSocialLinkedInXPath;
    public static String footerSocialLinkedInLink;
    public static String footerSocialLinkedInText;

    // Primary menu items
    public static String menuId;
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

    // Secondary menu items
    public static String submenuBooksXPath;
    public static String submenuHomeXPath;
    public static String submenuHomeText;
    public static String submenuHomeLink;
    public static String submenuFaerieXPath;
    public static String submenuFaerieText;
    public static String submenuFaerieLink;
    public static String submenuBoneXPath;
    public static String submenuBoneText;
    public static String submenuBoneLink;
    public static String submenuValorXPath;
    public static String submenuValorText;
    public static String submenuValorLink;
    public static String submenuVengeanceXPath;
    public static String submenuVengeanceText;
    public static String submenuVengeanceLink;
    public static String submenuVictoryXPath;
    public static String submenuVictoryText;
    public static String submenuVictoryLink;
    public static String submenuShortXPath;
    public static String submenuShortText;
    public static String submenuShortLink;
    public static String submenuStoreXPath;
    public static String submenuStoreText;
    public static String submenuStoreLink;

    // Resource bundle we're using to pull all the property strings out of
    private static ResourceBundle rb = ResourceBundle.getBundle("wp-test-demo-selenium");

    public static void suiteSetup() {
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
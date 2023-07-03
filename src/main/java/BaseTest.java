import org.testng.annotations.BeforeSuite;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static com.codeborne.selenide.Configuration.*;

/**
 * BaseTest
 * @author Angela Korra'ti
 * Last updated 5/9/2019
 * This is the master class for the wptestdemoselenium suite. Does the necessary setup for all the other classes.
 */
abstract class BaseTest {
    // Uris for our testing
    static String wpBaseUri;
    static String wpPostUri;

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

    // Footer
    static String footerId;
    static String footerSocialMenuId;
    static String footerSiteInfoClass;
    static String footerSiteTitleXPath;
    static String footerWPLinkXPath;
    static String footerWPLink;
    static String footerWPLinkText;
    static String footerSocialFacebookXPath;
    static String footerSocialFacebookLink;
    static String footerSocialFacebookText;
    static String footerSocialMastodonXPath;
    static String footerSocialMastodonLink;
    static String footerSocialMastodonText;
    static String footerSocialGithubXPath;
    static String footerSocialGithubLink;
    static String footerSocialGithubText;
    static String footerSocialLinkedInXPath;
    //NOTE: Commenting this string out because I can't actually use it in the footer test cases, due to hitting it
    //triggering a LinkedIn auth wall. But keeping it here for reference in case that behavior changes and I can
    //wake this string up again.
    //static String footerSocialLinkedInLink;
    static String footerSocialLinkedInText;

    // Primary menu items
    static String menuId;
    static String menuHomeXPath;
    static String menuHomeText;
    static String menuHomeLink;
    static String menuAboutXPath;
    static String menuAboutText;
    static String menuAboutLink;
    static String menuBooksXPath;
    static String menuBooksText;
    static String menuBooksLink;
    static String menuBlogXPath;
    static String menuBlogText;
    static String menuBlogLink;
    static String menuContactXPath;
    static String menuContactText;
    static String menuContactLink;
    static String menuStoreXPath;
    static String menuStoreText;
    static String menuStoreLink;

    // Secondary menu items
    static String submenuBooksXPath;
    static String submenuHomeXPath;
    static String submenuHomeText;
    static String submenuHomeLink;
    static String submenuFaerieXPath;
    static String submenuFaerieText;
    static String submenuFaerieLink;
    static String submenuBoneXPath;
    static String submenuBoneText;
    static String submenuBoneLink;
    static String submenuValorXPath;
    static String submenuValorText;
    static String submenuValorLink;
    static String submenuVengeanceXPath;
    static String submenuVengeanceText;
    static String submenuVengeanceLink;
    static String submenuVictoryXPath;
    static String submenuVictoryText;
    static String submenuVictoryLink;
    static String submenuShortXPath;
    static String submenuShortText;
    static String submenuShortLink;
    static String submenuStoreXPath;
    static String submenuStoreText;
    static String submenuStoreLink;

    // Sidebar items
    static String sidebarSearchId;
    static String sidebarSearchInputXPath;
    static String sidebarSearchInputText;
    static String sidebarSearchButtonXPath;
    static String sidebarRecentPostsId;
    static String sidebarRecentPostsTitleXPath;
    static String sidebarRecentPostsTitleText;
    static String sidebarRecentPostsListXPath;
    static String sidebarRecentCommentsId;
    static String sidebarRecentCommentsTitleXPath;
    static String sidebarRecentCommentsTitleText;
    static String sidebarRecentCommentsListXPath;
    static String sidebarArchivesId;
    static String sidebarArchivesTitleXPath;
    static String sidebarArchivesTitleText;
    static String sidebarArchivesListXPath;
    static String sidebarCategoriesId;
    static String sidebarCategoriesTitleXPath;
    static String sidebarCategoriesTitleText;
    static String sidebarCategoriesListXPath;
    static String sidebarMetaId;
    static String sidebarMetaTitleXPath;
    static String sidebarMetaTitleText;
    static String sidebarMetaListXPath;

    // Search items
    static String searchString;
    static String searchUri;
    static String searchResultsString;
    static String searchNoResultsString;
    static String searchNoResultsUri;
    static String searchNoResultsMessage;

    // Recent posts items
    static String recentPostsUri;
    static String recentPostsTitle;

    // Recent comments items
    static String recentCommentsUri;
    static String recentCommentsTitle;

    // Archives items
    static String archivesUri;
    static String archivesString;
    static String archivesTitle;

    // Categories items
    static String categoriesUri;
    static String categoriesString;
    static String categoriesTitle;

    // Meta items
    static String metaLoginUri;
    static String metaLoginText;

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
        wpBaseUri = String.format("%s://%s", rb.getString("protocol"), rb.getString("host"));
        wpPostUri = wpBaseUri + rb.getString("wpPostUri");

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
        footerSocialMastodonXPath = rb.getString("footerSocialMastodonXPath");
        footerSocialMastodonLink = rb.getString("footerSocialMastodonLink");
        footerSocialMastodonText = rb.getString("footerSocialMastodonText");
        footerSocialGithubXPath = rb.getString("footerSocialGithubXPath");
        footerSocialGithubLink = rb.getString("footerSocialGithubLink");
        footerSocialGithubText = rb.getString("footerSocialGithubText");
        footerSocialLinkedInXPath = rb.getString("footerSocialLinkedInXPath");
        // NOTE: Commenting this string out because for now I can't actually use it, due to hitting this link
        // triggering a LinkedIn auth wall. Keeping it rather than deleting it in case the behavior changes.
        // footerSocialLinkedInLink = rb.getString("footerSocialLinkedInLink");
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

        // Items pertaining to the sidebar
        sidebarSearchId = rb.getString("sidebarSearchId");
        sidebarSearchInputXPath = rb.getString("sidebarSearchInputXPath");
        sidebarSearchInputText = rb.getString("sidebarSearchInputText");
        sidebarSearchButtonXPath = rb.getString("sidebarSearchButtonXPath");
        sidebarRecentPostsId = rb.getString("sidebarRecentPostsId");
        sidebarRecentPostsTitleXPath = rb.getString("sidebarRecentPostsTitleXPath");
        sidebarRecentPostsTitleText = rb.getString("sidebarRecentPostsTitleText");
        sidebarRecentPostsListXPath = rb.getString("sidebarRecentPostsListXPath");
        sidebarRecentCommentsId = rb.getString("sidebarRecentCommentsId");
        sidebarRecentCommentsTitleXPath = rb.getString("sidebarRecentCommentsTitleXPath");
        sidebarRecentCommentsTitleText = rb.getString("sidebarRecentCommentsTitleText");
        sidebarRecentCommentsListXPath = rb.getString("sidebarRecentCommentsListXPath");
        sidebarArchivesId = rb.getString("sidebarArchivesId");
        sidebarArchivesTitleXPath = rb.getString("sidebarArchivesTitleXPath");
        sidebarArchivesTitleText = rb.getString("sidebarArchivesTitleText");
        sidebarArchivesListXPath = rb.getString("sidebarArchivesListXPath");
        sidebarCategoriesId = rb.getString("sidebarCategoriesId");
        sidebarCategoriesTitleXPath = rb.getString("sidebarCategoriesTitleXPath");
        sidebarCategoriesTitleText = rb.getString("sidebarCategoriesTitleText");
        sidebarCategoriesListXPath = rb.getString("sidebarCategoriesListXPath");
        sidebarMetaId = rb.getString("sidebarMetaId");
        sidebarMetaTitleXPath = rb.getString("sidebarMetaTitleXPath");
        sidebarMetaTitleText = rb.getString("sidebarMetaTitleText");
        sidebarMetaListXPath = rb.getString("sidebarMetaListXPath");

        // Items pertaining to search
        searchString = rb.getString("searchString");
        searchUri = rb.getString("searchUri");
        searchResultsString = rb.getString("searchResultsString");
        searchNoResultsString = rb.getString("searchNoResultsString");
        searchNoResultsUri = rb.getString("searchNoResultsUri");
        searchNoResultsMessage = rb.getString("searchNoResultsMessage");

        // Items pertaining to Recent Posts
        recentPostsUri = rb.getString("recentPostsUri");
        recentPostsTitle = rb.getString("recentPostsTitle");

        // Items pertaining to Recent Comments
        recentCommentsUri = rb.getString("recentCommentsUri");
        recentCommentsTitle = rb.getString("recentCommentsTitle");

        // Items pertaining to Archives
        archivesUri = rb.getString("archivesUri");
        archivesString = rb.getString("archivesString");
        archivesTitle = rb.getString("archivesTitle");

        // Items pertaining to Categories
        categoriesUri = rb.getString("categoriesUri");
        categoriesString = rb.getString("categoriesString");
        categoriesTitle = rb.getString("categoriesTitle");

        // Items pertaining to Meta
        metaLoginUri = rb.getString("metaLoginUri");
        metaLoginText = rb.getString("metaLoginText");
    }
}
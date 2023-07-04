import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * WPSidebar
 * @author Angela Korra'ti
 * Last updated 7/4/2023
 * This is the WPSidebar helper class that defines the structure of a sidebar page object.
 */

public class WPSidebar extends BaseTest {
    // Main sidebar items
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
    static String metaSiteAdminText;
    static String metaLogoutText;

    /**
     * Constructor for the class.
     */
    WPSidebar() {
        // Main sidebar items
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
        metaSiteAdminText = rb.getString("metaSiteAdminText");
        metaLogoutText = rb.getString("metaLogoutText");
    }

    /**
     * ssearchElement
     * @return Selenide element representing the search widget on the sidebar
     */
    SelenideElement searchElement() {
        return $(byId(sidebarSearchId));
    }

    /**
     * searchInputElement
     * @return Selenide element representing the search input box on the sidebar
     */
    SelenideElement searchInputElement() {
        return $(byXpath(sidebarSearchInputXPath));
    }

    /**
     * searchInputText
     * @return String containing the placeholder text on the search input box in the sidebar
     */
    String searchInputText() {
        return searchInputElement().getAttribute("placeholder");
    }

    /**
     * searchButtonElement
     * @return Selenide element representing the search button on the sidebar
     */
    SelenideElement searchButtonElement() {
        return $(byXpath(sidebarSearchButtonXPath));
    }

    /**
     * recentPostsElement
     * @return Selenide element representing the Recent Posts widget on the sidebar
     */
    SelenideElement recentPostsElement() {
        return $(byId(sidebarRecentPostsId));
    }

    /**
     * recentPostsTitleElement
     * @return Selenide element representing the title of the Recent Posts widget on the sidebar
     */
    SelenideElement recentPostsTitleElement() {
        return $(byXpath(sidebarRecentPostsTitleXPath));
    }

    /**
     * recentPostsTitleText
     * @return String containing the Recent Posts title on the sidebar
     */
    String recentPostsTitleText() {
        return recentPostsTitleElement().text();
    }

    /**
     * recentPostsListElement
     * @return Selenide element representing the posts list in the Recent Posts widget on the sidebar
     */
    SelenideElement recentPostsListElement() {
        return $(byXpath(sidebarRecentPostsListXPath));
    }

    /**
     * recentPostsListElements
     * @return Collection of Selenide elements representing the list of posts in Recent Posts widget
     */
    ElementsCollection recentPostsListElements() {
        return $$(byXpath(sidebarRecentPostsListXPath + "/li/a"));
    }

    /**
     * recentCommentsElement
     * @return Selenide element representing the Recent Comments widget on the sidebar
     */
    SelenideElement recentCommentsElement() {
        return $(byId(sidebarRecentCommentsId));
    }

    /**
     * recentCommentsTitleElement
     * @return Selenide element representing the title of the Recent Comments widget on the sidebar
     */
    SelenideElement recentCommentsTitleElement() {
        return $(byXpath(sidebarRecentCommentsTitleXPath));
    }

    /**
     * recentCommentsTitleText
     * @return String containing the Recent Comments title on the sidebar
     */
    String recentCommentsTitleText() {
        return recentCommentsTitleElement().text();
    }

    /**
     * recentCommentsListElement
     * @return Selenide element representing the comments list in the Recent Comments widget on the sidebar
     */
    SelenideElement recentCommentsListElement() {
        return $(byXpath(sidebarRecentCommentsListXPath));
    }

    /**
     * recentCommentsListElements
     * @return Collection of Selenide elements representing the list of comments in Recent Comments widget
     */
    ElementsCollection recentCommentsListElements() {
        return $$(byXpath(sidebarRecentCommentsListXPath + "/li/a"));
    }

    /**
     * archivesElement
     * @return Selenide element representing the Archives widget on the sidebar
     */
    SelenideElement archivesElement() {
        return $(byId(sidebarArchivesId));
    }

    /**
     * archivesTitleElement
     * @return Selenide element representing the title of the Archives widget on the sidebar
     */
    SelenideElement archivesTitleElement() {
        return $(byXpath(sidebarArchivesTitleXPath));
    }

    /**
     * archivesTitleText
     * @return String containing the Archives title on the sidebar
     */
    String archivesTitleText() {
        return archivesTitleElement().text();
    }

    /**
     * archivesListElement
     * @return Selenide element representing the archives list in the Archives widget on the sidebar
     */
    SelenideElement archivesListElement() {
        return $(byXpath(sidebarArchivesListXPath));
    }

    /**
     * archivesListElements
     * @return Collection of Selenide elements representing the list of archives in Archives widget
     */
    ElementsCollection archivesListElements() {
        return $$(byXpath(sidebarArchivesListXPath + "/li/a"));
    }

    /**
     * categoriesElement
     * @return Selenide element representing the Categories widget on the sidebar
     */
    SelenideElement categoriesElement() {
        return $(byId(sidebarCategoriesId));
    }

    /**
     * categoriesTitleElement
     * @return Selenide element representing the title of the Categories widget on the sidebar
     */
    SelenideElement categoriesTitleElement() {
        return $(byXpath(sidebarCategoriesTitleXPath));
    }

    /**
     * categoriesTitleText
     * @return String containing the Categories title on the sidebar
     */
    String categoriesTitleText() {
        return categoriesTitleElement().text();
    }

    /**
     * categoriesListElement
     * @return Selenide element representing the categories list in the Categories widget on the sidebar
     */
    SelenideElement categoriesListElement() {
        return $(byXpath(sidebarCategoriesListXPath));
    }

    /**
     * categoriesListElements
     * @return Collection of Selenide elements representing the list of categories in Categories widget
     */
    ElementsCollection categoriesListElements() {
        return $$(byXpath(sidebarCategoriesListXPath + "/li/a"));
    }

    /**
     * metaElement
     * @return Selenide element representing the Meta widget on the sidebar
     */
    SelenideElement metaElement() {
        return $(byId(sidebarMetaId));
    }

    /**
     * metaTitleElement
     * @return Selenide element representing the title of the Meta widget on the sidebar
     */
    SelenideElement metaTitleElement() {
        return $(byXpath(sidebarMetaTitleXPath));
    }

    /**
     * metaTitleText
     * @return String containing the Meta title on the sidebar
     */
    String metaTitleText() {
        return metaTitleElement().text();
    }

    /**
     * metaListElement
     * @return Selenide element representing the meta list in the Meta widget on the sidebar
     */
    SelenideElement metaListElement() {
        return $(byXpath(sidebarMetaListXPath));
    }

    /**
     * metaListElements
     * @return Collection of Selenide elements representing the specific links in Meta widget
     */
    ElementsCollection metaListElements() {
        return $$(byXpath(sidebarMetaListXPath + "/li/a"));
    }

    /**
     * metaLoginLink
     * @return Selenide element representing the Log in link in the Meta widget on the sidebar
     */
    SelenideElement metaLoginLink() { return $(byLinkText(metaLoginText)); }

    /**
     * metaSiteAdminLink
     * @return Selenide element representing the Site admin link in the Meta widget on the sidebar
     */
    SelenideElement metaSiteAdminLink() { return $(byLinkText(metaSiteAdminText)); }

    /**
     * metaLogoutLink
     * @return Selenide element representing the Log out link in the Meta widget on the sidebar
     */
    SelenideElement metaLogoutLink() { return $(byLinkText(metaLogoutText)); }
}

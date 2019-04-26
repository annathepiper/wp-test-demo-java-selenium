import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * WPSidebar
 * @author Angela Korra'ti
 *
 * Last updated 4/26/2019
 * This is the WPSidebar helper class that defines the structure of a sidebar page object.
 */

public class WPSidebar extends BaseTest {

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
}

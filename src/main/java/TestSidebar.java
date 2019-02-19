import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

/**
 * TestSidebar
 * @author Angela Korra'ti
 *
 * Last updated 2/19/2019
 * This class conducts tests against the sidebar on the homepage of the test WordPress site.
 *
 */
public class TestSidebar extends BaseTest {

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        suiteSetup();
        open(wpBaseUri);
    }

    /**
     * TestSidebarSearchWidgetExists
     * Verify that the search widget is present and visible in the sidebar.
     */
    @Test
    public void TestSidebarSearchWidgetExists() {
        $(byId(sidebarSearchId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarSearchInputExists
     * Verify that the sidebar search input box exists and is visible.
     */
    @Test
    public void TestSidebarSearchInputExists() {
        $(byXpath(sidebarSearchInputXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarSearchInputText
     * Verify that the sidebar search input box has the expected text.
     */
    @Test
    public void TestSidebarSearchInputText() {
        String searchInputText = $(byXpath(sidebarSearchInputXPath)).getAttribute("placeholder");
        Assert.assertEquals(searchInputText, sidebarSearchInputText,
                "Sidebar search input box does not have expected text.");
    }

    /**
     * TestSidebarSearchButtonExists
     * Verify that the sidebar search button exists and is visible.
     */
    @Test
    public void TestSidebarSearchButtonExists() {
        $(byXpath(sidebarSearchButtonXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarRecentPostsWidgetExists
     * Verify that the recent posts widget is present and visible.
     */
    @Test
    public void TestSidebarRecentPostsWidgetExists() {
        $(byId(sidebarRecentPostsId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarRecentPostsTitleExists
     * Verify that the recent posts widget has a title.
     */
    @Test
    public void TestSidebarRecentPostsTitleExists() {
        $(byXpath(sidebarRecentPostsTitleXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarRecentPostsTitleText
     * Verify that the recent posts widget has the correct title text.
     */
    @Test
    public void TestSidebarRecentPostsTitleText() {
        Assert.assertEquals($(byXpath(sidebarRecentPostsTitleXPath)).text(), sidebarRecentPostsTitleText,
                "Sidebar Recent Posts widget does not have correct title text.");
    }

    /**
     * TestSidebarRecentPostsListExists
     * Verify that the recent posts widget includes a list of recent posts.
     */
    @Test
    public void TestSidebarRecentPostsListExists() {
        $(byXpath(sidebarRecentPostsListXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarRecentPostsListItemsCount
     * Verify that the recent posts widget contains five recent posts.
     */
    @Test
    public void TestSidebarRecentPostsListItemsCount() {
        ElementsCollection listItems = $$(byXpath(sidebarRecentPostsListXPath + "/li"));
        Assert.assertEquals(listItems.size(),5, "Recent Posts widget does not have correct count of posts.");
    }

    /**
     * TestSidebarRecentCommentsWidgetExists
     * Verify that the recent comments widget is present and visible.
     */
    @Test
    public void TestSidebarRecentCommentsWidgetExists() {
        $(byId(sidebarRecentCommentsId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarRecentCommentsTitleExists
     * Verify that the recent comments widget has a title.
     */
    @Test
    public void TestSidebarRecentCommentsTitleExists() {
        $(byXpath(sidebarRecentCommentsTitleXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarRecentCommentsTitleText
     * Verify that the recent comments widget has the correct title text.
     */
    @Test
    public void TestSidebarRecentCommentsTitleText() {
        Assert.assertEquals($(byXpath(sidebarRecentCommentsTitleXPath)).text(), sidebarRecentCommentsTitleText,
                "Sidebar Recent Comments widget does not have correct title text.");
    }

    /**
     * TestSidebarRecentCommentsListExists
     * Verify that the recent comments widget includes a list of recent comments.
     */
    @Test
    public void TestSidebarRecentCommentsListExists() {
        $(byXpath(sidebarRecentCommentsListXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarRecentCommentsListItemsCount
     * Verify that the recent comments widget contains five recent comments.
     */
    @Test
    public void TestSidebarRecentCommentsListItemsCount() {
        ElementsCollection listItems = $$(byXpath(sidebarRecentCommentsListXPath + "/li"));
        Assert.assertTrue(listItems.size() >= 1, "Recent Comments widget does not have correct count of comments.");
    }

    /**
     * TestSidebarArchivesWidgetExists
     * Verify that the archives widget is present and visible.
     */
    @Test
    public void TestSidebarArchivesWidgetExists() {
        $(byId(sidebarArchivesId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarArchivesTitleExists
     * Verify that the archives widget has a title.
     */
    @Test
    public void TestSidebarArchivesTitleExists() {
        $(byXpath(sidebarArchivesTitleXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarArchivesTitleText
     * Verify that the archives widget has the correct title text.
     */
    @Test
    public void TestSidebarArchivesTitleText() {
        Assert.assertEquals($(byXpath(sidebarArchivesTitleXPath)).text(), sidebarArchivesTitleText,
                "Sidebar Archives widget does not have correct title text.");
    }

    /**
     * TestSidebarArchivesListExists
     * Verify that the archives widget includes a list of months and years for posts.
     */
    @Test
    public void TestSidebarArchivesListExists() {
        $(byXpath(sidebarArchivesListXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarArchivesListItemsCount
     * Verify that the archives widget contains at least one month and year link for posts.
     */
    @Test
    public void TestSidebarArchivesListItemsCount() {
        ElementsCollection listItems = $$(byXpath(sidebarArchivesListXPath + "/li"));
        Assert.assertTrue(listItems.size() >= 1, "Archives widget does not have correct count of links.");
    }

    /**
     * TestSidebarCategoriesWidgetExists
     * Verify that the categories widget is present and visible.
     */
    @Test
    public void TestSidebarCategoriesWidgetExists() {
        $(byId(sidebarCategoriesId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarCategoriesTitleExists
     * Verify that the categories widget has a title.
     */
    @Test
    public void TestSidebarCategoriesTitleExists() {
        $(byXpath(sidebarCategoriesTitleXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarCategoriesTitleText
     * Verify that the categories widget has the correct title text.
     */
    @Test
    public void TestSidebarCategoriesTitleText() {
        Assert.assertEquals($(byXpath(sidebarCategoriesTitleXPath)).text(), sidebarCategoriesTitleText,
                "Sidebar Categories widget does not have correct title text.");
    }

    /**
     * TestSidebarCategoriesListExists
     * Verify that the categories widget includes a list of post categories.
     */
    @Test
    public void TestSidebarCategoriesListExists() {
        $(byXpath(sidebarCategoriesListXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarCategoriesListItemsCount
     * Verify that the categories widget contains at least one post category.
     */
    @Test
    public void TestSidebarCategoriesListItemsCount() {
        ElementsCollection listItems = $$(byXpath(sidebarCategoriesListXPath + "/li"));
        Assert.assertTrue(listItems.size() >= 1, "Categories widget does not have correct count of categories.");
    }

    /**
     * TestSidebarMetaWidgetExists
     * Verify that the meta widget is present and visible.
     */
    @Test
    public void TestSidebarMetaWidgetExists() {
        $(byId(sidebarMetaId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarMetaTitleExists
     * Verify that the meta widget has a title.
     */
    @Test
    public void TestSidebarMetaTitleExists() {
        $(byXpath(sidebarMetaTitleXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarMetaTitleText
     * Verify that the meta widget has the correct title text.
     */
    @Test
    public void TestSidebarMetaTitleText() {
        Assert.assertEquals($(byXpath(sidebarMetaTitleXPath)).text(), sidebarMetaTitleText,
                "Sidebar Meta widget does not have correct title text.");
    }

    /**
     * TestSidebarMetaListExists
     * Verify that the meta widget includes a list of meta links.
     */
    @Test
    public void TestSidebarMetaListExists() {
        $(byXpath(sidebarMetaListXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSidebarMetaListItemsCount
     * Verify that the meta widget contains the correct number of links.
     * NOTE: Link count should be 4 when a user is not logged in.
     */
    @Test
    public void TestSidebarMetaListItemsCount() {
        ElementsCollection listItems = $$(byXpath(sidebarMetaListXPath + "/li"));
        Assert.assertEquals(listItems.size(), 4, "Meta widget does not have correct count of links.");
    }
}

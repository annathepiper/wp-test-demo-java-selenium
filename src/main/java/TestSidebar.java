import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * TestSidebar
 * @author Angela Korra'ti
 *
 * Last updated 5/10/2019
 * This test class is the parent class for testing the sidebar, and it tests against the sidebar on the homepage. Child
 * classes will do appropriate setup to test against other specific pages.
 *
 */
public class TestSidebar extends BaseTest {
    WPSidebar wpSidebar;
    String targetUri;

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        open(wpBaseUri);
        targetUri = wpBaseUri;
        WPHomepage wpHomepage = new WPHomepage();
        wpSidebar = wpHomepage.wpSidebar;
    }

    /**
     * TestSidebarSearchWidgetExists
     * Verify that the search widget is present and visible in the sidebar.
     */
    @Test
    public void TestSidebarSearchWidgetExists() {
        wpLogger.info(String.format("Verifying sidebar search element on: %s",targetUri));
        wpSidebar.searchElement().should(exist).shouldBe(visible);
    }

    /**
     * TestSidebarSearchInput
     * Verify that the sidebar search input box exists, is visible, and has the correct text.
     */
    @Test
    public void TestSidebarSearchInput() {
        wpLogger.info(String.format("Verifying sidebar search input box on: %s",targetUri));
        wpSidebar.searchInputElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.searchInputText(), sidebarSearchInputText,
                "Sidebar search input box does not have expected text.");
    }

    /**
     * TestSidebarSearchButtonExists
     * Verify that the sidebar search button exists and is visible.
     */
    @Test
    public void TestSidebarSearchButtonExists() {
        wpLogger.info(String.format("Verifying sidebar search button on: %s",targetUri));
        wpSidebar.searchButtonElement().should(exist).shouldBe(visible);
    }

    /**
     * TestSidebarRecentPosts
     * Verify that the recent posts widget is present and visible, has the correct title, and has five posts.
     */
    @Test
    public void TestSidebarRecentPosts() {
        wpLogger.info(String.format("Verifying sidebar Recent Posts widget on: %s",targetUri));
        wpSidebar.recentPostsElement().should(exist).shouldBe(visible);
        wpSidebar.recentPostsTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.recentPostsTitleText(), sidebarRecentPostsTitleText,
                "Sidebar Recent Posts widget does not have correct title text.");
        wpSidebar.recentPostsListElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.recentPostsListElements().size(),5,
                "Recent Posts widget does not have correct count of posts.");
    }

    /**
     * TestSidebarRecentComments
     * Verify that the recent comments widget is present and visible, has the correct title, and has the correct
     * count of comments.
     */
    @Test
    public void TestSidebarRecentComments() {
        wpLogger.info(String.format("Verifying sidebar Recent Comments widget on: %s",targetUri));
        wpSidebar.recentCommentsElement().should(exist).shouldBe(visible);
        wpSidebar.recentCommentsTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.recentCommentsTitleText(), sidebarRecentCommentsTitleText,
                "Sidebar Recent Comments widget does not have correct title text.");
        wpSidebar.recentCommentsListElement().should(exist).shouldBe(visible);
        Assert.assertTrue(wpSidebar.recentCommentsListElements().size() >= 1,
                "Recent Comments widget does not have correct count of comments.");
    }

    /**
     * TestSidebarArchives
     * Verify that the archives widget is present and visible, has the correct title, and has the correct count of
     * archive links.
     */
    @Test
    public void TestSidebarArchives() {
        wpLogger.info(String.format("Verifying sidebar Archives widget on: %s",targetUri));
        wpSidebar.archivesElement().should(exist).shouldBe(visible);
        wpSidebar.archivesTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.archivesTitleText(), sidebarArchivesTitleText,
                "Sidebar Archives widget does not have correct title text.");
        wpSidebar.archivesListElement().should(exist).shouldBe(visible);
        Assert.assertTrue(wpSidebar.archivesListElements().size() >= 1,
                "Archives widget does not have correct count of links.");
    }

    /**
     * TestSidebarCategories
     * Verify that the categories widget is present and visible, has the correct title, and has the correct count of
     * category links.
     */
    @Test
    public void TestSidebarCategories() {
        wpLogger.info(String.format("Verifying sidebar Categories widget on: %s",targetUri));
        wpSidebar.categoriesElement().should(exist).shouldBe(visible);
        wpSidebar.categoriesTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.categoriesTitleText(), sidebarCategoriesTitleText,
                "Sidebar Categories widget does not have correct title text.");
        wpSidebar.categoriesListElement().should(exist).shouldBe(visible);
        Assert.assertTrue(wpSidebar.categoriesListElements().size() >= 1,
                "Categories widget does not have correct count of categories.");
    }

    /**
     * TestSidebarMeta
     * Verify that the meta widget is present and visible, has the correct title, and has the correct count of links.
     */
    @Test
    public void TestSidebarMeta() {
        wpLogger.info(String.format("Verifying sidebar Meta widget on: %s",targetUri));
        wpSidebar.metaElement().should(exist).shouldBe(visible);
        wpSidebar.metaTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.metaTitleText(), sidebarMetaTitleText,
                "Sidebar Meta widget does not have correct title text.");
        wpSidebar.metaListElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpSidebar.metaListElements().size(), 4,
                "Meta widget does not have correct count of links.");
    }
}

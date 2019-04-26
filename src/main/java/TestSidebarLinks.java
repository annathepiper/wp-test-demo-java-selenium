import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestSidebarLinks
 * @author Angela Korra'ti
 *
 * Last updated 4/25/2019
 * This test class is the parent class for testing the sidebar links, and it tests against the sidebar on the homepage.
 * Child classes will do appropriate setup to test against other specific pages.
 *
 */
public class TestSidebarLinks extends BaseTest {
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
     * TestRecentPostsLinkClick
     * Verify that clicking on the first link in the Recent Posts links goes to the expected post.
     */
    @Test
    public void TestRecentPostsLinkClick() {
        wpLogger.info(String.format("Testing clicking the first recent post on %s",targetUri));
        // Need to scroll up to the search control to get the posts into view
        wpSidebar.searchElement().scrollTo();

        // Now click on the actual post
        wpSidebar.recentPostsListElements().get(0).click();
        Assert.assertEquals(url(), wpBaseUri + recentPostsUri);
        WPPost wpPost = new WPPost();
        wpPost.postTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpPost.postTitleText(), recentPostsTitle);
    }

    /**
     * TestRecentCommentsLinkClick
     * Verify that clicking on the first link in the Recent Comments links goes to the expected comment.
     */
    @Test
    public void TestRecentCommentsLinkClick() {
        wpLogger.info(String.format("Testing clicking the first recent comment on %s",targetUri));
        // Have to scroll to the last item in the Recent Posts lists for the comments to be visible
        wpSidebar.recentPostsListElements().get(4).scrollTo();

        // Now click on the actual comment link
        wpSidebar.recentCommentsListElements().get(0).click();
        Assert.assertEquals(url(), wpBaseUri + recentCommentsUri);
        WPPost wpPost = new WPPost();
        wpPost.postTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpPost.postTitleText(), recentCommentsTitle);
    }

    /**
     * TestArchivesLinkClick
     * Verify that clicking on the first link in the Archives links goes to the expected archives page.
     */
    @Test
    public void TestArchivesLinkClick() {
        wpLogger.info(String.format("Testing clicking the first archive link on %s",targetUri));
        // Have to scroll to the last item in the Recent Posts lists for the archives to be visible
        wpSidebar.recentPostsListElements().get(4).scrollTo();

        // Now click on the actual archives link
        wpSidebar.archivesListElements().get(0).click();
        Assert.assertEquals(url(), wpBaseUri + archivesUri);
        SelenideElement pageTitle = $(byClassName(pageTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), archivesString + archivesTitle);    }

    /**
     * TestCategoriesLinkClick
     * Verify that clicking on the first link in the Categories links goes to the expected category page.
     */
    @Test
    public void TestCategoriesLinkClick() {
        wpLogger.info(String.format("Testing clicking the first category link on %s",targetUri));
        // Have to scroll to the last item in the Recent Posts lists for the archives to be visible
        wpSidebar.recentPostsListElements().get(4).scrollTo();

        // Now click on the actual category link
        wpSidebar.categoriesListElements().get(0).click();
        Assert.assertEquals(url(), wpBaseUri + categoriesUri);
        SelenideElement pageTitle = $(byClassName(pageTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), categoriesString + categoriesTitle);
    }

    /**
     * TestMetaLoginLinkClick
     * Verify that clicking on the first link in the Meta links goes to the login page.
     */
    @Test
    public void TestMetaLoginLinkClick() {
        wpLogger.info(String.format("Testing clicking the first meta link on %s",targetUri));
        // Have to scroll to the last item in the Recent Comments lists for the meta links to be visible
        wpSidebar.recentCommentsListElements().get(0).scrollTo();

        // Now click on the actual log in link
        wpSidebar.metaListElements().get(0).click();
        Assert.assertEquals(url(), wpBaseUri + metaLoginUri);

        // Hit back to go back to the previous page for further testing
        back();
    }
}

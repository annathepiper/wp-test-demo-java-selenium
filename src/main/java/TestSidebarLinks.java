import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
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
 * Last updated 2/21/2019
 * This class conducts tests against links on the sidebar on the homepage of the test WordPress site.
 *
 */
public class TestSidebarLinks extends BaseTest {

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
     * TestRecentPostsLinkClick
     * Verify that clicking on the first link in the Recent Posts links goes to the expected post.
     */
    @Test
    public void TestRecentPostsLinkClick() {
        // Need to scroll up to the search control to get the posts into view
        $(byId(sidebarSearchId)).scrollTo();

        // Now click on the actual post
        $(byXpath(sidebarRecentPostsListXPath + "/li/a")).click();
        Assert.assertEquals(url(), wpBaseUri + recentPostsUri);
        SelenideElement pageTitle = $(byClassName(entryTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), recentPostsTitle);
    }

    /**
     * TestRecentCommentsLinkClick
     * Verify that clicking on the first link in the Recent Comments links goes to the expected comment.
     */
    @Test
    public void TestRecentCommentsLinkClick() {
        // Have to scroll to the last item in the Recent Posts lists for the comments to be visible
        ElementsCollection listItems = $$(byXpath(sidebarRecentPostsListXPath + "/li"));
        listItems.get(4).scrollTo();

        // Now click on the actual comment link
        $(byXpath(sidebarRecentCommentsListXPath + "/li/a")).click();
        Assert.assertEquals(url(), wpBaseUri + recentCommentsUri);
        SelenideElement pageTitle = $(byClassName(entryTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), recentCommentsTitle);
    }

    /**
     * TestArchivesLinkClick
     * Verify that clicking on the first link in the Archives links goes to the expected archives page.
     */
    @Test
    public void TestArchivesLinkClick() {
        // Have to scroll to the last item in the Recent Posts lists for the archives to be visible
        ElementsCollection listItems = $$(byXpath(sidebarRecentPostsListXPath + "/li"));
        listItems.get(4).scrollTo();

        // Now click on the actual archives link
        $(byXpath(sidebarArchivesListXPath + "/li/a")).click();
        Assert.assertEquals(url(), wpBaseUri + archivesUri);
        SelenideElement pageTitle = $(byClassName(pageTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), archivesString + archivesTitle);
    }

    /**
     * TestCategoriesLinkClick
     * Verify that clicking on the first link in the Categories links goes to the expected category page.
     */
    @Test
    public void TestCategoriesLinkClick() {
        // Have to scroll to the last item in the Recent Posts lists for the archives to be visible
        ElementsCollection listItems = $$(byXpath(sidebarRecentPostsListXPath + "/li"));
        listItems.get(4).scrollTo();

        // Now click on the actual category link
        $(byXpath(sidebarCategoriesListXPath + "/li/a")).click();
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
        // Have to scroll to the last item in the Recent Comments lists for the meta links to be visible
        ElementsCollection listItems = $$(byXpath(sidebarRecentCommentsListXPath + "/li"));
        listItems.get(0).scrollTo();

        // Now click on the actual log in link
        $(byXpath(sidebarMetaListXPath + "/li/a")).click();
        Assert.assertEquals(url(), wpBaseUri + metaLoginUri);

        // Hit back to go back to the homepage for further testing
        back();
    }
}

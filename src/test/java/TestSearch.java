import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestSearch
 * @author Angela Korra'ti
 * Last updated 7/4/2023
 * This class conducts functionality tests against the sidebar search widget on the homepage of the test WordPress
 * site. (Basic "does this element exist" tests are included in the TestSidebar class.)
 *
 */
public class TestSearch extends WPSidebar {
    WPSidebar wpSidebar;
    String targetUri;

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        open(wpBaseUri);
        targetUri = wpBaseUri;
        WPHomepage wpHomepage = new WPHomepage();
        wpSidebar = wpHomepage.wpSidebar;
    }

    /**
     * TestSearchForFaerieBloodPressEnter
     * This method tests putting the search string "Faerie Blood" into the search box and pressing Enter
     * to activate the search.
     */
    @Test
    public void TestSearchForFaerieBloodPressEnter() {
        // Do the search
        $(byXpath(sidebarSearchInputXPath)).setValue(searchString).pressEnter();

        // Make sure the title for the page includes the search string
        SelenideElement pageTitle = $(byClassName(pageTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), searchResultsString + searchString);

        // Make sure the URL we land on has the search arguments included
        String targetUri = wpBaseUri + searchUri;
        Assert.assertEquals(url(), targetUri);
    }

    /**
     * TestSearchForFaerieBloodClick
     * This method tests putting the search string "Faerie Blood" into the search box and clicking
     * to activate the search.
     */
    @Test
    public void TestSearchForFaerieBloodClick() {
        // Do the search
        $(byXpath(sidebarSearchInputXPath)).setValue(searchString);
        $(byXpath(sidebarSearchButtonXPath)).click();

        // Make sure the URL we land on has the search arguments included
        String targetUri = wpBaseUri + searchUri;
        Assert.assertEquals(url(), targetUri);

        // Make sure the title for the page includes the search string
        SelenideElement pageTitle = $(byClassName(pageTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), searchResultsString + searchString);
    }

    /**
     * TestSearchForWalkTheWardsPressEnter
     * This method puts the search string "Walk the Wards" into the search box and verifies that the search reports
     * no results found. The search is activated by a Press Enter event.
     */
    @Test
    public void TestSearchForWalkTheWardsPressEnter() {
        // Do the search
        $(byXpath(sidebarSearchInputXPath)).setValue(searchNoResultsString).pressEnter();

        // Make sure the title for the page includes the no results search message
        SelenideElement pageTitle = $(byClassName(pageTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), searchNoResultsMessage);

        // Make sure the URL we land on has the search arguments included
        String targetUri = wpBaseUri + searchNoResultsUri;
        Assert.assertEquals(url(), targetUri);
    }

    /**
     * TestSearchForWalkTheWardsClick
     * This method puts the search string "Walk the Wards" into the search box and verifies that the search reports
     * no results found. The search is activated by a Click event.
     */
    @Test
    public void TestSearchForWalkTheWardsClick() {
        // Do the search
        $(byXpath(sidebarSearchInputXPath)).setValue(searchNoResultsString);
        $(byXpath(sidebarSearchButtonXPath)).click();

        // Make sure the URL we land on has the search arguments included
        String targetUri = wpBaseUri + searchNoResultsUri;
        Assert.assertEquals(url(), targetUri);

        // Make sure the title for the page includes the no results search message
        SelenideElement pageTitle = $(byClassName(pageTitleClass));
        pageTitle.should(exist).shouldBe(visible);
        Assert.assertEquals(pageTitle.text(), searchNoResultsMessage);
    }
}
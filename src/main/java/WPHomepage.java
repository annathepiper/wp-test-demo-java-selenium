import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

/**
 * WPHomepage
 * @author Angela Korra'ti
 *
 * Last updated 4/26/2019
 * This is the WPHomepage helper class that defines the structure of the homepage page object.
 */
class WPHomepage extends BaseTest {
    WPMenu wpMenu;
    WPSidebar wpSidebar;
    WPFooter wpFooter;

    /**
     * Constructor for the class.
     */
    WPHomepage() {
        wpMenu = new WPMenu();
        wpSidebar = new WPSidebar();
        wpFooter = new WPFooter();
    }

    /**
     * siteTitleElement
     * @return Selenide element that refers to the site title
     */
    SelenideElement siteTitleElement() {
        return $(byClassName(siteTitleClass));
    }

    /**
     * siteTitle
     * @return String containing the text of the site title
     */
    String siteTitle() {
        return siteTitleElement().text();
    }

    /**
     * siteDescriptionElement
     * @return Selenide element that refers to the site title
     */
    SelenideElement siteDescriptionElement() {
        return $(byClassName(siteDescriptionClass));
    }

    /**
     * siteDescription
     * @return String containing the text of the site description
     */
    String siteDescription() {
        return siteDescriptionElement().text();
    }

    /**
     * contentAreaElement
     * @return Selenide element that refers to the content area
     */
    SelenideElement contentAreaElement() {
        return $(byId(contentId));
    }

    /**
     * primaryContentAreaElement
     * @return Selenide element that refers to the primary content area
     */
    SelenideElement primaryContentAreaElement() {
        return $(byId(primaryContentId));
    }

    /**
     * secondaryContentAreaElement
     * @return Selenide element that refers to the secondary content area
     */
    SelenideElement secondaryContentAreaElement() {
        return $(byId(secondaryContentId));
    }
}

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

/**
 * WPPost
 * @author Angela Korra'ti
 *
 * Last updated 5/9/2019
 * This is the WPPost helper class that defines the structure of a post object.
 */
public class WPPost extends BaseTest {
    WPMenu wpMenu;
    WPSidebar wpSidebar;
    WPFooter wpFooter;

    /**
     * Constructor for the class.
     */
    WPPost() {
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

    /**
     * postTitleElement
     * @return Selenide element representing the title of the post
     */
    SelenideElement postTitleElement() {
        return $(byClassName(entryTitleClass));
    }

    /**
     * postTitleText
     * @return String containing the title of the post
     */
    String postTitleText() {
        return postTitleElement().text();
    }
}

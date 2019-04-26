import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

/**
 * WPPost
 * @author Angela Korra'ti
 *
 * Last updated 4/26/2019
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

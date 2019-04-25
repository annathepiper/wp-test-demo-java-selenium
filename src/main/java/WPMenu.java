import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

/**
 * WPMenu
 * @author Angela Korra'ti
 *
 * Last updated 4/24/2019
 * This is the WPMenu helper class that defines the structure of a menu page object.
 */
public class WPMenu extends BaseTest {

    /**
     * menuElement
     * @return Selenide element that refers to the primary menu
     */
    SelenideElement menuElement() {
        return $(byId(menuId));
    }

    /**
     * homeMenuElement
     * @return Selenide element that refers to the Home item on the menu
     */
    SelenideElement homeMenuElement() {
        return $(byXpath(menuHomeXPath));
    }

    /**
     * homeMenuText
     * @return String containing the text of the Home item on the menu
     */
    String homeMenuText() {
        return homeMenuElement().text();
    }

    /**
     * homeMenuLink
     * @return String containing the link of the Home item on the menu
     */
    String homeMenuLink() {
        return homeMenuElement().getAttribute("href");
    }

    /**
     * aboutMenuElement
     * @return Selenide element that refers to the About item on the menu
     */
    SelenideElement aboutMenuElement() {
        return $(byXpath(menuAboutXPath));
    }

    /**
     * aboutMenuText
     * @return String containing the text of the About item on the menu
     */
    String aboutMenuText() {
        return aboutMenuElement().text();
    }

    /**
     * aboutMenuLink
     * @return String containing the link of the About item on the menu
     */
    String aboutMenuLink() {
        return aboutMenuElement().getAttribute("href");
    }

    /**
     * booksMenuElement
     * @return Selenide element that refers to the Books item on the menu
     */
    SelenideElement booksMenuElement() {
        return $(byXpath(menuBooksXPath));
    }

    /**
     * booksMenuText
     * @return String containing the text of the Books item on the menu
     */
    String booksMenuText() {
        return booksMenuElement().text();
    }

    /**
     * booksMenuLink
     * @return String containing the link of the Books item on the menu
     */
    String booksMenuLink() {
        return booksMenuElement().getAttribute("href");
    }

    /**
     * blogMenuElement
     * @return Selenide element that refers to the Blog item on the menu
     */
    SelenideElement blogMenuElement() {
        return $(byXpath(menuBlogXPath));
    }

    /**
     * blogMenuText
     * @return String containing the text of the Blog item on the menu
     */
    String blogMenuText() {
        return blogMenuElement().text();
    }

    /**
     * blogMenuLink
     * @return String containing the link of the Blog item on the menu
     */
    String blogMenuLink() {
        return blogMenuElement().getAttribute("href");
    }

    /**
     * contactMenuElement
     * @return Selenide element that refers to the Contact item on the menu
     */
    SelenideElement contactMenuElement() {
        return $(byXpath(menuContactXPath));
    }

    /**
     * contactMenuText
     * @return String containing the text of the Contact item on the menu
     */
    String contactMenuText() {
        return contactMenuElement().text();
    }

    /**
     * contactMenuLink
     * @return String containing the link of the Contact item on the menu
     */
    String contactMenuLink() {
        return contactMenuElement().getAttribute("href");
    }

    /**
     * storeMenuElement
     * @return Selenide element that refers to the Store item on the menu
     */
    SelenideElement storeMenuElement() {
        return $(byXpath(menuStoreXPath));
    }

    /**
     * storeMenuText
     * @return String containing the text of the Store item on the menu
     */
    String storeMenuText() {
        return storeMenuElement().text();
    }

    /**
     * storeMenuLink
     * @return String containing the link of the Store item on the menu
     */
    String storeMenuLink() {
        return storeMenuElement().getAttribute("href");
    }
}

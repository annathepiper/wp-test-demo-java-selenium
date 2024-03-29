import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

/**
 * WPMenu
 * @author Angela Korra'ti
 * Last updated 7/4/2023
 * This is the WPMenu helper class that defines the structure of a menu page object.
 */
public class WPMenu extends BaseTest {
    // Primary menu items
    static String menuId;
    static String menuHomeXPath;
    static String menuHomeText;
    static String menuHomeLink;
    static String menuAboutXPath;
    static String menuAboutText;
    static String menuAboutLink;
    static String menuBooksXPath;
    static String menuBooksText;
    static String menuBooksLink;
    static String menuBlogXPath;
    static String menuBlogText;
    static String menuBlogLink;
    static String menuContactXPath;
    static String menuContactText;
    static String menuContactLink;
    static String menuStoreXPath;
    static String menuStoreText;
    static String menuStoreLink;

    // Secondary menu items
    static String submenuBooksXPath;
    static String submenuHomeXPath;
    static String submenuHomeText;
    static String submenuHomeLink;
    static String submenuFaerieXPath;
    static String submenuFaerieText;
    static String submenuFaerieLink;
    static String submenuBoneXPath;
    static String submenuBoneText;
    static String submenuBoneLink;
    static String submenuValorXPath;
    static String submenuValorText;
    static String submenuValorLink;
    static String submenuVengeanceXPath;
    static String submenuVengeanceText;
    static String submenuVengeanceLink;
    static String submenuVictoryXPath;
    static String submenuVictoryText;
    static String submenuVictoryLink;
    static String submenuShortXPath;
    static String submenuShortText;
    static String submenuShortLink;
    static String submenuStoreXPath;
    static String submenuStoreText;
    static String submenuStoreLink;

    /**
     * Constructor for the class
     */
    WPMenu() {
        // Items pertaining to the primary menu items
        menuId = rb.getString("menuId");
        menuHomeXPath = rb.getString("menuHomeXPath");
        menuHomeText = rb.getString("menuHomeText");
        menuHomeLink = rb.getString("menuHomeLink");
        menuAboutXPath = rb.getString("menuAboutXPath");
        menuAboutText = rb.getString("menuAboutText");
        menuAboutLink = rb.getString("menuAboutLink");
        menuBooksXPath = rb.getString("menuBooksXPath");
        menuBooksText = rb.getString("menuBooksText");
        menuBooksLink = rb.getString("menuBooksLink");
        menuBlogXPath = rb.getString("menuBlogXPath");
        menuBlogText = rb.getString("menuBlogText");
        menuBlogLink = rb.getString("menuBlogLink");
        menuContactXPath = rb.getString("menuContactXPath");
        menuContactText = rb.getString("menuContactText");
        menuContactLink = rb.getString("menuContactLink");
        menuStoreXPath = rb.getString("menuStoreXPath");
        menuStoreText = rb.getString("menuStoreText");
        menuStoreLink = rb.getString("menuStoreLink");

        // Items pertaining to the submenus
        submenuBooksXPath = rb.getString("submenuBooksXPath");
        submenuHomeXPath = rb.getString("submenuHomeXPath");
        submenuHomeText = rb.getString("submenuHomeText");
        submenuHomeLink = rb.getString("submenuHomeLink");
        submenuFaerieXPath = rb.getString("submenuFaerieXPath");
        submenuFaerieText = rb.getString("submenuFaerieText");
        submenuFaerieLink = rb.getString("submenuFaerieLink");
        submenuBoneXPath = rb.getString("submenuBoneXPath");
        submenuBoneText = rb.getString("submenuBoneText");
        submenuBoneLink = rb.getString("submenuBoneLink");
        submenuValorXPath = rb.getString("submenuValorXPath");
        submenuValorText = rb.getString("submenuValorText");
        submenuValorLink = rb.getString("submenuValorLink");
        submenuVengeanceXPath = rb.getString("submenuVengeanceXPath");
        submenuVengeanceText = rb.getString("submenuVengeanceText");
        submenuVengeanceLink = rb.getString("submenuVengeanceLink");
        submenuVictoryXPath = rb.getString("submenuVictoryXPath");
        submenuVictoryText = rb.getString("submenuVictoryText");
        submenuVictoryLink = rb.getString("submenuVictoryLink");
        submenuShortXPath = rb.getString("submenuShortXPath");
        submenuShortText = rb.getString("submenuShortText");
        submenuShortLink = rb.getString("submenuShortLink");
        submenuStoreXPath = rb.getString("submenuStoreXPath");
        submenuStoreText = rb.getString("submenuStoreText");
        submenuStoreLink = rb.getString("submenuStoreLink");
    }

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
     * homeSubmenuElement
     * @return Selenide element that refers to the submenu under Home
     */
    SelenideElement homeSubmenuElement() {
        return $(byXpath(submenuHomeXPath));
    }

    /**
     * homeSubmenuText
     * @return String containing the text of the submenu under Home
     */
    String homeSubmenuText() {
        return homeSubmenuElement().text();
    }

    /**
     * homeSubmenuLink
     * @return String containing the link of the submenu under Home
     */
    String homeSubmenuLink() {
        return homeSubmenuElement().getAttribute("href");
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
     * booksSubmenuElement
     * @return Selenide element that refers to the submenu under Books
     */
    SelenideElement booksSubmenuElement() {
        return $(byXpath(submenuBooksXPath));
    }

    /**
     * faerieSubmenuElement
     * @return Selenide element that refers to the Faerie Blood item under Books
     */
    SelenideElement faerieSubmenuElement() {
        return $(byXpath(submenuFaerieXPath));
    }

    /**
     * faerieSubmenuText
     * @return Text of the Faerie Blood item under Books
     */
    String faerieSubmenuText() {
        return faerieSubmenuElement().text();
    }

    /**
     * faerieSubmenuLink
     * @return Link of the Faerie Blood item under Books
     */
    String faerieSubmenuLink() {
        return faerieSubmenuElement().getAttribute("href");
    }

    /**
     * boneSubmenuElement
     * @return Selenide element that refers to the Bone Walker item under Books
     */
    SelenideElement boneSubmenuElement() {
        return $(byXpath(submenuBoneXPath));
    }

    /**
     * boneSubmenuText
     * @return Text of the Bone Walker item under Books
     */
    String boneSubmenuText() {
        return boneSubmenuElement().text();
    }

    /**
     * boneSubmenuLink
     * @return Link of the Bone Walker item under Books
     */
    String boneSubmenuLink() {
        return boneSubmenuElement().getAttribute("href");
    }

    /**
     * valorSubmenuElement
     * @return Selenide element that refers to the Valor of the Healer item under Books
     */
    SelenideElement valorSubmenuElement() {
        return $(byXpath(submenuValorXPath));
    }

    /**
     * valorSubmenuText
     * @return Text of the Valor of the Healer item under Books
     */
    String valorSubmenuText() {
        return valorSubmenuElement().text();
    }

    /**
     * valorSubmenuLink
     * @return Link of the Valor of the Healer item under Books
     */
    String valorSubmenuLink() {
        return valorSubmenuElement().getAttribute("href");
    }

    /**
     * vengeanceSubmenuElement
     * @return Selenide element that refers to the Vengeance of the Hunter item under Books
     */
    SelenideElement vengeanceSubmenuElement() {
        return $(byXpath(submenuVengeanceXPath));
    }

    /**
     * vengeanceSubmenuText
     * @return Text of the Vengeance of the Hunter item under Books
     */
    String vengeanceSubmenuText() {
        return vengeanceSubmenuElement().text();
    }

    /**
     * vengeanceSubmenuLink
     * @return Link of the Vengeance of the Hunter item under Books
     */
    String vengeanceSubmenuLink() {
        return vengeanceSubmenuElement().getAttribute("href");
    }

    /**
     * victorySubmenuElement
     * @return Selenide element that refers to the Victory of the Hawk item under Books
     */
    SelenideElement victorySubmenuElement() {
        return $(byXpath(submenuVictoryXPath));
    }

    /**
     * victorySubmenuText
     * @return Text of the Victory of the Hawk item under Books
     */
    String victorySubmenuText() {
        return victorySubmenuElement().text();
    }

    /**
     * victorySubmenuLink
     * @return Link of the Victory of the Hawk item under Books
     */
    String victorySubmenuLink() {
        return victorySubmenuElement().getAttribute("href");
    }

    /**
     * shortSubmenuElement
     * @return Selenide element that refers to the Short Stories item under Books
     */
    SelenideElement shortSubmenuElement() {
        return $(byXpath(submenuShortXPath));
    }

    /**
     * shortSubmenuText
     * @return Text of the Short Stories item under Books
     */
    String shortSubmenuText() {
        return shortSubmenuElement().text();
    }

    /**
     * shortSubmenuLink
     * @return Link of the Short Stories item under Books
     */
    String shortSubmenuLink() {
        return shortSubmenuElement().getAttribute("href");
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

    /**
     * storeSubmenuElement
     * @return Selenide element that refers to the submenu under Store
     */
    SelenideElement storeSubmenuElement() {
        return $(byXpath(submenuStoreXPath));
    }

    /**
     * storeSubmenuText
     * @return String containing the text of the submenu under Store
     */
    String storeSubmenuText() {
        return storeSubmenuElement().text();
    }

    /**
     * storeSubmenuLink
     * @return String containing the link of the submenu under Store
     */
    String storeSubmenuLink() {
        return storeSubmenuElement().getAttribute("href");
    }
}

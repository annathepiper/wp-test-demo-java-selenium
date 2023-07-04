import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class WPLogin extends BaseTest {
    // Login items
    static String loginUsernameXPath;
    static String loginPasswordXPath;
    static String loginButtonXPath;
    static String loginBackToBlogXPath;

    /**
     * Constructor for the class
     */
    WPLogin() {
        loginUsernameXPath = rb.getString("loginUsernameXPath");
        loginPasswordXPath = rb.getString("loginPasswordXPath");
        loginButtonXPath = rb.getString("loginButtonXPath");
        loginBackToBlogXPath = rb.getString("loginBackToBlog");
    }

    /**
     * usernameField
     * @return Selenide element for the username field on the login page
     */
    SelenideElement usernameField() {
        return $(byXpath(loginUsernameXPath));
    }

    /**
     * passwordField
     * @return Selenide element for the password field on the login page
     */
    SelenideElement passwordField() {
        return $(byXpath(loginPasswordXPath));
    }

    /**
     * loginButton
     * @return Selenide element for the Log In button on the login page
     */
    SelenideElement loginButton() {
        return $(byXpath(loginButtonXPath));
    }

    /**
     * loginBackToBlog
     * @return Selenide element for the link to return to the homepage on the login page
     */
    SelenideElement loginBackToBlog() { return $(byXpath(loginBackToBlogXPath)); }
}

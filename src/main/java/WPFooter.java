import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

/**
 * WPFooter
 * @author Angela Korra'ti
 *
 * Last updated 4/23/2019
 * This is the WPFooter helper class that defines the structure of a footer page object.
 */
class WPFooter extends BaseTest {
    // Footer
    static String footerId;
    static String footerSocialMenuId;
    static String footerSiteInfoClass;
    static String footerSiteTitleXPath;
    static String footerWPLinkXPath;
    static String footerWPLink;
    static String footerWPLinkText;
    static String footerSocialFacebookXPath;
    static String footerSocialFacebookLink;
    static String footerSocialFacebookText;
    static String footerSocialMastodonXPath;
    static String footerSocialMastodonLink;
    static String footerSocialMastodonText;
    static String footerSocialGithubXPath;
    static String footerSocialGithubLink;
    static String footerSocialGithubText;
    static String footerSocialLinkedInXPath;
    //NOTE: Commenting this string out because I can't actually use it in the footer test cases, due to hitting it
    //triggering a LinkedIn auth wall. But keeping it here for reference in case that behavior changes and I can
    //wake this string up again.
    //static String footerSocialLinkedInLink;
    static String footerSocialLinkedInText;

    /**
     * Constructor for the class
     */
    WPFooter() {
        // Items pertaining to the footer
        footerId = rb.getString("footerId");
        footerSocialMenuId = rb.getString("footerSocialMenuId");
        footerSiteInfoClass = rb.getString("footerSiteInfoClass");
        footerSiteTitleXPath = rb.getString("footerSiteTitleXPath");
        footerWPLinkXPath = rb.getString("footerWPLinkXPath");
        footerWPLink = rb.getString("footerWPLink");
        footerWPLinkText = rb.getString("footerWPLinkText");
        footerSocialFacebookXPath = rb.getString("footerSocialFacebookXPath");
        footerSocialFacebookLink = rb.getString("footerSocialFacebookLink");
        footerSocialFacebookText = rb.getString("footerSocialFacebookText");
        footerSocialMastodonXPath = rb.getString("footerSocialMastodonXPath");
        footerSocialMastodonLink = rb.getString("footerSocialMastodonLink");
        footerSocialMastodonText = rb.getString("footerSocialMastodonText");
        footerSocialGithubXPath = rb.getString("footerSocialGithubXPath");
        footerSocialGithubLink = rb.getString("footerSocialGithubLink");
        footerSocialGithubText = rb.getString("footerSocialGithubText");
        footerSocialLinkedInXPath = rb.getString("footerSocialLinkedInXPath");
        // NOTE: Commenting this string out because for now I can't actually use it, due to hitting this link
        // triggering a LinkedIn auth wall. Keeping it rather than deleting it in case the behavior changes.
        // footerSocialLinkedInLink = rb.getString("footerSocialLinkedInLink");
        footerSocialLinkedInText = rb.getString("footerSocialLinkedInText");
    }

    /**
     * footerElement
     * @return Selenide element that represents the footer
     */
    SelenideElement footerElement() {
        return $(byId(footerId));
    }

    /**
     * socialMenuElement
     * @return Selenide element that represents the social media menu
     */
    SelenideElement socialMenuElement() {
        return $(byId(footerSocialMenuId));
    }

    /**
     * siteInfoElement
     * @return Selenide element that represents the site info area
     */
    SelenideElement siteInfoElement() {
        return $(byClassName(footerSiteInfoClass));
    }

    /**
     * siteTitleElement
     * @return Selenide element that represents the site title link
     */
    SelenideElement siteTitleElement() {
        return $(byXpath(footerSiteTitleXPath));
    }

    /**
     * siteTitleText
     * @return String containing the text of the site title
     */
    String siteTitleText() {
        return siteTitleElement().text();
    }

    /**
     * wordpressElement
     * @return Selenide element representing the Wordpress link
     */
    SelenideElement wordpressElement() {
        return $(byXpath(footerWPLinkXPath));
    }

    /**
     * wordpressElementText
     * @return String containing the text of the Wordpress element
     */
    String wordpressElementText() {
        return wordpressElement().text();
    }

    /**
     * socialFacebookElement
     * @return Selenide element representing the Facebook link in the social section
     */
    SelenideElement socialFacebookElement() {
        return $(byXpath(footerSocialFacebookXPath));
    }

    /**
     * socialFacebookText
     * @return String containing the text from the Facebook link in the social section
     */
    String socialFacebookText() {
        return socialFacebookElement().text();
    }

    /**
     * socialMastodonElement
     * @return Selenide element representing the Mastodon link in the social section
     */
    SelenideElement socialMastodonElement() {
        return $(byXpath(footerSocialMastodonXPath));
    }

    /**
     * socialTwitterText
     * @return String containing the text from the Mastodon link in the social section
     */
    String socialMastodonText() {
        return socialMastodonElement().text();
    }

    /**
     * socialGithubElement
     * @return Selenide element representing the Github link in the social section
     */
    SelenideElement socialGithubElement() {
        return $(byXpath(footerSocialGithubXPath));
    }

    /**
     * socialGithubText
     * @return String containing the text from the Github link in the social section
     */
    String socialGithubText() {
        return socialGithubElement().text();
    }

    /**
     * socialLinkedInElement
     * @return Selenide element representing the LinkedIn link in the social section
     */
    SelenideElement socialLinkedInElement() {
        return $(byXpath(footerSocialLinkedInXPath));
    }

    /**
     * socialLinkedInText
     * @return String containing the text from the LinkedIn link in the social section
     */
    String socialLinkedInText() {
        return socialLinkedInElement().text();
    }
}

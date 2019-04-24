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
     * socialTwitterElement
     * @return Selenide element representing the Twitter link in the social section
     */
    SelenideElement socialTwitterElement() {
        return $(byXpath(footerSocialTwitterXPath));
    }

    /**
     * socialTwitterText
     * @return String containing the text from the Twitter link in the social section
     */
    String socialTwitterText() {
        return socialTwitterElement().text();
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

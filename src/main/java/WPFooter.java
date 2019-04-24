import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

/**
 * WPFooter
 * @author Angela Korra'ti
 *
 * Last updated 4/23/2019
 * This is the WPFooter helper class that defines the structure of a footer page object.
 */
public class WPFooter extends BaseTest {

    /**
     * footerElement
     * @return Selenide element that represents the footer
     */
    public SelenideElement footerElement() {
        return $(byId(footerId));
    }

    /**
     * socialMenuElement
     * @return Selenide element that represents the social media menu
     */
    public SelenideElement socialMenuElement() {
        return $(byId(footerSocialMenuId));
    }

    /**
     * siteInfoElement
     * @return Selenide element that represents the site info area
     */
    public SelenideElement siteInfoElement() {
        return $(byClassName(footerSiteInfoClass));
    }
}

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostMenu
 * @author Angela Korra'ti
 *
 * Last updated 4/25/2019
 * This test class extends the TestMenu class, and conducts menu tests against an example post.
 */
public class TestPostMenu extends TestMenu {
    private WPMenu wpMenu;

    /**
     * Setup
     * This method opens up an example post of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        open(wpPostUri);
        WPPost wpPost = new WPPost();
        wpMenu = wpPost.wpMenu;
    }

    /**
     * TestHomeMenuPresent
     * This method verifies that the first visible item on the menu is Home.
     */
    @Test
    public void TestHomeMenuPresent() {
        verifyHomeMenuPresent(wpMenu);
    }

    /**
     * TestHomeMenuLink
     * This method verifies that the first visible item on the menu has the correct link.
     */
    @Test
    public void TestHomeMenuLink() {
        verifyHomeMenuLink(wpMenu);
    }

    /**
     * TestHomeMenuClick
     * This method clicks on the first visible item on the menu and verifies you land on the homepage.
     */
    @Test
    public void TestHomeMenuClick() {
        verifyHomeMenuClick(wpMenu);
    }

    /**
     * TestAboutMenuPresent
     * This method verifies that the second visible item on the menu is About.
     */
    @Test
    public void TestAboutMenuPresent() {
        verifyAboutMenuPresent(wpMenu);
    }

    /**
     * TestAboutMenuLink
     * This method verifies that the second visible item on the menu has the correct link.
     */
    @Test
    public void TestAboutMenuLink() {
        verifyAboutMenuLink(wpMenu);
    }

    /**
     * TestAboutMenuClick
     * This method clicks on the second visible item on the menu and verifies you land on the About page.
     */
    @Test
    public void TestAboutMenuClick() {
        verifyAboutMenuClick(wpMenu);
    }

    /**
     * TestBooksMenuPresent
     * This method verifies that the third visible item on the menu is Books.
     */
    @Test
    public void TestBooksMenuPresent() {
        verifyBooksMenuPresent(wpMenu);
    }

    /**
     * TestBooksMenuLink
     * This method verifies that the third visible item on the menu has the correct link.
     */
    @Test
    public void TestBooksMenuLink() {
        verifyBooksMenuLink(wpMenu);
    }

    /**
     * TestBooksMenuClick
     * This method clicks on the third visible item on the menu and verifies you land on the Books page.
     */
    @Test
    public void TestBooksMenuClick() {
        verifyBooksMenuClick(wpMenu);
    }

    /**
     * TestBlogMenuPresent
     * This method verifies that the fourth visible item on the menu is Blog.
     */
    @Test
    public void TestBlogMenuPresent() {
        verifyBlogMenuPresent(wpMenu);
    }

    /**
     * TestBlogMenuLink
     * This method verifies that the fourth visible item on the menu has the correct link.
     */
    @Test
    public void TestBlogMenuLink() {
        verifyBlogMenuLink(wpMenu);
    }

    /**
     * TestBlogMenuClick
     * This method clicks on the fourth visible item on the menu and verifies you land on the Blog page.
     */
    @Test
    public void TestBlogMenuClick() {
        verifyBlogMenuClick(wpMenu);
    }

    /**
     * TestContactMenuPresent
     * This method verifies that the fifth visible item on the menu is Contact.
     */
    @Test
    public void TestContactMenuPresent() {
        verifyContactMenuPresent(wpMenu);
    }

    /**
     * TestContactMenuLink
     * This method verifies that the fifth visible item on the menu has the correct link.
     */
    @Test
    public void TestContactMenuLink() {
        verifyContactMenuLink(wpMenu);
    }

    /**
     * TestContactMenuClick
     * This method clicks on the fifth visible item on the menu and verifies you land on the Contact page.
     */
    @Test
    public void TestContactMenuClick() {
        verifyContactMenuClick(wpMenu);
    }

    /**
     * TestStoreMenuPresent
     * This method verifies that the sixth visible item on the menu is Store.
     */
    @Test
    public void TestStoreMenuPresent() {
        verifyStoreMenuPresent(wpMenu);
    }

    /**
     * TestStoreMenuLink
     * This method verifies that the sixth visible item on the menu has the correct link.
     */
    @Test
    public void TestStoreMenuLink() {
        verifyStoreMenuLink(wpMenu);
    }

    /**
     * TestStoreMenuClick
     * This method clicks on the sixth visible item on the menu and verifies you land on the Store page.
     */
    @Test
    public void TestStoreMenuClick() {
        verifyStoreMenuClick(wpMenu);
    }
}

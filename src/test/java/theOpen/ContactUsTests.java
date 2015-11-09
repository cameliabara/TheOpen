package theOpen;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import screens.ContactUsScreen;
import screens.MainPageScreen;

import java.util.concurrent.TimeUnit;

/**
 * Created by oabara on 10/29/2015.
 */
public class ContactUsTests {

    public WebDriver driver = new FirefoxDriver();
    MainPageScreen mainPageScreen = PageFactory.initElements(driver, MainPageScreen.class);
    ContactUsScreen contactUsScreen = PageFactory.initElements(driver, ContactUsScreen.class);
    JavascriptExecutor jse = (JavascriptExecutor)driver;

    @Before
    public void setUp() {

        driver.get("http://randa2015.endavadigital.test/");
        driver.manage().window().maximize();
    }

    //check that Contact Us Page is loaded
    @Test
	public void openContactUsPage() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

	}

    //check that an error is displayed for empty name field
    @Test
    public void contactUsEmptyNameValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterEmailTextBox().sendKeys("lskdasidlk");

        new Select(contactUsScreen.getDepartment()).selectByVisibleText("General");
        contactUsScreen.getQueryTextBox().sendKeys("asasasdasdsa");
        contactUsScreen.getSubmitQuery().click();

        Assert.assertTrue("Empty email field error might not be displayed", contactUsScreen.getEmptyNameError().isDisplayed());

    }

    //check that an error is displayed for empty email field
    @Test
    public void contactUsEmailValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("");

        new Select(contactUsScreen.getDepartment()).selectByVisibleText("General");
        contactUsScreen.getQueryTextBox().sendKeys("asasasdasdsa");
        contactUsScreen.getSubmitQuery().click();

        Assert.assertTrue("Empty email field error might not be displayed", contactUsScreen.getEmptyEmailError().isDisplayed());
        Assert.assertTrue("Empty email error might not be the one expected", contactUsScreen.getEmptyEmailError().getText().contains("This field is required."));

    }

    //check that an error is displayed for invalid email field
    @Test
    public void contactUsValidEmailValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("asdfff");

        new Select(contactUsScreen.getDepartment()).selectByVisibleText("General");
        contactUsScreen.getQueryTextBox().sendKeys("asasasdasdsa");
        contactUsScreen.getSubmitQuery().click();

        Assert.assertTrue("Email error might not be displayed", contactUsScreen.getEmptyEmailError().isDisplayed());
        Assert.assertTrue("Email error might not be the one expected", contactUsScreen.getEmptyEmailError().getText().contains("Please enter a valid email address."));

    }

    //check that an error is displayed for empty department field
    @Test
    public void contactUsDepartmentValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("dfafdadf@sdad.com");

        contactUsScreen.getQueryTextBox().sendKeys("asasasdasdsa");
        contactUsScreen.getSubmitQuery().click();

        Assert.assertTrue("Empty department field error might not be displayed", contactUsScreen.getEmptyDepartmentError().isDisplayed());

    }

    //check that an error is displayed for empty query field
    @Test
    public void queryTextValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("dfafdadf@sdad.com");
        new Select(contactUsScreen.getDepartment()).selectByVisibleText("General");
        contactUsScreen.getSubmitQuery().click();

        Assert.assertTrue("Empty query text box error might not be displayed", contactUsScreen.getEmptyQueryError().isDisplayed());

    }

    //check that an error is displayed for empty form of play field
    @Test
    public void emptyFormOfPlayValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("dfafdadf@sdad.com");
        new Select(contactUsScreen.getDepartment()).selectByVisibleText("Rules of Golf Rules of Amateur Status");
        contactUsScreen.getYesRegardingCompetition().click();
        contactUsScreen.getCommitteeMember().click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        contactUsScreen.getSubmitQueryExpanded().click();

        Assert.assertTrue("Empty form of play error might not be displayed", contactUsScreen.getEmptyFormOfPlayError().isDisplayed());

    }

    //check that an error is displayed for empty format field
    @Test
    public void emptyFormatValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("dfafdadf@sdad.com");
        new Select(contactUsScreen.getDepartment()).selectByVisibleText("Rules of Golf Rules of Amateur Status");
        contactUsScreen.getYesRegardingCompetition().click();
        contactUsScreen.getCommitteeMember().click();
        new Select(contactUsScreen.getFormPlayAnswer()).selectByVisibleText("Match Play");
        contactUsScreen.getSubmitQueryExpanded().click();

        Assert.assertTrue("Empty form of play error might not be displayed", contactUsScreen.getEmptyFormatError().isDisplayed());

    }

    //check that an error is displayed if competition closed option is not selected
    @Test
    public void competitionClosedNotSelectedValidation() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("dfafdadf@sdad.com");
        new Select(contactUsScreen.getDepartment()).selectByVisibleText("Rules of Golf Rules of Amateur Status");
        contactUsScreen.getYesRegardingCompetition().click();
        contactUsScreen.getCommitteeMember().click();
        new Select(contactUsScreen.getFormPlayAnswer()).selectByVisibleText("Match Play");
        contactUsScreen.getFormat().sendKeys("sdasdsdsd");
        contactUsScreen.getSubmitQueryExpanded().click();

        Assert.assertTrue("Error for unselected competition closed option might not be displayed", contactUsScreen.getCompetitionClosedNotSelectedError().isDisplayed());

    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}

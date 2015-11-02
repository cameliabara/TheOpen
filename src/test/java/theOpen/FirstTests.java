package theOpen;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
public class FirstTests {

    public WebDriver driver = new FirefoxDriver();
    MainPageScreen mainPageScreen = PageFactory.initElements(driver, MainPageScreen.class);
    ContactUsScreen contactUsScreen = PageFactory.initElements(driver, ContactUsScreen.class);

    @Before
    public void setUp() {

        driver.get("http://randa2015.endavadigital.test/");
        driver.manage().window().maximize();
    }

//    @Test
//	public void openContactUsPage() {
//
//        mainPageScreen.getContactUsLink().click();
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));
//
//	}

    @Test
    public void contactUsEmailVerification() {

        mainPageScreen.getContactUsLink().click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        Assert.assertTrue("Text not found!", contactUsScreen.getContactUsText().getText().contains("Contact"));

        contactUsScreen.getEnterNameTextBox().sendKeys("AAAAA");
        contactUsScreen.getEnterEmailTextBox().sendKeys("");

        new Select(contactUsScreen.getDepartment()).selectByVisibleText("General");
        contactUsScreen.getQueryTextBox().sendKeys("asasasdasdsa");
        contactUsScreen.getSubmitQuery().click();

        Assert.assertTrue("Empty email field error might not be displayed", contactUsScreen.getEmptyEmailError().isDisplayed());

    }

    @After
    public void closeDriver() {
        driver.quit();
    }
}

package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by oabara on 10/29/2015.
 */
public class MainPageScreen {

    @FindBy(how = How.ID, using = "51B45C70A21D4955BCF3105C9C002F38")
    private static WebElement theRandA;

    @FindBy(how = How.ID, using = "9FA65706665048979306817FB51768A9")
    private static WebElement rulesAndEquipment;

    @FindBy(how = How.ID, using = "20A7CAA2CEB64728B3817018D88F7E49")
    private static WebElement championships;

    @FindBy(how = How.ID, using = "F3EE481771974BB5A2CE0EB57468010A")
    private static WebElement workingForGolf;

    @FindBy(how = How.XPATH, using = "//a[@class='brand sprite-global sprite-randa-header']")
    private static WebElement rAndALogo;

    @FindBy(how = How.XPATH, using = "//ul[@class='footer-misc-nav clearfix']//a[@title='Contact Us']")
    private static WebElement contactUsLink;


    public static WebElement getContactUsLink() {
        return contactUsLink;
    }

    public static void setContactUsLink(WebElement contactUsLink) {
        MainPageScreen.contactUsLink = contactUsLink;
    }

    public static WebElement getTheRandA() {
        return theRandA;
    }

    public static void setTheRandA(WebElement theRandA) {
        MainPageScreen.theRandA = theRandA;
    }

    public static WebElement getRulesAndEquipment() {
        return rulesAndEquipment;
    }

    public static void setRulesAndEquipment(WebElement rulesAndEquipment) {
        MainPageScreen.rulesAndEquipment = rulesAndEquipment;
    }

    public static WebElement getChampionships() {
        return championships;
    }

    public static void setChampionships(WebElement championships) {
        MainPageScreen.championships = championships;
    }

    public static WebElement getWorkingForGolf() {
        return workingForGolf;
    }

    public static void setWorkingForGolf(WebElement workingForGolf) {
        MainPageScreen.workingForGolf = workingForGolf;
    }

    public static WebElement getRAndALogo() {
        return rAndALogo;
    }

    public static void setRAndALogo(WebElement rAndALogo) {
        MainPageScreen.rAndALogo = rAndALogo;
    }
}

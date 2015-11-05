package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by oabara on 10/30/2015.
 */
public class ContactUsScreen {

    @FindBy(how = How.XPATH, using = "html/body/div[1]/main/section[2]/div[1]/h1")
    private static WebElement contactUsText;

    @FindBy(how = How.ID, using = "name")
    private static WebElement enterNameTextBox;

    @FindBy(how = How.ID, using = "email")
    private static WebElement enterEmailTextBox;

    @FindBy(how = How.ID, using = "country")
    private static WebElement enterCountryTextBox;

    @FindBy(how = How.ID, using = "departments")
    private static WebElement department;

    @FindBy(how = How.ID, using = "message")
    private static WebElement queryTextBox;

    @FindBy(how = How.ID, using = "submit")
    private static WebElement submitQuery;

    @FindBy(how = How.XPATH, using = "//input[@value='YES' and @name='queryQuestion']")
    private static WebElement yesRegardingCompetition;

    @FindBy(how = How.XPATH, using = "//input[@value='NO' and @name='queryQuestion']")
    private static WebElement noRegardingCompetition;

    @FindBy(how = How.XPATH, using = "//input[@value='Committee member']")
    private static WebElement committeeMember;

    @FindBy(how = How.XPATH, using = "//input[@value='Club Secretary']")
    private static WebElement clubSecretary;

    @FindBy(how = How.ID, using = "formPlayAnswer")
    private static WebElement formPlayAnswer;

    @FindBy(how = How.ID, using = "format")
    private static WebElement format;

    @FindBy(how = How.XPATH, using = "//input[@name='affirmativeOptions' and @value='YES']")
    private static WebElement yesCompetitionClosed;

    @FindBy(how = How.XPATH, using = "//input[@name='affirmativeOptions' and @value='YES']")
    private static WebElement noCompetitionClosed;

    @FindBy(how = How.XPATH, using = "//span[@class='help-block' and @for='email']")
    private static WebElement emptyEmailError;

    @FindBy(how = How.XPATH, using = "//span[@class='help-block' and @for='departments']")
    private static WebElement emptyDepartmentError;

    @FindBy(how = How.XPATH, using = "//span[@class='help-block' and @for='name']")
    private static WebElement emptyNameError;

    @FindBy(how = How.XPATH, using = "//span[@class='help-block' and @for='message']")
    private static WebElement emptyQueryError;

    @FindBy(how = How.XPATH, using = "//span[@class='help-block' and @for='formPlayAnswer']")
    private static WebElement emptyFormOfPlayError;

    @FindBy(how = How.XPATH, using = "//div[@id='hidden-form']//div[@id='messageDiv']//input[@id='submit']")
    private static WebElement submitQueryExpanded;

    @FindBy(how = How.XPATH, using = "//span[@class='help-block' and @for='format']")
    private static WebElement emptyFormatError;

    @FindBy(how = How.XPATH, using = "//span[@class='help-block' and @for='affirmativeOptions']")
    private static WebElement competitionClosedNotSelectedError;

    public static WebElement getCompetitionClosedNotSelectedError() {
        return competitionClosedNotSelectedError;
    }

    public static void setCompetitionClosedNotSelectedError(WebElement competitionClosedNotSelectedError) {
        ContactUsScreen.competitionClosedNotSelectedError = competitionClosedNotSelectedError;
    }

    public static WebElement getEmptyFormatError() {
        return emptyFormatError;
    }

    public static void setEmptyFormatError(WebElement emptyFormatError) {
        ContactUsScreen.emptyFormatError = emptyFormatError;
    }

    public static WebElement getSubmitQueryExpanded() {
        return submitQueryExpanded;
    }

    public static void setSubmitQueryExpanded(WebElement submitQueryExpanded) {
        ContactUsScreen.submitQueryExpanded = submitQueryExpanded;
    }

    public static WebElement getEmptyFormOfPlayError() {
        return emptyFormOfPlayError;
    }

    public static void setEmptyFormOfPlayError(WebElement emptyFormOfPlayError) {
        ContactUsScreen.emptyFormOfPlayError = emptyFormOfPlayError;
    }

    public static WebElement getEmptyQueryError() {
        return emptyQueryError;
    }

    public static void setEmptyQueryError(WebElement emptyQueryError) {
        ContactUsScreen.emptyQueryError = emptyQueryError;
    }

    public static WebElement getEmptyNameError() {
        return emptyNameError;
    }

    public static void setEmptyNameError(WebElement emptyNameError) {
        ContactUsScreen.emptyNameError = emptyNameError;
    }

    public static WebElement getEmptyDepartmentError() {
        return emptyDepartmentError;
    }

    public static void setEmptyDepartmentError(WebElement emptyDepartmentError) {
        ContactUsScreen.emptyDepartmentError = emptyDepartmentError;
    }

    public static WebElement getEmptyEmailError() {
        return emptyEmailError;
    }

    public static void setEmptyEmailError(WebElement emptyEmailError) {
        ContactUsScreen.emptyEmailError = emptyEmailError;
    }

    public static WebElement getNoCompetitionClosed() {
        return noCompetitionClosed;
    }

    public static void setNoCompetitionClosed(WebElement noCompetitionClosed) {
        ContactUsScreen.noCompetitionClosed = noCompetitionClosed;
    }

    public static WebElement getYesCompetitionClosed() {
        return yesCompetitionClosed;
    }

    public static void setYesCompetitionClosed(WebElement yesCompetitionClosed) {
        ContactUsScreen.yesCompetitionClosed = yesCompetitionClosed;
    }

    public static WebElement getFormat() {
        return format;
    }

    public static void setFormat(WebElement format) {
        ContactUsScreen.format = format;
    }

    public static WebElement getFormPlayAnswer() {
        return formPlayAnswer;
    }

    public static void setFormPlayAnswer(WebElement formPlayAnswer) {
        ContactUsScreen.formPlayAnswer = formPlayAnswer;
    }

    public static WebElement getClubSecretary() {
        return clubSecretary;
    }

    public static void setClubSecretary(WebElement clubSecretary) {
        ContactUsScreen.clubSecretary = clubSecretary;
    }

    public static WebElement getCommitteeMember() {
        return committeeMember;
    }

    public static void setCommitteeMember(WebElement committeeMember) {
        ContactUsScreen.committeeMember = committeeMember;
    }

    public static WebElement getNoRegardingCompetition() {
        return noRegardingCompetition;
    }

    public static void setNoRegardingCompetition(WebElement noRegardingCompetition) {
        ContactUsScreen.noRegardingCompetition = noRegardingCompetition;
    }

    public static WebElement getYesRegardingCompetition() {
        return yesRegardingCompetition;
    }

    public static void setYesRegardingCompetition(WebElement yesRegardingCompetition) {
        ContactUsScreen.yesRegardingCompetition = yesRegardingCompetition;
    }

    public static WebElement getSubmitQuery() {
        return submitQuery;
    }

    public static void setSubmitQuery(WebElement submitQuery) {
        ContactUsScreen.submitQuery = submitQuery;
    }

    public static WebElement getQueryTextBox() {
        return queryTextBox;
    }

    public static void setQueryTextBox(WebElement queryTextBox) {
        ContactUsScreen.queryTextBox = queryTextBox;
    }

    public static WebElement getDepartment() {
        return department;
    }

    public static void setDepartment(WebElement department) {
        ContactUsScreen.department = department;
    }

    public static WebElement getEnterCountryTextBox() {
        return enterCountryTextBox;
    }

    public static void setEnterCountryTextBox(WebElement enterCountryTextBox) {
        ContactUsScreen.enterCountryTextBox = enterCountryTextBox;
    }

    public static WebElement getEnterEmailTextBox() {
        return enterEmailTextBox;
    }

    public static void setEnterEmailTextBox(WebElement enterEmailTextBox) {
        ContactUsScreen.enterEmailTextBox = enterEmailTextBox;
    }

    public static WebElement getEnterNameTextBox() {
        return enterNameTextBox;
    }

    public static void setEnterNameTextBox(WebElement enterNameTextBox) {
        ContactUsScreen.enterNameTextBox = enterNameTextBox;
    }

    public static WebElement getContactUsText() {
        return contactUsText;
    }

    public static void setContactUsText(WebElement contactUsText) {
        ContactUsScreen.contactUsText = contactUsText;
    }
}

package uk.co.librarywk14.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import uk.co.librarywk14.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void acceptCookiesandSwitchToIframe() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        Thread.sleep(100);
        WebElement acceptCookies = driver.findElement(By.xpath("//span[contains(text(),'Accept All')]"));
        acceptCookies.click();
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void enterJobTitle(String Title) {
        sendTextToElement(jobTitle, Title);
    }

    public void enterLocation(String Location) {
        sendTextToElement(location, Location);
    }

    public void selectDistanceFromDropDown(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        log.info("Clicking On More Search Option" + moreSearchOptionLink.toString());
        clickOnElement(moreSearchOptionLink);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryTypeDropDown(String typeSalary) {
        selectByValueFromDropDown(salaryTypeDropDown, typeSalary);
    }

    public void selectJobTypeDropDown(String typeJob) {
        selectByValueFromDropDown(jobTypeDropDown, typeJob);
    }

    public void clickOnFindJobs() {
        log.info("Clicking on Find Jobs" + findJobs.toString());
        clickOnElement(findJobs);
    }

    public String verifyResultText(String text) {
        return getTextFromElement(resultText);

    }

//    public void resultMessage(String result) {
//        String actualMsg = verifyResultText(); //Get text from page
//        String expectedMsg = result; //Expected Message
//        Assert.assertEquals(actualMsg, expectedMsg, "Results Verified!"); //Compare and Verify tes
//
//    }

}

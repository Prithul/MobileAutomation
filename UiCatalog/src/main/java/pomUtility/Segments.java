package pomUtility;

import base.EssentialMobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Segments extends EssentialMobileAPI {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Segments']")
    WebElement segments;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Segments']")
    WebElement uisegmentedcontrol;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Check']")
    WebElement firstleft;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Search']")
    WebElement firstmiddle;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Tools']")
    WebElement firstright;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[2]")
    WebElement secondleft;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[2]")
    WebElement secondmid;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[2]")
    WebElement secondright;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[3]")
    WebElement thirdleft;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]")
    WebElement thirddmid;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[3]")
    WebElement thirdright;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[4]")
    WebElement fourthleft;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[4]")
    WebElement fourthmid;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[4]")
    WebElement fourthright;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name='Check'])[5]")
    WebElement fifthleft;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name='Search'])[5]")
    WebElement fifthmid;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name='Tools'])[5]")
    WebElement fifthright;

    public void goToSegmentsFildsTab(){
        segments.click();
    }
    public boolean goToSegments(){
        segments.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean firstSegemntControlleft(){
       firstleft.click();
       return uisegmentedcontrol.isDisplayed();
    }
    public boolean firstSegemntControlmid(){
        firstmiddle.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean firstSegemntControlright(){
        firstright.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean secondSegemntControlleft(){
        secondleft.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean secondSegemntControlmid(){
        secondmid.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean secondSegemntControlright(){
        secondright.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean thirdSegemntControlleft(){
        thirdleft.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean thirdSegemntControlmid(){
        thirddmid.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean thirdSegemntControlright(){
        thirdright.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean fourthSegemntControlleft(){
        fourthleft.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean fourthSegemntControlmid(){
        fourthmid.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean fourthSegemntControlright(){
        fourthright.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean fifthSegemntControlleft(){
        fifthleft.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean fifthSegemntControlmid(){
        fifthmid.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean fifthSegemntControlright(){
        fifthright.click();
        return uisegmentedcontrol.isDisplayed();
    }
}

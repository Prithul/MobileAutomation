package pomUtility;


import base.EssentialMobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Transitions extends EssentialMobileAPI {

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Transitions\"]")
    public WebElement transition;
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Flip Image\"]")
    public WebElement flip;
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"Curl Image\"]")
    public WebElement curl;

    public void transitionFlip(){
        transition.click();
        flip.click();
    }
    public void transitionCurl(){
        transition.click();
        curl.click();
    }
}

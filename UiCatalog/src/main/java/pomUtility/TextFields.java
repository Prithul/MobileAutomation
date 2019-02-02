package pomUtility;

import base.EssentialMobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextFields extends EssentialMobileAPI {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    WebElement textfields;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='UITextField']")
    WebElement uitextfield;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Normal']")
    WebElement textfield1;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Rounded']")
    WebElement textfield2;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name='Secure']")
    WebElement textfield3;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Check']")
    WebElement textField4;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='UITextField Secure']")
    WebElement uitextfieldsecure;

    public void goToTextFildsTab(){
        textfields.click();
    }
    public boolean goToTextFields(){
        textfields.click();
        return uitextfield.isDisplayed();
    }
    public boolean firstTextField(){
        textfield1.click();
        textfield1.sendKeys("Life");
        textfield1.clear();
        return uitextfield.isDisplayed();
    }
    public boolean secondTextField(){
        textfield2.sendKeys("is");
        textfield2.clear();
        return uitextfield.isDisplayed();
    }
    public boolean thirdTextField(){
        textfield3.sendKeys("extremly");
        textfield3.clear();
        return uitextfieldsecure.isDisplayed();
    }
    public boolean fourthTextField(){
        textField4.sendKeys("mysterious");
        textField4.clear();
        return uitextfieldsecure.isDisplayed();
    }
}

package pomUtility;

import base.EssentialMobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFeatures extends EssentialMobileAPI {

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Buttons\"]")
    public WebElement buttons;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Controls\"]")
    public WebElement controls;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"TextFields\"]")
    public WebElement textFields;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"SearchBar\"]")
    public WebElement searchBar;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"TextView\"]")
    public WebElement textView;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Pickers\"]")
    public WebElement pickers;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Images\"]")
    public WebElement images;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Web\"]")
    public WebElement web;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Segments\"]")
    public WebElement segments;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Toolbar\"]")
    public WebElement toolBar;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Alerts\"]")
    public WebElement alerts;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Transitions\"]")
    public WebElement transition;

    public void getButtonTab(){
        buttons.click();
    }
    public void getControlsTab(){ controls.click(); }
    public void getTextFieldsTab(){ textFields.click(); }
    public void getSearchBarTab(){ searchBar.click(); }
    public void getTextViewTab(){ textView.click(); }
    public void getPickersTab(){ pickers.click(); }
    public void getImagesTab(){ images.click(); }
    public void getWebTab(){ web.click(); }
    public void getSegmentsTab(){ segments.click(); }
    public void getToolBarTab(){ toolBar.click();}
    public void getAlertsTab(){ alerts.click();}
    public void getTransitionTab(){ transition.click();}

    }



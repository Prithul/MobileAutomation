package pomUtility;

import base.EssentialMobileAPI;

public class Alerts extends EssentialMobileAPI {

    public void showActionSheetSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]");
    }
    public void showActionSheetOkCancel(){ clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]"); }
    public void showActionSheetCustom(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Customized\"]");
    }
    public void showAlertSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]");
    }
    public void getButton1() {
        showActionSheetCustom();
        clickByXpath("//XCUIElementTypeButton[@name=\"Button1\"]");
    }
    public void getButton2() {
        showActionSheetCustom();
        clickByXpath("//XCUIElementTypeButton[@name=\"Button2\"]");
    }
    public void getOKButton() {
        showActionSheetOkCancel();
        clickByXpath("//XCUIElementTypeButton[@name=\"OK\"]");
    }
}

package iPhone;

import base.EssentialMobileAPI;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ExtentReport.TestLogger;
import pomUtility.Alerts;
import pomUtility.UiCatalog;


public class TestAlerts extends EssentialMobileAPI {

    public Alerts alerts(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getAlerts();
        return PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void testActionSheetSimple() throws InterruptedException {
          alerts().showActionSheetSimple();
          sleep(2);
    }
    @Test
    public void testActionSheetOkCancel() throws InterruptedException {
        alerts().showActionSheetOkCancel();
        sleep(2);
    }
    @Test
    public void testActionSheetCustom() throws InterruptedException {
        alerts().showActionSheetCustom();
        sleep(2);
    }
    @Test
    public void testAlertSimple() throws InterruptedException {
        alerts().showAlertSimple();
        sleep(2);
    }
    @Test
    public void testButton1() throws InterruptedException {
        alerts().getButton1();
        sleep(2);
    }
    @Test
    public void testButton2() throws InterruptedException {
        alerts().getButton2();
        sleep(2);
    }
    @Test
    public void testOKButton() throws InterruptedException {
        alerts().getOKButton();
        sleep(2);
    }
}

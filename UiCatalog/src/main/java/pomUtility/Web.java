package pomUtility;


import base.EssentialMobileAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Web extends EssentialMobileAPI {

    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Web\"]")
    public WebElement web;
    @FindBy(xpath="//XCUIElementTypeLink[@name=\"Find a store\"]")
    public WebElement findStore;
    @FindBy(xpath="//XCUIElementTypeLink[@name=\"Complete store list \uF301\"]")
    public WebElement storeList;
    @FindBy(xpath="//XCUIElementTypeLink[@name=\"Buy now with trade in\"]")
    public WebElement buyNow;

    public void getStore() throws InterruptedException{
         web.click();
         findStore.click();
         storeList.click();
    }
    public void buyNow() throws InterruptedException {
        web.click();
        buyNow.click();
        Thread.sleep(3000);
        Dimension size = ad.manage().window().getSize();
        int x = size.getWidth() / 2;
        int starty = (int) (size.getHeight() * 0.60);
        int endy = (int) (size.getHeight() * 0.10);
        ad.swipe(x, starty, x, endy, 2000);
    }
}

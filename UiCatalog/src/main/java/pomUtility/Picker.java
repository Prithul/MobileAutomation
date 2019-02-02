package pomUtility;

import base.EssentialMobileAPI;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Picker extends EssentialMobileAPI {
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Pickers\"]")
    public WebElement pickers;
    @FindBy(xpath="//XCUIElementTypeButton[@name='UIPicker']")
    public WebElement uiPicker;
    @FindBy(xpath="//XCUIElementTypeButton[@name='UIDatePicker']")
    public WebElement uiDatePicker;
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"1\"]")
    public WebElement uiDatePicker1;
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"2\"]")
    public WebElement uiDatePicker2;
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"3\"]")
    public WebElement uiDatePicker3;
    @FindBy(xpath="//XCUIElementTypeButton[@name=\"4\"]")
    public WebElement uiDatePicker4;
    @FindBy(xpath="//XCUIElementTypeButton[@name='Custom']")
    public WebElement uiCustomPicker;
    @FindBy(xpath="//XCUIElementTypeDatePicker")
    public WebElement parentPicker;

    public void getUiPicker() throws InterruptedException{
        pickers.click();
        uiPicker.click();
    }
    public void getUiDatePicker() throws InterruptedException{
        pickers.click();
        uiDatePicker.click();
        uiDatePicker1.click();
        Thread.sleep(1000);
        uiDatePicker2.click();
        Thread.sleep(1000);
        uiDatePicker3.click();
        Thread.sleep(1000);
        uiDatePicker4.click();
    }
    public void getCustomPicker() throws InterruptedException{
        pickers.click();
        uiCustomPicker.click();
    }
    public void uiDatePicker() throws InterruptedException{
        pickers.click();
        uiDatePicker.click();
        uiDatePicker2.click();
        Thread.sleep(1000);
        List<WebElement> columns = parentPicker.findElements(By.xpath("//XCUIElementTypePickerWheel"));
        columns.get(1).sendKeys("1");
        columns.get(2).sendKeys("2020");
    }
    public void uiTimePicker() throws InterruptedException{
        pickers.click();
        uiDatePicker.click();
        uiDatePicker3.click();
        Thread.sleep(1000);
        List<WebElement> columns = parentPicker.findElements(By.xpath("//XCUIElementTypePickerWheel"));
        columns.get(1).sendKeys("11");
        columns.get(2).sendKeys("11");
        columns.get(3).sendKeys("AM");
    }
}

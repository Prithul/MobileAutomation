package iPhone;

import base.EssentialMobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomUtility.HomePageFeatures;
import pomUtility.Picker;

public class TestPickers extends EssentialMobileAPI{

    Picker picker;
    @BeforeMethod
    public void initializationOfElements(){ picker = PageFactory.initElements(ad, Picker.class); }
    @Test
    public void uiPicker() throws InterruptedException{
        picker.getUiPicker();
    }
    @Test
    public void uiDateicker() throws InterruptedException{
        picker.getUiDatePicker();
    }
    @Test
    public void uiCustomPicker() throws InterruptedException{
        picker.getCustomPicker();
    }
    @Test
    public void uiDatePickerWheel() throws InterruptedException{
        picker.uiDatePicker();
    }
    @Test
    public void uiTimePickerWheel() throws InterruptedException{
        picker.uiTimePicker();
    }
}

package iPhone;

import base.EssentialMobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomUtility.HomePageFeatures;

public class TestHomePageFeatures extends EssentialMobileAPI {

    HomePageFeatures objHomePageItems;
    @BeforeMethod
    public void initializationOfElements(){
        objHomePageItems=PageFactory.initElements(ad, HomePageFeatures.class);
    }
    @Test
    public void buttons() throws InterruptedException {
        objHomePageItems.getButtonTab();
    }
    @Test
    public void controls() throws InterruptedException {
        objHomePageItems.getControlsTab();
    }
    @Test
    public void textFields() throws InterruptedException {
        objHomePageItems. getTextFieldsTab();
    }
    @Test
    public void searchBar() throws InterruptedException {
        objHomePageItems.getSearchBarTab();
    }
    @Test
    public void textView() throws InterruptedException {
        objHomePageItems.getTextViewTab();
    }
    @Test
    public void pickers() throws InterruptedException {
        objHomePageItems.getPickersTab();
    }
    @Test
    public void images() throws InterruptedException {
        objHomePageItems.getImagesTab();
    }
    @Test
    public void web() throws InterruptedException{
        objHomePageItems.getWebTab();
    }
    @Test
    public void segments() throws InterruptedException{
        objHomePageItems.getSegmentsTab();
    }
    @Test
    public void toolBar() throws InterruptedException{
        objHomePageItems.getToolBarTab();
    }
    @Test
    public void alerts() throws InterruptedException{
        objHomePageItems.getAlertsTab();
    }
    @Test
    public void transition() throws InterruptedException{
        objHomePageItems.getTransitionTab();
    }
}

package home;

import base.EssentialMobileAPI;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class Home extends EssentialMobileAPI {

    @FindBy(className="android.widget.Button")
    public static List<WebElement> skip = new ArrayList<>();
    @FindBy(className="android.widget.TextView")
    public WebElement cancel;
    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> bBtn = new ArrayList<>();
    @FindBy(className = "android.widget.TextView")
    public static List<WebElement> searchBox = new ArrayList<>();
    @FindBy(className="android.widget.Button")
    public static WebElement gotIt;
    @FindBy(className = "android.widget.TextView")
    public WebElement setDestination;
    @FindBy(className = "android.widget.ImageView")
    public static List<WebElement> image = new ArrayList<>();

    String menuArray[] = {"Your places", "Your timeline", "Your contributions", "Messages","Location sharing",
            "Start driving", "Offline maps", "Traffic", "Public transit", "Bicycling", "Satellite", "Terrain", "Google Earth","Tips and tricks", "Add a missing place", "Settings",
            "Help", "Send feedback", "Terms of Service"};

    public void testSignIn() throws InterruptedException {
        skip.get(0).click();
        cancel.click();
    }
    public void getSkip() {
        skip.get(1).click();
    }
    public void getMenu() {
        bBtn.get(0).click();
    }
    public void getYourPlaces() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[0]);
    }
    public void getYourTimeline() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[1]);
    }
    public void getYourContributions() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[2]);
    }
    public void getMessages() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[3]);
    }
    public void getLocationSharing() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[4]);
    }
    public void getStartDriving() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[5]);
    }
    public void getOfflineMaps() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[6]);
    }
    public void getTraffic() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[7]);
    }
    public void getPublicTransit() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[8]);
    }
    public void getBicycling() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[9]);
    }
    public void getSatellite() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[10]);
    }
    public void getTerrain() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[11]);
    }
    public void getGoogleEatth() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[12]);
    }
    public void getTipsAndTricks() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[13]);
    }
    public void getAddAMissingPlace() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[14]);
    }
    public void getSettings() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[15]);
    }
    public void getHelp() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[16]);
    }
    public void getSendFeedback() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[17]);
    }
    public void getTermsOfServices() {
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[18]);
    }
    public void getSearch() throws InterruptedException {
        skip.get(1).click();
        MobileElement element = (MobileElement) searchBox.get(1);
        element.sendKeys("Burlington, NJ");
        Thread.sleep(3000);
    }
    public void startDriving() throws InterruptedException{
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[5]);
        gotIt.click();
        sleep(4);
        setDestination.sendKeys("100 Borton Landing Rd, Moorestown, NJ 08057");
    }
    public void getGasStation() throws InterruptedException{
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[5]);
        gotIt.click();
        sleep(4);
        setDestination.click();
        image.get(0).click();
        Thread.sleep(6000);
    }
    public void getParking() throws InterruptedException{
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[5]);
        gotIt.click();
        sleep(4);
        setDestination.click();
        image.get(1).click();
        Thread.sleep(6000);
    }
    public void getRestaurant() throws InterruptedException{
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[5]);
        gotIt.click();
        sleep(4);
        setDestination.click();
        image.get(2).click();
        Thread.sleep(6000);
    }
    public void getMore() throws InterruptedException{
        skip.get(1).click();
        getMenu();
        scrollAndClickByName(menuArray[5]);
        gotIt.click();
        sleep(4);
        setDestination.click();
        image.get(3).click();
        Thread.sleep(6000);
    }
}


package testCases;

import home.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends Home {

    Home home;
    @BeforeMethod
    public void initializationOfObjects() { home = PageFactory.initElements(ad, Home.class); }
    @Test
    public void testSignIn() throws InterruptedException{ home.testSignIn(); }
    @Test
    public void testSkip() throws InterruptedException{ home.getSkip(); }
    @Test
    public void testMenuButton() throws InterruptedException{ home.getMenu(); }
    @Test
    public void testSearch() throws InterruptedException{ home.getSearch(); }
    @Test
    public void testPlaces() throws InterruptedException{ home.getYourPlaces(); }
    @Test
    public void testTimeline() throws InterruptedException{ home.getYourTimeline(); }
    @Test
    public void testContributions() throws InterruptedException{ home.getYourContributions(); }
    @Test
    public void testMessages() throws InterruptedException{ home.getMessages(); }
    @Test
    public void testLocationSharing() throws InterruptedException{ home.getLocationSharing(); }
    @Test
    public void testStartDriving() throws InterruptedException{ home.getStartDriving(); }
    @Test
    public void testOfflineMaps() throws InterruptedException{ home.getOfflineMaps(); }
    @Test
    public void testTraffic() throws InterruptedException{ home.getTraffic(); }
    @Test
    public void testPublicTransit() throws InterruptedException{ home.getPublicTransit(); }
    @Test
    public void testBicycling() throws InterruptedException{ home.getBicycling(); }
    @Test
    public void testTerrain() throws InterruptedException{ home.getTerrain(); }
    @Test
    public void testGoogleEarth() throws InterruptedException{ home.getGoogleEatth(); }
    @Test
    public void testTNT() throws InterruptedException{ home.getTipsAndTricks(); }
    @Test
    public void testAddMissingPlace() throws InterruptedException{ home.getAddAMissingPlace(); }
    @Test
    public void testSettings() throws InterruptedException{ home.getSettings(); }
    @Test
    public void testHelp() throws InterruptedException{ home.getHelp(); }
    @Test
    public void testSendFeedback() throws InterruptedException{ home.getSendFeedback(); }
    @Test
    public void testTermsOfSErvices() throws InterruptedException{ home.getTermsOfServices(); }
    @Test
    public void gasStation() throws InterruptedException{ home.getGasStation(); }
    @Test
    public void parking() throws InterruptedException{ home.getParking(); }
    @Test
    public void restaurants() throws InterruptedException{ home.getRestaurant(); }
    @Test
    public void more() throws InterruptedException{ home.getMore(); }
    @Test
    public void startDriving() throws InterruptedException{ home.startDriving(); }
}

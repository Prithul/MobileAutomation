package iPhone;

import base.EssentialMobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomUtility.Transitions;

public class TestTransition extends EssentialMobileAPI {

    Transitions transitions;
    @BeforeMethod
    public void initializationOfElements(){
        transitions= PageFactory.initElements(ad, Transitions.class);
    }
    @Test
    public void getFlip() throws InterruptedException { transitions.transitionFlip(); }
    @Test
    public void getCurl() throws InterruptedException { transitions.transitionCurl(); }
}

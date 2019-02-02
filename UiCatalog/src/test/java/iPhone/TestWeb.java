package iPhone;

import base.EssentialMobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomUtility.Web;

public class TestWeb extends EssentialMobileAPI {

    Web web ;
    @BeforeMethod
    public void initializationOfElements(){
        web= PageFactory.initElements(ad, Web.class);
    }
    @Test
    public void findStore() throws InterruptedException { web.getStore(); }
    @Test
    public void buyNow() throws InterruptedException { web.buyNow(); }
}

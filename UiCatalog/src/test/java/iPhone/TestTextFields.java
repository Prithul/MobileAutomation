package iPhone;

import base.EssentialMobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomUtility.TextFields;

public class TestTextFields extends EssentialMobileAPI {

    TextFields textFields;
    @BeforeMethod
    public void initializing(){
        textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.goToTextFildsTab();
    }
    @Test
    public void test5_textFieldPageValidation(){
        Assert.assertEquals(textFields.goToTextFields(),true);
    }
    @Test
    public void test1_TextField1(){
        Assert.assertEquals(textFields.firstTextField(),true);
    }
    @Test
    public void test2_TextField2(){
        Assert.assertEquals(textFields.secondTextField(),true);
    }
    @Test
    public void test3_TextField3(){
        Assert.assertEquals(textFields.thirdTextField(),true);
    }
    @Test
    public void test4_TextField4(){
        Assert.assertEquals(textFields.fourthTextField(),true);
    }
}

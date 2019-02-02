package iPhone;

import base.EssentialMobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pomUtility.Segments;

public class TestSegments extends EssentialMobileAPI {
  Segments segments;
    @BeforeMethod
    public void initializing(){
        segments = PageFactory.initElements(ad, Segments.class);
        segments.goToSegmentsFildsTab();
    }
    @Test
    public void segmentTabValidation(){
        Assert.assertEquals(segments.goToSegments(),true);
    }
    @Test
    public void firstSegmentLeftTest(){
        Assert.assertEquals(segments.firstSegemntControlleft(),true);
    }
    @Test
    public void firstSegmentMidTest(){
        Assert.assertEquals(segments.firstSegemntControlmid(),true);
    }
    @Test
    public void firstSegmentRightTest(){
        Assert.assertEquals(segments.firstSegemntControlright(),true);
    }
    @Test
    public void secondSegmentLeftTest(){ Assert.assertEquals(segments.secondSegemntControlleft(),true); }
    @Test
    public void secondSegmentMidTest(){ Assert.assertEquals(segments.secondSegemntControlmid(),true); }
    @Test
    public void secondSegmentRightTest(){ Assert.assertEquals(segments.secondSegemntControlright(),true); }
    @Test
    public void thirdSegmentLeftTest(){ Assert.assertEquals(segments.thirdSegemntControlleft(),true); }
    @Test
    public void thirdSegmentMidTest(){ Assert.assertEquals(segments.thirdSegemntControlmid(),true); }
    @Test
    public void thirdSegmentRightTest(){ Assert.assertEquals(segments.thirdSegemntControlright(),true); }
    @Test
    public void fourthSegmentLeftTest(){ Assert.assertEquals(segments.fourthSegemntControlleft(),true); }
    @Test
    public void fourthSegmentMidTest(){ Assert.assertEquals(segments.fourthSegemntControlmid(),true); }
    @Test
    public void fourthSegmentRightTest(){ Assert.assertEquals(segments.fourthSegemntControlright(),true); }
    @Test
    public void fifthSegmentLeftTest(){
        Assert.assertEquals(segments.fifthSegemntControlleft(),true);
    }
    @Test
    public void fifthSegmentMidTest(){
        Assert.assertEquals(segments.fifthSegemntControlmid(),true);
    }
    @Test
    public void fifthSegmentRightTest(){
        Assert.assertEquals(segments.fifthSegemntControlright(),true);
    }
}

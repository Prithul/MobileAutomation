package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pomUtility.ScrollBar;

public class TestScrollBar extends ScrollBar {

    @Test
    public void testScrollBar(){
        ScrollBar scrollBar = PageFactory.initElements(ad, ScrollBar.class);
        scrollBar.scroll();
    }
}

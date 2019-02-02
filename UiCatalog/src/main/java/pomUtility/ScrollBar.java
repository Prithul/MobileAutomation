package pomUtility;

import base.EssentialMobileAPI;
import org.openqa.selenium.Dimension;

public class ScrollBar extends EssentialMobileAPI {

    public void scroll(){
        Dimension size = ad.manage().window().getSize();
        int x = size.getWidth() / 2;
        int starty = (int) (size.getHeight() * 0.60);
        int endy = (int) (size.getHeight() * 0.10);
        ad.swipe(x, starty, x, endy, 2000);
    }
}

import java.awt.*;
import java.awt.event.InputEvent;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File; 

public class ApplicationRobot{
    public static void main(String []args) throws Exception{
        Robot calum = new Robot();
        calum.mouseMove(10,1050);
        Thread.sleep(100);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        calum.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        calum.mouseMove(80,710);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        calum.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        calum.mouseMove(1240,570);
        Thread.sleep(2000);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        calum.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        calum.mouseMove(1240,950);
        Thread.sleep(2000);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        calum.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        calum.mouseMove(750,105);
        Thread.sleep(2000);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        calum.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        calum.mouseMove(750,225);
        Thread.sleep(2000);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        calum.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        Thread.sleep(2000);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= calum.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 

        calum.mouseMove(1280,80);
        Thread.sleep(2000);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        calum.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        
    }
}
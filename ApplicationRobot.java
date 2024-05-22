import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{
    public static void main(String []args) throws Exception{
        Robot calum = new Robot();
        calum.mouseMove(520,120);
        calum.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        
    }
}
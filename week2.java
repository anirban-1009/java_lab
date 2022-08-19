import java.applet.*;
import java.awt.*;

public class week2 extends Applet{
    public void paint(Graphics g){
        setForeground(Color.blue);
        setBackground(Color.pink);
        g.drawString("Welcome to applet", 50, 60);
    }
}
/*<applet code = "week2" width=300 height=300></applet> */
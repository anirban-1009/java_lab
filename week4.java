import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.*;

public class week4 extends Applet implements ActionListener{
    TextField t1, t2, t3;
    Button b;
    Label l1, l2, l3, l4;
    String s;
    week4 e;
    public void init(){
        e = this;
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        l1 = new Label("Enter num1:");
        l2 = new Label("Enter num2:");
        l3 = new Label("Result:");
        l4 = new Label("Division of Two Numbers");
        b = new Button("Divide");
        add(l4);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            s = ""+(num1/num2);
            t3.setText(s);
        }catch(ArithmeticException a){
            JOptionPane.showMessageDialog(null, "Divide by zero");
        }catch(NumberFormatException b){
            JOptionPane.showMessageDialog(null, "Number Format Exception");
        }
    }
}
/*<applet code="week4" width=300 height=300> </applet> */
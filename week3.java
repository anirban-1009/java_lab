import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class week3 extends Applet implements ActionListener{
    TextField t1, t2;
    Label l1, l2, l3;
    Button b1;
    int fact = 1, n, i;
    week3 e;
    public void init(){
        e = this;
        t1 = new TextField(10);
        t2 = new TextField(10);
        l1 = new Label("factorial of a number");
        l2 = new Label("Enter a number:");
        l3 = new Label("Result:");
        b1 = new Button("Compute");
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        String str = t1.getText();
        n = Integer.parseInt(str);
        for(int i = n; i>1 ; i--){
            fact = fact*i;
        }
        String msg = "" + fact;
        t2.setText(msg);
        fact = 1;
    }
}

/*<applet code="week3" width=300 height=300> </applet> */
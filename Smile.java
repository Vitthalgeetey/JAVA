import java.awt.*;
import java.awt.event.*;
class smile extends Frame
{

    smile()
    {
        this.addWindowListener(new WindowAdapter()
        
        {
            public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    });
    }


public void paint(Graphics g)
{
    g.setColor(Color.red);
    g.fillRect(50,50,200,200);
    g.drawRect(50,50,200,200);
    g.setColor(Color.yellow);
    g.fillOval(75,75,150,150);
    g.drawOval(75,75,150,150);
    //face
    g.setColor(Color.black);
    g.fillOval(100,100,15,15);
    g.drawOval(100,100,15,15);
    //eye
    g.fillOval(180,100,15,15);
    g.drawOval(180,100,15,15);
    //eye
    g.drawLine(150,135,150,155);
    //nose
    g.setColor(Color.pink);
    g.fillArc(110,140,75,50,0,-175);
    g.drawArc(110,140,75,50,0,-175);
    //smile
}

public static void main(String arg[])
{
    smile S = new smile();
    S.setSize(400,400);
    S.setTitle("Drawing");
    S.setVisible(true);
}

 }

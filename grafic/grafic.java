import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class grafic extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.RED);
        g.fillRect(25, 50, 100, 25);

        g.setColor(new Color(200 , 199 , 37));
        g.fillRect(25, 90, 100, 25);

        g.setColor(Color.BLACK);
        g.drawString("simple graphic", 25, 150);

        g.setColor(Color.ORANGE);
        g.drawRect(25, 170, 100, 25);

        g.setColor(Color.PINK);
        g.fillOval(25, 220, 100, 25);

        g.setColor(Color.GREEN);
        g.drawLine(25, 300, 100, 300);

        g.setColor(Color.YELLOW);
        g.fill3DRect(25, 320, 100, 25, true);
    }
}
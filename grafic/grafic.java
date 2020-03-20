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
    }
}
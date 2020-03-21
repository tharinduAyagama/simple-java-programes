import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame{
    private JButton button;
    private JPanel panel;
    private Color colour;

    public gui(){
        super("choose cols");
        panel = new JPanel();
        panel.setBackground(Color.WHITE);

        button = new JButton("select ur colour");

        button.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    colour = JColorChooser.showDialog(null, "pick the colour", colour);
                    if(colour==null){
                        colour = Color.WHITE;
                    }
                    panel.setBackground(colour);
                }
            }
        );
        add(button , BorderLayout.SOUTH);
        add(panel , BorderLayout.CENTER);
    }
}
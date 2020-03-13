import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class gui extends JFrame{
    
    private JButton buttonOne;
    private JButton buttonTwo;

    public gui(){

        super("button");
        setLayout(new FlowLayout());

        buttonOne = new JButton("button no one");
        add(buttonOne);

        Icon x = new ImageIcon(getClass().getResource("a.jpg"));
        Icon y = new ImageIcon(getClass().getResource("b.jpg"));

        buttonTwo = new JButton("button no two" , x);
        buttonTwo.setRolloverIcon(y);
        add(buttonTwo);

        theHandler handler = new theHandler();
        buttonOne.addActionListener(handler);
        buttonTwo.addActionListener(handler);
        
    }

    public class theHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s" , event.getActionCommand()));
        }
    }
}
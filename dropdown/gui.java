import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame{
    private JComboBox dropdown;
    private String[] dropdownArray = {"kamal" , "amal" , "nimal"};

    public gui(){
        super("dropdown");
        setLayout(new FlowLayout());

        dropdown = new JComboBox(dropdownArray);
        add(dropdown);

        theHandler handler = new theHandler();
        dropdown.addActionListener(handler);
    }
    class theHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
                JOptionPane.showMessageDialog(null, String.format("hi im %s" , dropdownArray[dropdown.getSelectedIndex()]));
        }
    }
}
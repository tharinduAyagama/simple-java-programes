import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.FlowLayout;


class gui extends JFrame{
    private JTextField text;
    private JCheckBox bolt;
    private JCheckBox italic;

    public gui(){

        super("checkbox");
        setLayout(new FlowLayout());

        text = new JTextField("this is a simple gui" , 10);
        text.setFont(new Font("Serif", Font.PLAIN, 20));
        add(text);

        bolt = new JCheckBox("bolt");
        italic = new JCheckBox("itaic");

        add(bolt);
        add(italic);

        theHandler handler = new  theHandler();
        seocondHandler secHandler =new seocondHandler();

        bolt.addItemListener(handler);
        italic.addItemListener(handler);

        bolt.addActionListener(secHandler);
        italic.addActionListener(secHandler);
    }

    class theHandler implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            if(bolt.isSelected() && italic.isSelected()){
                text.setFont(new Font("Serif" , Font.BOLD + Font.ITALIC , 20));
            }
            else if(bolt.isSelected()){
                text.setFont(new Font("Serif" , Font.BOLD , 20));
            }
            else if(italic.isSelected()){
                text.setFont(new Font("Serif" , Font.ITALIC , 20));
            }
            else{
                text.setFont(new Font("Serif" , Font.PLAIN , 20));
            }
        }
    }

    class seocondHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == bolt && bolt.isSelected()){
                JOptionPane.showMessageDialog(null , String.format("the text is %s" , event.getActionCommand()));
            }
            else if(event.getSource() == bolt){
                JOptionPane.showMessageDialog(null , String.format("the text isnt %s" , event.getActionCommand()));
            }
            else if(event.getSource() == italic && italic.isSelected()){
                JOptionPane.showMessageDialog(null , String.format("the text is %s" , event.getActionCommand()));
            }
            else if(event.getSource() == italic){
                JOptionPane.showMessageDialog(null , String.format("the text isnt %s" , event.getActionCommand()));
            }
        }
    }
}
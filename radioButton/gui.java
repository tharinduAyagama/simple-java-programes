import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame{
    private JTextField text;
    private JRadioButton plainButton;
    private JRadioButton boltButton;
    private JRadioButton italicButton;
    private JRadioButton boltItalicButton;
    private ButtonGroup group;

    public gui(){
        super("radio button");
        setLayout(new FlowLayout());
        text = new JTextField("this is the text" , 30);
        text.setFont(new Font("Serif" , Font.PLAIN , 20));
        add(text);

        plainButton = new JRadioButton("plain");
        boltButton = new JRadioButton("bolt");
        italicButton = new JRadioButton("italic");
        boltItalicButton= new JRadioButton("bolt & italic");

        add(plainButton);
        add(boltButton);
        add(italicButton);
        add(boltItalicButton);

        group = new ButtonGroup();

        group.add(plainButton);
        group.add(boltButton);
        group.add(italicButton);
        group.add(boltItalicButton);

        theHandler handler = new theHandler();
        
        plainButton.addItemListener(handler);
        boltButton.addItemListener(handler);
        italicButton.addItemListener(handler);
        boltItalicButton.addItemListener(handler);
    }
    class theHandler implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            if(plainButton.isSelected()){
                text.setFont(new Font("Serif" , Font.PLAIN , 20));
            }
            else if(boltButton.isSelected()){
                text.setFont(new Font("Serif" , Font.BOLD , 20));
            }
            else if(italicButton.isSelected()){
                text.setFont(new Font("Serif" , Font.ITALIC , 20));
            }
            else if(boltItalicButton.isSelected()){
                text.setFont(new Font("Serif" , Font.BOLD + Font.ITALIC , 20));
            }
        }
    }
}
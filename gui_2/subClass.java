import java.awt.FlowLayout;     //can decide where should the output placed
import javax.swing.JFrame;      //gives the title bar minimize etc (basic window)
import javax.swing.JLabel;      //output text in the window


class subClass extends JFrame{
    
    private JLabel item;        //the item we gonna make

    public subClass(){
        super("the title");     //title of the window
        setLayout(new FlowLayout());    //giving the basic layout
         
        item = new JLabel("text");      //output on the screen
        item.setToolTipText("this is the text");        //when we get the mousepointer to the item it popup this messege
        add(item);      //adding this item to the window
    }
}
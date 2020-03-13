import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class gui extends JFrame{
    private JList list;
    private String[] listArray = {"black" , "red" , "yello" , "green"};
    private Color[] colors = {Color.BLACK , Color.RED , Color.YELLOW , Color.GREEN};

    public gui(){
        super("list");
        setLayout(new FlowLayout());

        list = new JList(listArray);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged(ListSelectionEvent evnt){
                    getContentPane().setBackground(colors[list.getSelectedIndex()]);
                }
            }
        );
    }
}
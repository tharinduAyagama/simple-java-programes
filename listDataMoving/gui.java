import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class gui extends JFrame{
    private JList leftList;
    private JList rightList;
    private JButton moveToRight;
    private String[] names = {"kamal" , "nimal" , "amal" , "ranil" , "gota" , "mahi"};

    public gui(){
        super("list data moving");
        setLayout(new FlowLayout());

        leftList = new JList(names);
        leftList.setVisibleRowCount(4);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));

        moveToRight = new JButton("MOVE");
        moveToRight.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    rightList.setListData(leftList.getSelectedValues());
                }
            }
        );

        add(moveToRight);

        rightList = new JList();
        add(new JScrollPane(rightList));
    }
}
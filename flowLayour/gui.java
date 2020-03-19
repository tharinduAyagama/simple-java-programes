import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class gui extends JFrame{
    private JButton leftButton;
    private JButton centerButton;
    private JButton rightButton;
    private FlowLayout layout;
    private Container container;

    public gui(){
        super("flowlayout");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        //left button
        leftButton = new JButton("left");
        add(leftButton);
        leftButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.LEFT);
                    layout.layoutContainer(container);
                }
            }
        );

        //center button
        centerButton = new JButton("center");
        add(centerButton);
        centerButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.CENTER);
                    layout.layoutContainer(container);
                }
            }
        );

        //right button
        rightButton = new JButton("right");
        add(rightButton);
        rightButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    layout.setAlignment(FlowLayout.RIGHT);
                    layout.layoutContainer(container);
                }
            }
        );
    }
}
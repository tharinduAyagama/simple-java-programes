import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame{
    private String count;
    private JLabel status;
    
    gui(){
        super("adupter class");

        status = new JLabel("0");
        add(status , BorderLayout.SOUTH);
        addMouseListener(new handler());
    }

    //we dont have to override all functions when we extends to a adapter class. we can override functions that we only need 
    class handler extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            count = String.format("ur clicked count is %d " , event.getClickCount());

            if(event.isMetaDown()){
                count += "with right button";
            }
            else if(event.isAltDown()){
                count += "with middle button";
            }
            else{
                count += "with left button";
            }
            
            status.setText(count);
        }
    }
}
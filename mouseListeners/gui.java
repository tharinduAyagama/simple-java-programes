import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class gui extends JFrame{
    private JPanel mouse;
    private JLabel status;

    public gui(){
        super("mouse event");

        mouse = new JPanel();
        mouse.setBackground(Color.WHITE);
        add(mouse , BorderLayout.CENTER);

        status = new JLabel("nothing");
        add(status , BorderLayout.SOUTH);
        
        theHandler handler = new theHandler();

        mouse.addMouseListener(handler);
        mouse.addMouseMotionListener(handler);

    }

    class theHandler implements MouseListener , MouseMotionListener{
        //mouse listeners
        public void mouseClicked(MouseEvent event){
            status.setText(String.format("u have clicked at %d %d" , event.getX() , event.getY()));
        }
        public void mousePressed(MouseEvent event){
            status.setText("u are pressing the mouse");
        }
        public void mouseReleased(MouseEvent event){
            status.setText("u relesed the mouse");
        }
        public void mouseEntered(MouseEvent event){
            status.setText("u have entered");
            mouse.setBackground(Color.GREEN);
        }
        public void mouseExited(MouseEvent event){
            status.setText("u have exited");
            mouse.setBackground(Color.WHITE);
        }

        //mouse motion listeners
        public void mouseDragged(MouseEvent event){
            status.setText("u are dragging the mouse");
        }
        public void mouseMoved(MouseEvent event){
            status.setText("u have moved the  mouse");
        }
    }
}
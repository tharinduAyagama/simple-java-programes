import javax.swing.JFrame;

class eventHandler{
    public static void main(String[] args) {
        
        eventHandlerSub object = new eventHandlerSub();
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.setSize(400 , 600);
        object.setVisible(true);
    }
}
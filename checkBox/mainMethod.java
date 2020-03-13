import javax.swing.JFrame;

class mainMethod extends JFrame{
    public static void main(String[] args) {
        gui object = new gui();
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.setSize(500 , 250);
        object.setVisible(true);
    }
}
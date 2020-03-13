import javax.swing.JFrame;

class mainMethod extends JFrame{
    public static void main(String[] args) {
        gui object = new gui();
        object.setSize(500,500);
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.setVisible(true);
    }
}
import  javax.swing.JFrame;

class mainMethod{
    public static void main(String[] args) {
        gui object = new gui();
        object.setSize(1000,1500);
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.setVisible(true);
    }
}
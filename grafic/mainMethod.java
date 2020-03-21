import javax.swing.*;

public class mainMethod{
    public static void main(String[] args) {
        JFrame x = new JFrame("graphic");
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grafic gObject = new grafic();
        x.add(gObject);
        x.setSize(500 , 750);
        x.setVisible(true);
    }
}
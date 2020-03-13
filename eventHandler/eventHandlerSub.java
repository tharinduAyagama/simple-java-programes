import java.awt.FlowLayout;
import java.awt.event.ActionListener;   //waiting for somthing like enter
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


class eventHandlerSub extends JFrame{

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JTextField item4;
    private JPasswordField password;

    public eventHandlerSub(){
        super("Regiter Form");

        setLayout(new FlowLayout());

        item1 = new JTextField("name");
        add(item1);

        item2 = new JTextField("mail");
        add(item2);

        item3 = new JTextField("company is uneditable" , 10);
        item3.setEditable(false);
        add(item3);

        item4 = new JTextField("your job type");
        add(item4);

        password = new JPasswordField("enter ur password");
        add(password);

        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        password.addActionListener(handler);
        
    }

    private class theHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            String string = "";

            if(event.getSource()==item1){
                string = String.format("feild 1: %s" , event.getActionCommand());       
            }
            else if(event.getSource()==item2){
                string = String.format("feild 2: %s" , event.getActionCommand());
            }
            else if(event.getSource()==item3){
                string = String.format("feild 3: %s" , event.getActionCommand());
            }
            else if(event.getSource()==item4){
                string = String.format("feild 4: %s" , event.getActionCommand());
            }
            else if(event.getSource()==password){
                string = String.format("password feild: %s" , event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, string);
        }
    } 
}
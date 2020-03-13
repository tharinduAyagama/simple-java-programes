import javax.swing.JOptionPane;

class gui{
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Inpu the first number ");            //geting inputs 
        String input2 = JOptionPane.showInputDialog("Input the second numner ");          //geting inputs

        int num1 = Integer.parseInt(input1);            //casting to intigers 
        int num2 = Integer.parseInt(input2);            //casting to intigers

        int sum = num1 + num2 ; 

        JOptionPane.showMessageDialog(null , "The sum is " + sum , "Summation", JOptionPane.PLAIN_MESSAGE);     //showing the sum

    }
}
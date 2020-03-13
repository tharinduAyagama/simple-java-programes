import javax.swing.JFrame;

class gui{
    public static void main(String[] args) {
        subClass object = new subClass();
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //giving the way to close the progeamme 
        object.setSize(400, 300);       //set the size of te window
        object.setVisible(true);        //we can see the window after we do this

        

    }
}
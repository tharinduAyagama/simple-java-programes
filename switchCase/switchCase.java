import java.util.Scanner;

class switchCase{
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        
        System.out.println("enter a number"); 
        int p = X.nextInt();
    
        switch (p) {
            case 1:
                System.out.println("entered number is 1");    
                break;
    
            case 2:
                System.out.println("entered number is 2");    
                break;
                
        
            default:
                System.out.println("entered number is not 1 or 2");
                break;
        }
    }
}
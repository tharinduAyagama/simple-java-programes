import java.util.Random;

class randomNum{
    public static void main(String[] args) {
        Random rNum = new Random();

        double num1=rNum.nextInt();  //any random number
        double num2=rNum.nextInt(10);  //random number between 0 and 10 
        System.out.println(num1);
        System.out.println(num2);
        
    }
}
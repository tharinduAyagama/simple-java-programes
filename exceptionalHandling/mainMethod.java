import java.util.*;

class mainMethod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int div;
        int x = 1;

        //try means the code witch we want to exicute
        //catch means it recognize the errors. when we use this the whole programe isnt stopped. catch shows the error and cotinue the rest of the programe
        do{
            try{
                System.out.println("enter the first number");
                int num1 = input.nextInt();
                System.out.println("enter the seocnd number");
                int num2 = input.nextInt();
                div = num1/num2;
                System.out.println(div);
                x=2;
            }
            catch(Exception e){
                System.out.println("error");
            }
        }
        while(x==1);
    }
}
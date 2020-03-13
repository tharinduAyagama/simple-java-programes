import java.util.Random;

class arrayElementAsCounters{
    public static void main(String[] args) {
        Random randomNumber = new Random();

        int counterArray[] = new int[10];
    
        for(int i=0;i<1000;i++){
            ++counterArray[randomNumber.nextInt(10)];     //according to the random number appropriate index's counter will increase by one
        }
    
        for(int j=0;j<10;j++){
            System.out.println(counterArray[j]);
        }
    }
} 
import java.io.*;
import java.util.*;

class readFile{
    private Scanner file;
    

    public void openFile(){
        try{
            file = new Scanner(new File("D:\\Java\\simple programmes\\file\\testFile.txt"));
        }
        catch(Exception e){
            System.out.println("error");
        }
    }

    public void readThingsFile(){
        while(file.hasNext()){
            String name = file.next();
            String marks = file.next();
            System.out.printf("%s %s\n" , name , marks);
        }
    }

    public void fileClose(){
        file.close();
    }
}
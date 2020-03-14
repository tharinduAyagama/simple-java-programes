import java.io.*;
import java.lang.*;
import java.util.*;

class writeFile{
    private Formatter file;

    public void openFile(){
        try{
            file = new Formatter("D:\\Java\\simple programmes\\file\\testFile.txt");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }

    public void writeToFile(){
        file.format("%s %S\n" , "tharindu" , "8");
        file.format("%s %S\n" , "hirantha" , "5");
        file.format("%s %S\n" , "bandara" , "6");
        file.format("%s %S\n" , "ayagama" , "9");
    }

    public void fileClose(){
        file.close();
    }
}
package homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
//        System.out.println("test");
        try {
            Scanner sc = new Scanner(new File("input.txt")).useDelimiter("\\s*");
//            System.out.println("Code works");
            while (sc.hasNextLine()){
                String string = sc.nextLine();
                String[] split=string.split(" ");
                for (int i=0; i < split.length; i++){
                    System.out.println(split[i]);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("error");
        }

    }
}

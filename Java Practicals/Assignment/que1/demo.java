package Assignment.que1;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;

public class demo{
    public static void main(String args[]){
        File f = new File("/home/gaurav/cs4b44/Java/Assignment/que1");
        int data;
        Scanner sc;
        String even = "";
        String odd = "";
        if(!f.exists()){
            System.out.println("The File does not exists..");
            return;
        }
        else{
            try{
            System.out.println("Reading from the file : " + f.getName());
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                data = sc.nextInt();
                if(data % 2 == 0)
                    even += data + " ";
                else
                    odd += data + " ";
            }
            sc.close();
            } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }
        System.out.println(" Even :\t" + even);
        System.out.println(" Odd  :\t" + odd);
    }
}
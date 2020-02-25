import java.io.*;
import java.io.FileNotFoundException;

class fileb{
    public static void main(String args[]) throws IOException{
        FileReader obj1=new FileReader("/home/gaurav/cs4b44/gaurav.txt");
        char[] arr=new char[50];
        int a=obj1.read(arr);
        for(int i=0;i<50;i++){
            System.out.print(arr[i]);
        }

        obj1.close();
    }
}
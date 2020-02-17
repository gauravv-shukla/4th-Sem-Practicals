package File;

import java.util.Scanner;

class demo{
    public static void main(String args[]){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a location?");
        s=sc.nextLine();
        files var=new files();
        var.filerecurse(s);
    }
    
}
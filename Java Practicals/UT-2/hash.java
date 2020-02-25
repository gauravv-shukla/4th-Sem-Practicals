import java.io.*;
import java.util.Arrays;

public class hash {
    int tot,totl,dur;
    public static void main(String[] args) {
        int nobooks,shipbooks,n=0;
        try{
            File f = new File("example.txt");
            FileReader fr =new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s =br.readLine();
            int books,libs,days;
            books=Integer.parseInt(s.split(" ")[0]);    //No. of books
            libs=Integer.parseInt(s.split(" ")[1]);     //No. of libraries
            days= Integer.parseInt(s.split(" ")[2]);    //No. of Days
            String s1 = br.readLine();
            //System.out.println(books);
            int[] scarr = new int[books];
            for(int i=0;i<books;i++){                   //To store books score
                scarr[i]=Integer.parseInt(s1.split(" ")[i]);
            }
            int[] signup=new int[libs];
            for(int t=1;t<=libs;t++){
                br.readLine();
                if((t+1)%2!=0 && t>1){
                    String s=br.readline();
                }
            }
            for(int i=0;i<n+2;i++){
                br.readLine();  //For a specific library
            }
            String s2=br.readLine();
            signup = Integer.parseInt(s2.split(" ")[1]);    
            System.out.println(signup);
            nobooks= Integer.parseInt(s2.split(" ")[0]);
            shipbooks=Integer.parseInt(s2.split(" ")[2]);
            String s3=br.readLine();
            int[] bookid=new int[nobooks];
            for(int i=0;i<nobooks;i++){
                bookid[i] = Integer.parseInt(s3.split(" ")[i]);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
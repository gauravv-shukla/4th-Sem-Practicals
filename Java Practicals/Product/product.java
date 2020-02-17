package Product;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;

class product{
    String PID,Name;
    int no,quantity,price;
    void getdata(){
        FileWriter fw=new FileWriter("Product.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of product?(Shopkeeper)");
        no=br.read();
        fw.write("PID"+"  "+"Quantity"+"  "+"Price");
        for(int i=1;i<=no;i++){
            System.out.println("Enter Product ID?");
            PID=br.readLine();
            System.out.println("Enter the Quantity of Product");
            quantity=br.read();
            System.out.println("Enter Price of Product?");
            price=br.read();
            fw.write(PID+"  "+quantity+"  "+price);
        }

    }
}
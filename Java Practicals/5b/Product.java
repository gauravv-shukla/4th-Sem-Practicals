import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

class Product {
    String PID,name;
    float quantity,price,count=0;
    void getdata()throws IOException{
        FileWriter fw=new FileWriter("Product.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of products?");
        count=br.read();
        String str="PID   Product   Quantity   Price";
        fw.write(str);
        for(int i=0;i<count;i++){
            System.out.println("Enter a Product ID?");
            PID=br.readLine();
            System.out.println("Enter the Quantity of product?");
            quantity=br.read();
            System.out.println("Enter the Product Name?");
            name=br.readLine();
            System.out.println("Enter the Price of the product?");
            price=br.read();
            str=PID+"  "+name+"  "+quantity+"  "+price;
            fw.write(str);
        }
        fw.close();
    }

}
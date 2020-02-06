package Company;

import java.util.Scanner;

class Employee extends person{
    String Post;
    Double basic_pay,calsalary;

    Employee(){
        super();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the post of Employee?");
        this.Post=scan.next();
        scan.close();
    }


    void calsalary(){
        Scanner var2=new Scanner(System.in);
        System.out.println("Enter the Basic Pay of Employee?");
        this.basic_pay=var2.nextDouble();
        this.calsalary=1.5*basic_pay;
        var2.close();
    }
    void display(){
        super.display();
        System.out.println("Post of Employee:"+Post);
        System.out.println("Basic Pay:"+basic_pay);
        System.out.println("Salary:"+calsalary);
    }
}
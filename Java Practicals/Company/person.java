package Company;

import java.util.Scanner;;

class person{
    String name;
    int[] dob= new int[3];
    int age;
    person(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the person?");
        this.name=sc.next();
        System.out.println("Enter DOB of the person?(DD/MM/YYYY)");
        this.dob[0]=sc.nextInt();
        this.dob[1]=sc.nextInt();
        this.dob[2]=sc.nextInt();
        calage();
        sc.close();
    }
    void calage(){
        this.age=2020-this.dob[2];
    }
    void display(){
        System.out.println("Name of the person:"+name);
        System.out.println("DOB:"+dob[0]+"/"+dob[1]+"/"+dob[2]);
        System.out.println("Age:"+age);
    }
}
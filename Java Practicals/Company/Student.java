package Company;

import java.util.Scanner;

class Student extends person{
    int semester;
    Double sgpa=0.0,cgpa=0.0;

    Student(){
        super();
        Scanner var1=new Scanner(System.in);
        System.out.println("No. of Semester?");
        this.semester=var1.nextInt();
        var1.close();
    }

    void calcgpa(){
        Scanner var2=new Scanner(System.in);        
        System.out.println("Enter SGPA of all semester?");
        for(int i=1;i<=semester;i++){
            System.out.println("SGPA for "+i+"Semester");
            this.sgpa=var2.nextDouble();
            this.cgpa+=this.sgpa;
        }
        this.cgpa/=semester;
        var2.close();
    }

    void display(){
        super.display();
        System.out.println("No. of Semester: "+semester);
        System.out.println("CGPA of Student:"+cgpa);
    }
}
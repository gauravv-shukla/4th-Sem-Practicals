package que5;

import java.util.Scanner;

class Student{
    String name;
    int roll;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the student :  ");
        name = sc.next();
        System.out.println("Enter the roll no. ");
        roll = sc.nextInt();
        sc.close();
    }
}

class Internal extends Student implements Assignment, Test{
    int test1, test2, asg1, asg2;
    
    Internal(){
        super.getdata();
    }
    void setInternal(int t1, int t2, int asg1, int asg2){
        this.getT1Marks(t1);
        this.getT2Marks(t2);
        this.getAssign1marks(asg1);
        this.getAssign2marks(asg2);
    }
    public void getT1Marks(int t1){
        this.test1 = t1;
    }
    public void getT2Marks(int t2){
        this.test2 = t2;
    }

    public void getAssign1marks(int asg1){
        this.asg1 = asg1;
    }
    public void getAssign2marks(int asg2){
        this.asg2 = asg2;
    }
    void display(){
        System.out.println("Internal Marks of " + name + ", Roll no. : " + roll);
        System.out.println("Test-1 Score: \t" + test1);
        System.out.println("Test-2 Score: \t" + test2);
        System.out.println("Assignment-1 Score : " + asg1);
        System.out.println("Assignment-2 Score: " + asg2);
        System.out.println("\tInternal-Marks : " +(test1+test2+asg1+asg2));
    }
    
}
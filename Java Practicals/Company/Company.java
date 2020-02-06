package Company;

import java.util.Scanner;

public class Company{
    public static void main(String[] args) {
        int oper;
        Scanner sca=new Scanner(System.in);
        System.out.println("1.Employee 2.Student");
        oper=sca.nextInt();
        switch(oper){
            case 1:
            Employee emp1=new Employee();
            emp1.calsalary();
            emp1.display();
            break;

            case 2:
            Student stu1=new Student();
            
            stu1.display();
            break;

            default:
            System.out.println("Wrong Input Given"+"\n"+"Terminating");
        }
        sca.close();
    }
}
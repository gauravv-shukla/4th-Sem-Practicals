package que5;

import java.util.Scanner;


interface Test{
    public void getT1Marks(int l);
    public void getT2Marks(int m);
}
interface Assignment{
    public void getAssign1marks(int n);
    public void getAssign2marks(int o);
}

public class demo
{
	public static void main(String[] args) {
		 
		
		int t1, t2, asg1,asg2; 
		    Internal stu1 = new Internal();
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter the Number of marks in test 1 & test 2");
		    t1 = cin.nextInt();
		    t2 = cin.nextInt();
		    System.out.println("Enter the Number of marks in Assignment 1 & 2");
		    asg1 = cin.nextInt();
		    asg2 = cin.nextInt();
		    stu1.setInternal(t1,t2,asg1,asg2);
            stu1.display();
        cin.close();
		 
	    
	}
}
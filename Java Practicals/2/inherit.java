
import java.util.Scanner;

public class inherit {
    public static void main(String[] args){
        time t1=new time();
        time t2=new time();
        time tf=new time();
        System.out.println("Enter time 1:");
        t1.getdata();
        System.out.println("Enter time 2:");
        t2.getdata();
        tf=tf.add(t1, t2, tf);
        tf.display(tf);
        
        distance d1=new distance();
        distance d2=new distance();
        distance d=new distance();
        System.out.println("Enter Distance 1:");
        d1.getdata();
        System.out.println("Enter Distance 2:");
        d2.getdata();
        d=d.add(d1, d2, d);
        d.display(d);       
    }
}

class addition{
    
    int add(int i,int j){
        return(i+j);
    }
    
}

class time extends addition{
    int hr,min,sec;
    
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hour");
        hr=sc.nextInt();
        
        System.out.println("Enter Minutes");
        min=sc.nextInt();
        
        System.out.println("Enter Seconds");
        sec=sc.nextInt();
    }
    
    time add(time t1,time t2,time t3){
        t3.sec=add(t1.sec,t2.sec);
        t3.min=add(t1.min,t2.min);
        t3.hr=add(t1.hr,t2.hr);
        if(t3.sec>=60){
            t3.min=t3.min+1;
            t3.sec=t3.sec-60;
        }
        if(t3.min>=60){
            t3.hr=t3.hr+1;
            t3.min=t3.min-60;
        }   
        return(t3);
    }
    
    void display(time t){
        System.out.println("Time is:");
        System.out.print(t.hr+"Hr  ");
        System.out.print(t.min+"Min  ");
        System.out.print(t.sec+"Sec");
        System.out.println();
    }
}

class distance extends addition{
    int foot,inch;
    
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance(In Feet)?");
        foot=sc.nextInt();
        System.out.println("Enter Distance(In Inches)?");
        inch=sc.nextInt();
    }
    
    
    distance add(distance d1,distance d2,distance d3){
        
        d3.foot=add(d1.foot,d2.foot);
        d3.inch=add(d1.inch,d1.inch);
        if(d3.inch>=12){
            d3.foot++;
            d3.inch-=12;
        }
        return(d3);
    }
    
    void display(distance d){
        System.out.println("Distance(In Foot):"+d.foot);
        System.out.println("Distance(In Inches)"+d.inch);
    }
}
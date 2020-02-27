import java.util.Scanner;

public class leave {
    public static void main(String args[]){
        int days;
        
        own o=new own("Owner","CEO");
        hr h =new hr("HR","Gaurav",40000,150,new approver[]{o});
        pm p=new pm("Manager","Adesh",30000,120,new approver[]{h,o});
        employee e=new employee("Employee","Ramesh",20000,100,new approver[]{p,h,o});   
        
        
        System.out.println(e.rpm);
        System.out.println("Enter no. of Leave Days?");
        Scanner sc=new Scanner(System.in);
        days=sc.nextInt();
        e.req(days);
        
    }
}
    class employee {
    String name,des;
    int sal;
    approver rpm[];
    int bal;
    employee(String name,String des,int sal,int bal,approver rpm[]){
        this.name=name;
        this.des=des;
        this.sal=sal;
        this.rpm=rpm;
        this.bal=bal;
    }
    employee(){
        
    }

            
    void req(int days){
        System.out.println(des+" "+name+" Requested "+days+"Days leave.");
        if(days<=bal)
        {
            for(int i=0;i<rpm.length;i++){
               
                approver a=rpm[i];
                System.out.println("Request sent to "+a+" by "+this.des+" "+this.getClass().getName());
                boolean b=a.approve(days);
                if(b){
                    System.out.println("Thankyou!");
                    break;
                }
            }
        }
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Designation:"+des);
        System.out.println("Salary:"+sal);
    }
}
interface approver{
    boolean approve(int days);
}



class pm extends employee implements approver{ 
    pm(String name,String des,int sal,int bal,approver rpm[]){
        this.name=name;
        this.des=des;
        this.bal=bal;
        this.sal=sal;
        this.rpm=rpm;
    }
                                                 
    public boolean approve(int days){                        
    if(days<=10){
        System.out.println("Request approved by "+this.des+" "+this.getClass().getName());
        return true;
    }
    else{
        System.out.println("Request forwarded by "+this.des+" "+this.getClass().getName());
        return false;
    }
}
}

class hr extends employee implements approver{
     hr(String name,String des,int sal,int bal,approver rpm[]){
        this.name=name;
        this.des=des;
        this.bal=bal;
        this.sal=sal;
        this.rpm=rpm;
    }
    public boolean approve(int days){    
    if(days<=20){
        System.out.println(" Request approved by "+this.des+" "+this.getClass().getName());
        return true;
    }
    else{
        System.out.println(" Request forwarded by "+this.des+" "+this.getClass().getName());
        return false;
    }
}
}

class own extends employee implements approver{
     own(String des,String name){
        this.name=name;
        this.des=des;
        
    }
    public boolean approve(int days){    
    if(days<=100){
        System.out.println(" Request approved by "+this.des+" "+this.getClass().getName());
        return true;
    }
    else{
        System.out.println(" Request declined ");
        return false;
    }
}
}
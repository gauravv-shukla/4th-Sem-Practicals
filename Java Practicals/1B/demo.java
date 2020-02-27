
public class demo {
    public static void main(String args[]){
        test cd=new test();
        cd.posting(90,90,90);
        cd.posting(90,90);
        cd.posting(90);
        test cd1 = new test();
        cd1.posting(70,70,70);
        cd1.posting(60,70);
        cd1.posting(65);
    }
    
}

class test{
    int pi,tt,at;
    void posting(int pi,int tt,int at){
        if(((pi+tt+at)/3)<=80){
            System.out.println("Not Eligible for a Programmer");
        }
        else{
            System.out.println("Eligible for a Programmer");
        }
        
    }
    
    void posting(int pi,int tt){
        if(((pi+tt)/2)<=80){
            System.out.println("Not Eligible for a Team Leader");
        }
        else{
            System.out.println("Eligible for a Team Leader");
        }
    }
    
    void posting(int pi){
        if(pi<=80){
            System.out.println("Not Eligible for a Manager");
        }
        else{
            System.out.println("Eligible for a Manager");
        }
    }
}
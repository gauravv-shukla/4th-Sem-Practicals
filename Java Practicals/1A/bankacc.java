
public class bankacc {
    public static void main(String[] args){
        account gs=new account(800,"Gaurav","gs0011");
        account ak=new account(1200,"Adesh","ak0096");
        gs.deposit(1000);
        gs.withdraw(500);
        gs.disp();
        gs.transfer(5000,ak);
        gs.disp();
        ak.disp();
        
    }
    
}

class account{
    double balance;
    String name;
    String accN;
    
    account(double balance,String name,String accN){
        this.balance=balance;
        this.name=name;
        this.accN=accN;
        
    }
    
    void deposit(int n){
        balance=balance+n;
        System.out.println("Amount deposited:"+n);
    }
    
    void withdraw(int n){
        balance=balance-n;
        System.out.println(" Amount withdrawn:"+n);
    }
    
    void disp(){
        System.out.println("Account Holder's Name:"+name);
        System.out.println(" Account No.:"+accN);
        System.out.println(" Balance Available:"+balance);
    }
    
    void transfer(int n,account a){
        if(this.balance<n){
            System.out.println("Insufficient Balance");
        }
        else{
        this.withdraw(n);
        a.deposit(n);
        }
    }
    
    public void setbal(int balance){
        this.balance=balance;
    }
    
    public void setname(String name){
        this.name=name;
    }
    
    public void setaccn(String accN){
        this.accN=accN;
    }
}
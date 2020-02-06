package Student;

import java.util.Scanner;

class Student{
    String eno,pass,name;
    int flag=0;
    float cgpa;
    void getdata(){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Name?");
            name=sc.next();
            System.out.println("Enter an Enrollment No.?");
            eno=sc.next();
            encheck();
            if(flag==1 || eno.length()!=10){
                sc.close();
                throw new StudentException("Invalid Enrollment No.");
            }
            flag=0;
            System.out.println("Enter a Password?");
            pass=sc.next();
            passcheck();
            if(pass.length()<8){
                sc.close();
                throw new StudentException("Invalid Password length");
            }
            else if(flag==1){
                sc.close();
                throw new StudentException("Invalid Password");
            }
            System.out.println("Enter your CGPA?");
            cgpa=sc.nextFloat();
            System.out.println("Form Accepted Successfully");
            sc.close();
        }
        catch(StudentException e){
            System.out.println(e);
        }
    }

    void display(){

    }

    void encheck(){
        int year,no;
        no=((int)eno.charAt(7)-'0')*100+((int)eno.charAt(8)-'0')*10+((int)eno.charAt(9)-'0');
        year=((int)eno.charAt(2)-'0')*10+((int)eno.charAt(3)-'0');
        if(eno.charAt(0)!='B' && eno.charAt(1)!='E' ){
            System.out.println("BE");
            flag=1;
            return;
        }
        else if(year>20){
            System.out.println("Year");
            flag=1;
            return;
        }
        else if(!((eno.charAt(4)=='E' && eno.charAt(5)=='C') || (eno.charAt(4)=='E' && eno.charAt(5)=='E') || (eno.charAt(4)=='C' && eno.charAt(5)=='S') || (eno.charAt(4)=='E' && eno.charAt(5)=='N'))){
            System.out.println("Branch");
            flag=1;
            return;
        }
        else if(eno.charAt(6)!='U'){
            System.out.println("U");
            flag=1;
            return;
        }
        if(no>250){
            flag=1;
            return;
        }
    }

    void passcheck(){
        int i=0,len=pass.length(),ucase=0,lcase=0,ncase=0,scase=0,count=0;
        for(i=0;i<len;i++){
            if((int)pass.charAt(i)>64 && (int)pass.charAt(i)<91){
                ucase++;
                count++;
            }
            else if((int)pass.charAt(i)>96 && (int)pass.charAt(i)<123){
                lcase++;
                count++;
            }
            else if((int)pass.charAt(i)>47 && (int)pass.charAt(i)<58){
                ncase++;
                count++;
            }
            else if((int)pass.charAt(i)==42 || (int)pass.charAt(i)==35 || (int)pass.charAt(i)==37 || (int)pass.charAt(i)==36 || (int)pass.charAt(i)==33){
                ncase++;
                count++;
            }
        }
        if(len!=count){
            flag=1;
            return;
        }
        else if((ucase==0 && lcase==0) && (scase==0 && ncase==0)){
            flag=1;
            return;
        }
    }
}
package que3;

import java.util.Scanner;

class VehicleValidator{
    String Reg;
    String Name;

    void getdata(){
        try{
            Scanner c= new Scanner(System.in);
            System.out.println("Enter the Number you want to check for? ");
            this.Reg = c.nextLine();
            System.out.println("Enter the Name of the vehicle  ");
            this.Name = c.nextLine();
            c.close();
            if(Name.length() == 0){
                throw new NullPointerException();
            }
        }
        catch(NullPointerException e){
            System.out.println("Vehicle name blank!");
        }
    }

    void checkData(){
        try{
            String[] A = Reg.split("-");
            String[] B = A[1].split(" ");
            int sub1 = Integer.parseInt(B[0]);
            int sub2 = Integer.parseInt(A[2]);
            if(!(A[0].equals("GJ") || A[0].equals("DL") || A[0].equals("AP") || A[0].equals("MP") || A[0].equals("MH"))){

                throw new VehicleException("Invalid State Found");
            }
            
            if(sub1<0 || sub1>99 || sub2 < 0 || sub2 > 9999){

                throw new VehicleException("Invalid Format found");
            }
            if(Reg.length() != 13){
                throw new VehicleException("Invalid Registration No.");
            }
            if(! (Character.isLetter(B[1].charAt(0)) || Character.isLetter(B[1].charAt(1) ) )){
                throw new VehicleException("Invalid Format found");
            }
            
        System.out.println("Registration Number is Valid");
        display();
        }
        catch(VehicleException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Field left blank or Blank space or/and Hyphen is misplaced");
        }
        
    }
    void display(){
        if(Name.length()!=0){
            System.out.println("Vehicle Name : " +this.Name);
        }
        System.out.println("Registration Number : " + Reg);
    }
   
}
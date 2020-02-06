package que4;

import java.util.Scanner;

class Electricbill
{
    String name;
    int units,unit;
    double bill = 0.0;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Customer name : ");
        name = sc.next();
        System.out.println("Enter the units of electricity consumed :");
        units = sc.nextInt();
        sc.close();
    }
    void generate(){
        unit=units;
        if(units <= 100)
            bill = 500;
        else{
            units = units - 100;
            bill = bill + 500;
            if(units <= 500)
                bill = bill + (2.36 * units);
            else{
                bill = bill + (2.36*500);
                units = units - 500;
                if(units <= 2000)
                    bill = bill + (3.5*units);
                else{
                    bill=bill+(3.5*2000);
                    units=units-2000;
                    bill=bill+(5.09*units);
                }
            }
        }
        System.out.println("\n\nElectricity bill:");
        System.out.println("Customer Name:"+name);
        System.out.println("No. of units Consumed:"+unit);
        System.out.println("Total bill:"+bill);
    }
}
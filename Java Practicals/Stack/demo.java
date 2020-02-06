package Stack;

import java.util.Scanner;

class demo{
    public static void main(final String[] args) {
        int ele;
        Stack ob = new Stack();
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements to be removed");
        if(sc.hasNextInt() ){
        ele=sc.nextInt();
        }
        else{
            ele=0;
        }
        sc.close();
        for(int i=0;i<ele;i++){
            System.out.println(ob.pop()+" ");
        }
        ob.display();
        return;
    }
}
package Stack;
import java.util.Scanner;

class Stack{
    int arr[],top,t;
    Stack(){
        this.top=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Stack?");
        t=sc.nextInt();
        arr=new int[t];
        sc.close();
    }
    void push(int i){
        if(top==t-1){
            System.out.println("Stack is Full");
        }
        else{
            top++;
            arr[top]=i;
        }
    }
    int pop(){
        if(this.top==-1){
            System.out.println("Stack is Empty");
            return 0;
        }
        else{
        int z=arr[top];
        this.top--;
        return z;
        }
    }
    void display(){
        if(this.top==-1){
        System.out.println("Stack is Empty");
        return;
        }
        else{
            System.out.println("Array contents are:");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
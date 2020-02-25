class exp1{
    public static void main(String args[]){
        try{
        aarushi obj=new aarushi(5);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }

}

class aarushi{
    aarushi(int x) throws ArithmeticException{
        if(x%2==0){
            throw new ArithmeticException("Even No.");
        }
        else{
            throw new ArithmeticException("Odd No.");
        }
    }
}
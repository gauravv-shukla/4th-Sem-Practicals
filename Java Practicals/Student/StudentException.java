package Student;

class StudentException extends Exception{
    String name;

    StudentException(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        String gaurav="Exception:"+name;
        return gaurav;
    }
}
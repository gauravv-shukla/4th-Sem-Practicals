package que3;

class VehicleException extends Exception{
    String name;
    VehicleException(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

}

 class car{
    static void convertkmintomiles(){
        System.out.println("converting km into miles");
    }
    void calculatemileage(){
        System.out.println("calculating mileage");
    }
}
    public class staticc{
    public static void main(String[] args){
        car.convertkmintomiles();
        car c = new car();
        c.calculatemileage();
    }
}

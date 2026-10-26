class encapsulation{
    private int age;
   public  void setage(int age){
        this.age = age;
    }
   public  int getage(){
        return age;
    }
}
    
public class encap{
    public static void main(String[] args){
        encapsulation e = new encapsulation();
        e.setage(20);
        System.out.println(e.getage());
    }
}

public class employee{
    int id = 12;
    String name="darshan";
    
void work (){
    System.err.println("Working");
}
}
public class Obj2{
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.name="darshan";
        e1.id=101;
        e1.work();

        System.out.println(" id:"+ e1.id);
        System.out.println(" name:"+ e1.name);
        
         employee e2 = new employee();
         e2=e1;
         e2.id=102;
         e2.name="Rahul";
         System.out.println(" id:"+ e2.id);
         System.out.println("name :"+ e2.name);
}
}
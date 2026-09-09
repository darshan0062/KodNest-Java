class conductor{
     void collect(money m){
         System.out.println(" Money collected by conductor");
     }
     ticket give(){
         ticket t =new ticket();
         System.out.println("Ticket issued");
         return t;
     }
    
}class money{
}
class ticket
{
}
public class realprogram{
    public static void main(String[] args) {
        conductor c= new conductor();
        money m =new money();
        c.collect(m);
        ticket t = c.give();
        System.out.println(t);
        if(t!=null){
            System.out.println("Ticket Collected");
        }
        
    }
}

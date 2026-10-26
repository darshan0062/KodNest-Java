class developer{
void work(){
System.out.println("developer working");
}
void project(){
    System.out.println("developer doing project ");
}
}
class javadeveloper extends developer{
    @Override
    void work(){
        System.out.println("javadeveloper is working");
    }
    void project(){
        System.out.println("javadeveloper is doing project");
    }
}
class pythondeveloper extends developer{
    @Override
    void work(){
        System.out.println("pythondeveloper is working");
    }
    void project(){
        System.out.println("pythondeveloper is doing project");
    }
}
public class runtimepolymorphism{
    public static void main(String[] args) {
        
    }
}
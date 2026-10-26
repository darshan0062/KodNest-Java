class student{
    int roll;
    String name;
    student(int roll , String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println("roll :"+roll);
        System.out.println("name :"+name);
    }
}
public class logic{
    public static void main(String[] args) {
        student s1 = new student(1, "darshan");
        student s2 = new student(1, "hello");
         student s3 = new student(1, "darshan");
        s1.display();
        s2.display();
        s3.display();
        System.out.println(s1.equals(s3));
        
    }
}
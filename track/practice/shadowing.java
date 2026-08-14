class student{
    String name;
    int age;
    double height;
    

    void input(String name , int age , double height){
         this.name=name;
         this.age=age;
         this.height=height;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("height:"+height);
    }
}

public class shadowing{
    public static void main(String[] args) {
        student s1 = new student();
        s1.input("darshan",20,6.0);
        s1.display();
    }
}
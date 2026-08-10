
class student {

    String name;
    int age;
    double height;
    int rollno;

    void run() {
        System.out.println("Running");
    }
}

public class Student {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "darshan";
        s1.age = 20;
        s1.height = 6.0;
        s1.rollno = 12;
        s1.run();
        System.out.println("name:" + s1.name);
        System.out.println("age:" + s1.age);
        System.out.println("height:" + s1.height);
        System.out.println("roll no:" + s1.rollno);
    }
}

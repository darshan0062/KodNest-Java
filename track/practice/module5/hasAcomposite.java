
class os {

    os() {
        System.out.println("os is installed");
    }

    void checkos() {
        System.out.println("os is executing");
    }
}

class mobile {

    os o = new os();

    mobile() {
        System.out.println("mobile created with os");
    }
}

public class hasAcomposite {

    public static void main(String[] args) {
        mobile m = new mobile();
        m.o.checkos();

        // m = null;        //object destroyed 
        // m.o.checkos();    //so os is composite class if mobile is null os class is also null
    }
}

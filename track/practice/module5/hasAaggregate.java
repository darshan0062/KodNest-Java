
class os {

    os() {
        System.out.println("os is installed");
    }

    void checkos() {
        System.out.println("os is executing");
    }
}

class charger {

    charger() {
        System.out.println("charger is created");
    }

    void getcharger() {
        System.out.println("charger is charging");
    }
}

class mobile {

    os o = new os();

    mobile() {
        System.out.println("mobile created with os");
    }

    void hasacharger(charger c) {//reference of 
        System.out.println("charger acquired");
    }
}

public class hasAaggregate {

    public static void main(String[] args) {
        mobile m = new mobile();
        charger c = new charger();
        m.hasacharger(c);

        c.getcharger();

        m = null;   //object destroyed 
        c.getcharger();

    }
}

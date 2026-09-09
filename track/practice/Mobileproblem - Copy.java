class Mobile{

    void unlock(int number){
        System.out.println("Unlocked using Numbers");
    }
    void unlock(String text){
        System.out.println("Unlocked using Alphabets");
    }
    void unlock(Pattern p){
        System.out.println("Unlocked using Pattern");
    }
    void unlock(Face f){
        System.out.println("Unlocked using Face");
    }
    void unlock(Fingerprint fp){
        System.out.println("Unlocked using FingerPrint");
    }
}
class Pattern{
} 
class Face{
}
class Fingerprint{
}

class Mobileproblem{
    public static void main(String[] args){
        Mobile m = new Mobile();
        m.unlock(1234);
        m.unlock("abcd");
        Pattern p = new Pattern();
        Face f = new Face();
        Fingerprint fp = new Fingerprint();
        m.unlock(p);
        m.unlock(f);
        m.unlock(fp);
    }
}
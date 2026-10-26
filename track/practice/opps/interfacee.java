interface shape{
    public abstract void input();
    public abstract void disp();
}
class square implements shape{
    @Override
    public void input(){
        System.out.println("input");
    }
     @Override
    public void disp(){
        System.out.println("disp");
    }

}
public class interfacee{
    public static void main(String[] args) {
        shape s = new square();
        s.input();
        s.disp();
    }
}
class demo{
    static  {
        System.out.println("1st static block excuted");
    }
    static  {
        System.out.println("2nd static block excuted");
    }
    {
        System.out.println("1st object block");
    }
    {
        System.out.println("2nd object block");
    }
    
}
class logic{
    public static void main(String[] args){
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();
    }
}
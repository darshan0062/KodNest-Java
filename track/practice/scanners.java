
import java.util.Scanner;

public class scanners {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String h = sc.next();
        System.out.println(h);

        System.out.println("enter your age");
        byte a = sc.nextByte();
        System.out.println(a);

        System.out.println("enter your height");
        short b = sc.nextShort();
        System.out.println(b);

        System.out.println("enter your long number");
        long c = sc.nextLong();
        System.out.println(c);

        System.out.println("enter your pincode");
        int d = sc.nextInt();
        System.out.println(d);

        System.out.println("enter your weight");
        float e = sc.nextFloat();
        System.out.println(e);

        System.out.println("enter your accuracy");
        double f = sc.nextDouble();
        System.out.println(f);

        System.out.println("enter your gender");
        boolean g = sc.nextBoolean();
        System.out.println(g);

    }
}

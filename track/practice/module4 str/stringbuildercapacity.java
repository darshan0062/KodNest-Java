public class stringbuildercapacity {
public static void main(String[] args) {
StringBuilder sbr = new StringBuilder("Java");
sbr.ensureCapacity(100);// by default capacity is 16 we increase to 100 using ensure 
System.out.println(sbr.capacity());
System.out.println(sbr);
sbr.append("Program");
System.out.println(sbr);
}
}// if we give more than 16 char then jvm performs old capacity * 2 + 2 automatically

 
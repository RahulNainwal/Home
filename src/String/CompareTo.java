package String;

public class CompareTo {
public static void main(String[] args) {
	String s = "Rahul";
	String s1 = new String("Rahul");
	System.out.println(s.equals(s1));
	System.out.println(s == s1);
	System.out.println(s.compareTo(s1));
	String s2 = new String("Nainwal");
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s1));
}
}

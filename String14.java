// equals()
// == operator
// compareTo()

package corejava.Strings;

public class String14 {
public static void main(String[] args) {
	
	//equals
	String name1 = "dhinakaran";
	String name2 = "dhinakaran";
	String name3 = "sushmitha";
	String name4 = "Dhinakaran";
	System.out.println(name1.equals(name2));
	System.out.println(name1.equals(name3));
	System.out.println(name1.equals(name4));
	
	// == operator
	String n1 = "dhinakaran";
	String n2 = "dhinakaran";
	String n3 = new String("dhinakaran");
	System.out.println(n1==n2);
	System.out.println(n1==n3);
	
	// compareTo
	String s1 = "dhinakaran";
	String s2 = "dhinakaran";
	String s3 = "sushmitha";
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s3.compareTo(s1));
}
}

package corejava.Strings;

public class String16 {
public static void main(String[] args) {
	String name = "dhinakaran";
	String s1 = name.substring(0, 1).toUpperCase();
	String s2 = name.substring(1);
	String res = s1+s2;
	System.out.println(res);
}
}

package corejava.Strings;

public class String10 {
public static void main(String[] args) {
	String name = "amma";
	String res = "";
	for(int i=name.length()-1;i>=0;i--) {
		res += name.charAt(i);
	}
	if(name.equals(res)) {
		System.out.println("this is polyndrome");
	}
	else {
		System.out.println("this is not a polyndrome");
	}
}
}

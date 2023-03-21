package corejava.Strings;
import java.lang.String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "amma";
		String name1 = "";
		//int count = 1;
for(int i =name.length()-1;i>=0;i--) {
	name1 += name.charAt(i);
}
if(name.equals(name1)) {
	System.out.println("this is polyndrome");
}
else {
	System.out.println("this is not a polyndrome");
}

}
}

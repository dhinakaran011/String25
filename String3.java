package corejava.Strings;
import java.lang.String;

public class String3 {
public static void main(String[] args) {
	String name = "dhinakaran";
	char check = 'a';
	int count = 0;
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i) == check) {
			count++;
		}
	}
	System.out.println(count);
}
}

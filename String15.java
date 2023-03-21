package corejava.Strings;

public class String15 {
public static void main(String[] args) {
	String sen = "Hi i'm Dheena from Cuddalore";
	int count = 1;
	for(int i=0;i<sen.length();i++) {
		if(sen.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println("the number of words are "+count);
}
}

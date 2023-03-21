package corejava.Strings;

public class String5 {
	public static void main(String[] args) {
		String mail = "dhinakaran3010@gmail.com";
		for(int i=0;i<mail.length();i++) {
			if(mail.charAt(i)>='0' && mail.charAt(i)<='9') {
				System.out.println(mail.charAt(i));
			}
		}
	}
}

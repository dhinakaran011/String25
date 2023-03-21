package corejava.Strings;

public class String9 {
	public static void main(String[] args) {
		String name = "dhinakaran";
		String res = "";
		for(int i=name.length()-1;i>=0;i--) {
			res += name.charAt(i);
		}
		System.out.println(res);
	}

}

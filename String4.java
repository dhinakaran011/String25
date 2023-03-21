package corejava.Strings;

public class String4 {
public static void main(String[] args) {
	String name = "dhinakaran";
	char[] arr = name.toCharArray();
	int count = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' ||arr[i]=='o' || arr[i]=='u') {
			count++;
		}
	}
	System.out.println(count);
}
}

package corejava.Strings;

public class String7 {
public static void main(String[] args) {
	String name = "dhinakaran";
	int count = 1;
	char[] arr = name.toCharArray();
	boolean[] check = new boolean[arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j] && check[i] ==false) {
				count++;
				check[j] = true;
			}
		}
		if(count>1) {
			System.out.println(arr[i]);
			count=1;
		}
	}
}
}

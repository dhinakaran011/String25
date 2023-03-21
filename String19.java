package corejava.Strings;

public class String19 {
public static void main(String[] args) {
	String name = "sushmitha";
	char[] arr = name.toCharArray();
	boolean[] check = new boolean[arr.length];
	int count = 1;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				check[j] = true;
			}
		}
		if(count == 1 && check[i]==false) {
			System.out.println("the first non repeated element is "+arr[i]);
			break;
		}
		count = 1;
	}
}
}

package corejava.Strings;

public class String20 {
	public static void main(String[] args) {
		String name = "sushmitha";
		int count = 1;
		int result = 0;
		char ans = 0;
		char[] arr = name.toCharArray();
		boolean[] check = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					check[j] = true;
				}
			}
			if(count>result && check[i]==false ) {
				result = count;
				 ans = arr[i];
			}
			count = 1;
		}
		System.out.println("the highest occured element is "+ans);
	}
}

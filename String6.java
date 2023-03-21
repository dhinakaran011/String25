package corejava.Strings;

public class String6 {
	public static void main(String[] args) {
		String name = "dhinakaran";
		char[] arr = name.toCharArray();
		boolean[] chk = new boolean[arr.length];
		int count = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j] && chk[i]==false) {
					chk[j] = true;
					count++;
				}
			}
			if(chk[i] == false) {
				System.out.println(arr[i]+" = "+count);
				count = 1;
			}
		}
	}

}

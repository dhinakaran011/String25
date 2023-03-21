package corejava.Strings;
import java.util.Arrays;

public class String18 {
	public static void main(String[] args) {
		String str1 = "race";
		String str2 = "care";
		
		if(str1.length()!=str2.length()) {
			System.out.println("both the strings are not anagram");
		}
		else {
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2)==true) {
				System.out.println("both the strings are anagram");
			}
			else {
				System.out.println("both the strings are not anagram");
			}
		}
		
	}

}

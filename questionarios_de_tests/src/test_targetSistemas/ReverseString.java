package test_targetSistemas;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Hello world";
		
		String newStr = reverseString(str);
		
		System.out.println(newStr);
	}
	
	public static String reverseString(String str) {
		var splitStr = str.split("");
		String reformuledString = "";
		for(int i = splitStr.length-1 ; i >= 0 ; i--) {
			reformuledString += splitStr[i];
		}
		return reformuledString;
	}
}

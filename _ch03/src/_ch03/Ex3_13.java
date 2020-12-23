package _ch03;

public class Ex3_13 {
	public static void main(String[] args) {
		
		String str3 = new String("ABC");
		String str4 = new String("ABC");
		
		String str1 = "ABC";
		String str2 = "ABC";
		
		System.out.println(str1 == str2); // true
		System.out.println(str1.equals(str2)); // true
		
		System.out.println(str3 == str2); // false
		System.out.println(str3.equals(str2)); // true 
		
		
		System.out.println(str3 == str2);
		System.out.println(str3.equals(str2));
	}
}

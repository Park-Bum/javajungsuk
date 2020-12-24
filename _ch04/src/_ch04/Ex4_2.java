package _ch04;

public class Ex4_2 {
	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일때 , 참인 것은 %n", x);
		
		if(x==0) System.out.println("x==0"); // true
		if(x!=0) System.out.println("x!=0"); // false
		if(!(x==0)) System.out.println("!(x==0"); // false
		if(!(x!=0)) System.out.println("!(x!=0"); // true
		
		x = 1;
		System.out.printf("x=%d 일 때 , 참인것은 %n", x);
		if(x==0) System.out.println("x==0"); // false
		if(x!=0) System.out.println("x!=0"); // true
		if(!(x==0)) System.out.println("!(x==0)"); // true
		if(!(x!=0)) System.out.println("!(x!=0)"); // false 
	}
}

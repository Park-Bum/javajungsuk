package _ch04;

public class Ex4_2 {
	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d �϶� , ���� ���� %n", x);
		
		if(x==0) System.out.println("x==0"); // true
		if(x!=0) System.out.println("x!=0"); // false
		if(!(x==0)) System.out.println("!(x==0"); // false
		if(!(x!=0)) System.out.println("!(x!=0"); // true
		
		x = 1;
		System.out.printf("x=%d �� �� , ���ΰ��� %n", x);
		if(x==0) System.out.println("x==0"); // false
		if(x!=0) System.out.println("x!=0"); // true
		if(!(x==0)) System.out.println("!(x==0)"); // true
		if(!(x!=0)) System.out.println("!(x!=0)"); // false 
	}
}

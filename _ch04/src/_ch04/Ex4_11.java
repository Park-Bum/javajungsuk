package _ch04;

public class Ex4_11 {
	
	public static void main(String[] args) {
		/*for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i +"*"+j+"="+(i*j));
			}
			System.out.println();
		}*/
		// i=1,2,3,4,5 5�� {}���� ������ �ݺ�
		/*for(int i=1; i<=5;i++) {
			// System.out.println(**********);
			for (int j = 1; j <= 5; j++) { // ���� 10�� ����
			System.out.print("*");
		}
		System.out.println(""); // �ٹٲ� 
		}*/	
		/*for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*"); // i���� �ٲ�� �Ǹ鼭 j���� �޶������Ѵ�. i�� ���ڸ�ŭ ������ ��´�. 
			}
			System.out.println();
		}*/
		/*for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		/*for(int i = 0; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		/*for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 11; k >= i*2+1; k--) {
				System.out.print("*");
			}
			System.out.println("");
			}*/
		for(int i = 0; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 11; k >= i*2+1; k--) {
				System.out.print("*");
			}
			System.out.println("");
			}
		}
	}


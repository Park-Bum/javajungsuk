package _ch04;

public class Ex4_8 {
	public static void main(String[] args) {
		int i=1; // scope ������ �������� ����  ������ ���� �߸������� Ȯ���ϴ°� �����ϱ�
			   // ������ġ���� ����� ����� ������ 
		int j;
		/*for (int i = 1; i <= 10; i+=2) { // 1,3,5,7,9 Ȧ����
			System.out.println("Hello");
		}*/
		/*for(int i=1; i<=10; i*=2) { // 1,2,4,8
			System.out.println("Hello");
		}*/
		
		/*for(int i = 1; i <= 10; i++) { // 1���� 10���� 1�� ���� 
			System.out.println(i);
		}*/
		
		/*for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}*/
		
		/*for (i = 1 ,j = 10; i <= 10; i++ ,j--) {
			System.out.println("i = " + i + " j = " + j);		
		}*/
		
		for(;true;) { // ���ǽ��� �����ϸ� , true�� ���ֵǾ ���ѹݺ����� �ȴ�.
			System.out.println("i = " + i);
		}
//		System.out.println(i); i ������ �����. 
	}
}

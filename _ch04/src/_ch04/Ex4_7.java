package _ch04;

public class Ex4_7 {
	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
	/*	for(int i = 1; i <= 5; i++) {
			num = (int)(Math.random() * 10) + 1;
			// 0.0 <= random * 3 <= 2.99999(3.0�̾ȵ�) 3�� �������� ����
			// (int)0 <= ���� <= 2  �Ҽ�������
			// 0 ~ 2
			// 1���� 3���� �Ϸ��� ������ 1�� ���Ѵ�. 
			// 1 <= ���� <= 3
			System.out.println(num);
		}
		*/
		// Quiz2 -5 ~ 5 ���� ���ϱ�   , 0 �����ؼ� 11�� 
		for(int i = 1; i <= 5; i++) {
			num2 =(int)(Math.random() * 11) - 5;
			// 0.00 <= random * 11 <= 10.9999
			// (int) 0 <= random <= 10
			// -5 <= random <= 5
			System.out.println(num2);
		}
	}
}

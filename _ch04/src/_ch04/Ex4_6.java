package _ch04;

import java.util.Scanner;

// switch���� ���� ���� 
// ���ǽ� ����� ���� �Ǵ� ���ڿ� �̿��� �Ѵ�.
// case���� ���� ���� ��� ���ڿ��� �����ϸ� �ߺ����� �ʾƾ� �Ѵ�. 
// case���� ���� ���ڸ� �ü��ִµ� '1',ONE����ü��ִ�. ����x,�Ǽ�x 
public class Ex4_6 {
	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ��� > ");
		
		Scanner s = new Scanner(System.in);
		int month = s.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� month�� ���� 
		
		switch(month) { // ���ǽĿ��� ���ǶǴº������� �ü��ִ�. 
		case 3: case 4: case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 12: case 1: case 2:	
			System.out.println("������ ������ �ܿ��Դϴ�.");
			break;
		default :
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
	} // main�� ��
}

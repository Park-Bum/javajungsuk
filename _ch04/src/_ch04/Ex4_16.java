package _ch04;

public class Ex4_16 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// for(;true;) { 
		while(true) { // true ���ѹݺ� true �����Ұ�  , for���� for(;true;) true�������� 
			if(sum > 100) { // �ݺ����� ���߱����� ���� ������ 100���� ũ�� false �� while�� ����
				break; // �ڽ��� ���� (�ϳ���) �ݺ����� �����.
					 // break; �ϸ� �Ʒ� ������ ���� �ȵȴ�. 
			}
			++i;
			sum += i;
		}	
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}

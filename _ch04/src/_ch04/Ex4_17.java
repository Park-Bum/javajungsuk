package _ch04;

public class Ex4_17 {
	public static void main(String[] args) {
		for(int i=0; i <= 10; i++) {
			if(i%3==0)    // 3���� ������ �������� ��� �ǳʶڴ�. 
				continue; // �ڽ��� ���� �ݺ��� ������ �̵� 
						  // ���� �ݺ����� �Ѿ��. 
			System.out.println(i);
		} //�����ΰ���  ���� ���������� �̵��Ѵ�. 
	}
}

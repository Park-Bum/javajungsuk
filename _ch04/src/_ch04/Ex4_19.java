package _ch04;
/* �̸����� �ݺ���
  �ݺ����� �̸��� �ٿ��� �ϳ� �̻��� �ݺ����� ��� �� �ִ�.*/

public class Ex4_19 {
	public static void main(String[] args) {		
	Loop : for(int i = 2; i <= 9; i++) {
	// for���� Loop1�̶�� �̸��� �ٿ���.	
			for(int j = 1; j <= 9; j++) {
				if(j==5)
					break Loop; // �̸�  �� �̻��� �ݺ����� ����� ���ؼ� �ݺ����� �̸����ٿ��ش�.
/*					break;
 * 					continue Loop; �� �ִµ� ������ ���Ǿ���.
					continue;*/
					System.out.println(i+"*"+j+"="+i*j);
			} // end of for i 
		System.out.println();	
		} // end of Loop1
	}
}

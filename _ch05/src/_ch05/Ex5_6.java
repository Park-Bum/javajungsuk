package _ch05;

/*String[] name = new String[3]; // 3���� ���ڿ��� ���� �� �ִ� �迭 ����
String �������̹Ƿ� �⺻���� null �� �ʱ�ȭ �Ǿ� �ִ�.*/


public class Ex5_6 {
	public static void main(String[] args) {
		String[] names = {"kim","Park","Yi"};
		
		
		for(int i=0; i < names.length; i++) {
			System.out.println("names["+i+"]:"+names[i]);
			
		}
		
		String tmp = names[2];
		System.out.println("tmp : " + tmp);
		names[0] = "Yu";
		
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
	}
}

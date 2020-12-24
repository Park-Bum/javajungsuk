package _ch05;

/*String[] name = new String[3]; // 3개의 문자열을 담을 수 있는 배열 생성
String 참조형이므로 기본값인 null 로 초기화 되어 있다.*/


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

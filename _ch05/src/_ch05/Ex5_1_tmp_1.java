package _ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex5_1_tmp_1 {
	
	public static void main(String[] args) {
		// �迭�� �̿��� ���� ���� �� ���� ��ǻ�Ϳ����� ���
		
		String[] gbb = {"����","����","��"};
		
		int com = 0;
		int user = 0;
		String result = "";
		
		for(int i = 0; i < gbb.length; i++) {
			com = (int)(Math.random()*3);
			user = (int)(Math.random()*3);
			
			if(com == user) {
				result = "���";
			} else {
				if(com == 0) {
					if(user == 1) {
						result = "������";
					} else {
						result = "���ͽ�";
						}
					}else if(com == 1) {
						if(user == 2) {
							result ="������";
						} else {
							result ="���ͽ�";
						}
					} else if(com == 2) {
						if(user == 0) {
							result = "������";
						} else {
							result ="���ͽ�";
						}
					}
				}
			System.out.println("���  :" + gbb[user]);
			System.out.println("��ǻ�� :" + gbb[com]);
			System.out.println(result);
			
		}
	}
}
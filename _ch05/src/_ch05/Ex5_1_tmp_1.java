package _ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex5_1_tmp_1 {
	
	public static void main(String[] args) {
		// 배열을 이용한 가위 바위 보 게임 컴퓨터와유저 결과
		
		String[] gbb = {"가위","바위","보"};
		
		int com = 0;
		int user = 0;
		String result = "";
		
		for(int i = 0; i < gbb.length; i++) {
			com = (int)(Math.random()*3);
			user = (int)(Math.random()*3);
			
			if(com == user) {
				result = "비김";
			} else {
				if(com == 0) {
					if(user == 1) {
						result = "유저승";
					} else {
						result = "컴터승";
						}
					}else if(com == 1) {
						if(user == 2) {
							result ="유저승";
						} else {
							result ="컴터승";
						}
					} else if(com == 2) {
						if(user == 0) {
							result = "유저승";
						} else {
							result ="컴터승";
						}
					}
				}
			System.out.println("사람  :" + gbb[user]);
			System.out.println("컴퓨터 :" + gbb[com]);
			System.out.println(result);
			
		}
	}
}
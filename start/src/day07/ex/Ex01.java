package day07.ex;

import java.util.Arrays;

/*
 
 		ex01)
 			'A' ~ 'J' 까지의 문자를 랜덤하게 100개 만들고
 			각 문자의 출현 횟수를 기억할 배열을 만들어서
 			횟수만큼 '*'로 출력해주는 프로그램
  
 */
public class Ex01 {

	public static void main(String[] args) {
		// 랜덤 변수 생성 및 랜덤
		int low = (int)'A';
		int high = (int)'J';
		String munja = "";
		for(int i = 0; i<100; i++) {
			munja += (char)((int)(Math.random() * (high - low + 1) + low));		
		}
		
		// 반복횟수 저장 배열
		int[] appear = new int[10];
		
		// 문자열 개수만큼 반복
		for(int i = 0; i < munja.length(); i++) {
			for(int ch = 0; ch < 10; ch++) {
				int cha = ch + (int)'A';
				if(munja.charAt(i) == (char)cha) {
					appear[ch] += 1;
					continue;
				}
			}
		}
		System.out.println(munja);
		System.out.println(Arrays.toString(appear));
		
		
	}

}

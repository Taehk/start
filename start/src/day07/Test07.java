package day07;
/*
 	10개의 정수를 랜덤하게 발생시켜서 기억하는 배열을 만들고
 	기억된 수 중 가장 큰 수를 알아내는 프로그램을 작성하세요.
 */

import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		// 배열생성
		int[] num = new int[10];
		
		// 랜덤용 변수 생성
		int low, high;
		low = 1; high = 99;
		
		loop:
		for(int i = 0; i < num.length; i++) {
			int ran = (int)(Math.random() * (high - low + 1) + low);	// 랜덤값 생성
			
			for(int j = 0; j < i; j++) {		// 중복 시에 현재회차 새로
				if (num[j] == ran) {
					i--;
					continue loop;
				}				
			}
			num[i] = ran;
		}
		
		// 가장 큰 수 알아내기
		int big = 0;		// 큰 수 저장 변수
		for(int i = 0; i < num.length; i++) {
			if(big < num[i]) {	// 현재 가장 큰 수가 비교값보다 작으면 해당 값 저장
				big = num[i];
			}
		}
		System.out.println("현재 배열은 "+Arrays.toString(num)+"입니다.");
		System.out.printf("그 중 가장 큰 값은 %d입니다.", big);
		
		System.out.println();
		
		// 정렬하기
		for(int i = 0; i < num.length-1; i++) {
			for(int j = i+1; j< num.length; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;				
				}
			
			
			}
		}
		System.out.println("현재 배열은 "+Arrays.toString(num)+"입니다.");

		
		
	}
}

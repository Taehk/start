package day07;

import java.util.Arrays;

/*
 	1 ~ 10까지의 정수를 순서대로 배열에 기억시키고
 	이 숫자들을 랜덤하게 섞어서 출력되도록 하시오.
  
 */

public class Test06 {

	public static void main(String[] args) {
		//  배열 선언
		int[] num = new int[10];
		
		// 순서대로 기억
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		int low, high;
		low = 1; high = 10;
		
		for(int i = 0 ; i < 100; i++) {
			int idx1 = (int)(Math.random()* (high - low + 1) + low) -1;	
			int idx2 = (int)(Math.random()* (high - low + 1) + low) -1;	
			int temp = num[idx1];
			num[idx1] = num[idx2];
			num[idx2] = temp;
		}
		
		for( int no : num) {
			System.out.printf("%2d|", no);
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
		
	}

}

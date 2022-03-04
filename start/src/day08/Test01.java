package day08;

import java.util.Arrays;

/*
 	0 - 9 사이의 숫자를 100개 발생시켜서
 	각각의 숫자가 몇번씩 발생했는지를 알아보자.
 	
 */

public class Test01 {

	public static void main(String[] args) {
		int[] num = new int[100];
		int[] count = new int[10];
		
		int low, high;
		low = 0; high = 9;
		for(int i =0; i<100; i++) {
			num[i] = (int)(Math.random() * (high-low + 1)+ low);
			for(int j = 0; j<10; j++) {
				if(num[i] == j) {
					count[j]++;
					break;
				}
			}
		}
		System.out.print("생성된 랜덤값 : ");
		for(int no :num) {
			System.out.print(no);
		}
		System.out.println();
		System.out.println("누적 갯수 : "+Arrays.toString(count));
		
		int total = 0;
		for(int cnt :count) {
			total += cnt;
		}
		System.out.println(total);
		
	}

}

package day08;

import java.util.Arrays;

/*
 		정수 5개를 기억할 배열을 만들고
 		데이터를 채워둔 후
 		1~3번까지의 데이터만 다른 배열에 깊은 복사 해보자
 		
 		이때 복사될 배열의 길이는 10
 */

public class Test04 {

	public static void main(String[] args) {
		// 원본
		int[] ori = {10, 20, 30, 40, 50};
		
		// 복사본
		int[] copy = new int[10];

		// 깊은 복사를 한다
		System.arraycopy(ori, 0, copy, 0, 3);
		
		// 배열 내용 출력
		// 원본
		System.out.println("원본   : "+Arrays.toString(ori));
		System.out.println("복사본 : "+Arrays.toString(copy));
	}

}

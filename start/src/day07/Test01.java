package day07;

import java.util.Arrays;

/*
 * 배열 선언 연습
 * 	정수 6개를 관리할 배열을 만들고
 * 	1~6까지 채워서 1개씩 꺼내서 출력하세요 
 */

public class Test01 {

	public static void main(String[] args) {
		int[] num;
		// 배열변수 초기화
		num = new int[6];
		
		// 출력
		// 배열의 길이 : 배열.length
		int len = num.length;
		for(int no : num) {
			System.out.printf("%d\t",no);
		}
		System.out.println();
		
		// 배열에 기억된 데이터 꺼내는 방법 - 배열변수[위치값]
		for(int i = 0; i< len; i++) {
			int no1 = num[i];
			System.out.printf("%d\t", no1);
		}
		System.out.println();
		
		// 블랙핑크 멤버의 이름을 기억할 배열을 만들어서 출력하세요.
		// 블핑 4명; 제니 리사 로제 지수
		String[] blackPink = new String[4];
		
		for(int i = 0; i < blackPink.length ; i++) {
			System.out.println(blackPink[i]);
		}
		blackPink[0] = "제니";
		blackPink[1] = "리사";
		blackPink[2] = "로제";
		blackPink[3] = "지수";
		// 출력 - 내용확인
		System.out.println(Arrays.toString(blackPink));
		
		// 데이터를 하나씩 꺼내서 출력
		for(int i = 0; i < blackPink.length; i++) {
			System.out.print(blackPink[i]);
			// i번째 멤버의 이름을 꺼내서 변수에 기억
			String name = blackPink[i];
			// 변수에 기억된 데이터를 출력
			System.out.println(name);
		}
		// 둘리 멤버를 추가해서 출력하세요
		//	배열을 다시 만들고
		String[] bP = new String[5];
		for( int i = 0; i < 4; i++) {
			bP[i] = blackPink[i];
		}
		bP[4] = "둘리";
		blackPink = bP;
		
		// 하나씩 꺼너ㅐ서 출력
		// 배열과 같은 데이터는 향상된 for 명령이 데이터를 꺼내서 사용하는데 편하다.
		for(String bp : blackPink) {
				// 의미) blackpink의 데이터를 순차적으로 하나씩 꺼내서 name변수에 기억시키세요.
			System.out.printf("%s\t", bp);
		}
		
	
	}
	

}
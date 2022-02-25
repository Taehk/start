package day04;

import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		// 할일
		Scanner sc = new Scanner(System.in);	// 입력도구 준비
		System.out.print("정수 입력 : ");// 입력 메세지 출력
		int num = sc.nextInt();// 입력 받아서 변수에 기억
		String result =	(num % 2 == 1) ? (result = "홀수"): ((num == 0) ? (result ="Zero"):(result = "짝수"));// 짝수인지 홀수인지 판별
//			ㄴ 홀수인가?	ㄴ 맞으면 홀수		ㄴ 아닐때 0인가? ㄴ 맞으면 0  	ㄴ 홀수도 0도 아니면 짝수		
		System.out.println(result);// 출력
		sc.close();
		
	}
}

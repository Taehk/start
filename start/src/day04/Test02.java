package day04;

/*
 *  if(조건식){
 *  	//조건식 참인 경우 실행하는 부분
 *  }
 */

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		// 설계도
			// 입력도구 준비
		Scanner sc = new Scanner(System.in);
			// 입력받기 전 메세지 출력
		System.out.print("정수 입력 : ");
			// 입력받아서 정수에 저장
		int num = sc.nextInt();
			// 조건에 따라 판별
		String soo = "Zero";
		
			// 홀수인 경우
		if(num % 2 != 0) {
			soo = "홀수";			
		}
			// 짝수인 경우	(입력받은 수가 0이 아니고 짝수인 경우)
		if(num != 0 && num % 2 == 0) {
			soo = "짝수";			
		}
			// 내용 출력하기
		System.out.println(soo);
		sc.close();
		
		
		
	}
}

package day05.ex;
/*
 * 예제4
 * 		전기요금을 계산해주는 프로그램을 작성하시오
 * 		전기요금표
 * 
 * 					코드	기본요금	사용요금
 * 			가정용		1		3800		245
 * 			산업용		2		2400		157
 * 			교육용		3		2900		169
 * 			상업용		4		3200		174
 * 
 * 		전기요금은
 * 				기본요금 + 사용량 * 사용요금
 * 
 * 		사용자 코드와 사용량을 입력하면
 * 			전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
			// 전기요금표 배열 만들기
		int[][] elec =	{{1, 3800, 245},
						{2, 2400, 157},
						{3, 2900, 169},
						{4, 3200, 174}};
			
		// 사용자 코드와 사용량 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자 코드를 입력하세요 : ");
		int code = sc.nextInt();
		System.out.print("사용량을 입력하세요 : ");
		int usage = sc.nextInt();
		sc.close();

		
		// 전기요금 계산하기
		int fee = 0;
		for (int i = 0; i<4; i++) {
			if(code == elec[i][0]) {		// 사용자 코드가 맞을 때
				fee = elec[i][1]+elec[i][2]*usage;
				break;
			}
		}
		
		// 요금 출력
		System.out.printf("사용자의 전기요금은 %d입니다.", fee);
		
	}
	
}

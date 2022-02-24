package day03.ex;

/*
 *  P2)
 *  	하나의 숫자를 입력받은 후(원의 반지름)
 *  	그 숫자를 이용해서 원의 넓이와 둘레를 게산하고 출력하세요
 *  	
 *  	원의 넓이 : 반지름 ^ 2 * 3.14
 *  	원의 둘레 : 2 * 반지름 * 3.14
 */

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 반지름 입력받기	
		System.out.print("반지름 : ");
		double rad = sc.nextDouble();	// double 자료형으로 입력
		double pie = 3.14;	// 파이값 저장
		
		System.out.println("원의 넓이 : " + (rad * rad * pie));	// 넓이 출력
		System.out.println("원의 둘레 : " + (rad * 2 * pie));	// 반지름 출력
		
		sc.close();
		
	}
}
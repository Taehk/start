package day05.ex;
/*
 * 예제 6
 * 		랜덤하게 정수를 컴퓨터가 만들어내면
 * 		그 수를 알아맞추는 게임을 만드세요
 * 
 * 		ex) 
			발생숫자 : 54
			사용자 입력숫자 : 45
			==> "입력한 수가 더 작습니다."
			로 메세지를 출력해서 사용자가 숫자를 알아맞추는 겡밈
			
			횟수도 같이 출력되게 하세요.
 */

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// 랜덤값 최저최고값 저장
		int low, high;
		low = 1; high = 99;
		
		// 랜덤값 생성
		int answer = (int)(Math.random() * ((high - low + 1) + low));
		
		// 입력 도구 및 사용자 변수 준비
		Scanner sc = new Scanner(System.in);
		int user = 0;
		int count = 0;
		
		System.out.println("발생숫자 : " + answer);	// 확인용
		// 반복 및 판별
		for(int i = 0; ; i++) {
			// 답 입력
			System.out.print("사용자 입력 숫자 : ");
			user = sc.nextInt();
			
			// 판별
			if (answer == user) {	// 답이 맞으면 break
				count = i+1;
				break;
			} else if(answer > user) {	// 입력한 값이 낮을 때
				System.out.println("\t\t => 입력한 값이 정답보다 낮습니다.");
			} else {					// 높을 때
			System.out.println("\t\t => 입력한 값이 정답보다 높습니다.");
			}
		}
		System.out.printf("정답입니다. %d회만에 맞추셨습니다.", count);
		sc.close();
		
	}

}

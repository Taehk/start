package day05.ex;

/*
	문제 6 ]
		랜덤하게 정수를 컴퓨터가 만들어 내면
		그 수를 알아맞추는 게임을 만드세요.
		
		예 ]
			
			발생숫자 : 54
			
			사용자입력숫자 : 45
			
			==> "입력한 수가 더 작습니다."
			로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
			
		단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하고
		프로그램이 종료되게 하세요.
 */

import java.util.*;

public class Ex07_1 {

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
		boolean collect = false;
		for(int i = 0; i<5; i++) {
			// 답 입력
			System.out.print("사용자 입력 숫자 : ");
			user = sc.nextInt();
			
			// 판별
			if (answer == user) {	// 답이 맞으면 break
				count = i+1;
				collect = true;	// 정답처리
				break;
			} else if(answer > user) {	// 입력한 값이 낮을 때
				System.out.println("\t\t => 입력한 값이 정답보다 낮습니다.");
			} else {					// 높을 때
			System.out.println("\t\t => 입력한 값이 정답보다 높습니다.");
			}
		}
		if (collect == true) {	// 정답일때
			System.out.printf("정답입니다. %d회만에 맞추셨습니다.", count);
		}else {
			System.out.printf("오답입니다. 컴퓨터의 승리입니다.");			
		}
		
		sc.close();
		
	}

}

package day05.ex;
/*
 * 예제 5
 * 		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
 * 
 * 		컴퓨터는 랜덤하게 1~3사이의 숫자를 발생하여
 * 		가위, 바위, 보로 가정하고
 * 		사용자는 키보드를 이용해서 1~3 사이의 숫자를 입력하도록 한다.
 * 		그 후 승자 판별하는 프로그램 작성.
 */

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// 랜덤 최저/최고값 저장
		int low, high;
		low = 1; high = 3;
		
		String[] rcp = {"가위", "바위", "보"};
		
		// 컴퓨터 가위바위보 선택
		int computer = (int)(Math.random() * ((high + low - 1)+ low));

		// 사용자 가위바위보 선택
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보를 입력해주세요 (1~3) : ");
		int user = sc.nextInt();
		sc.close();
		
		
		// 가위바위보 판별		3(보) 1(가위)일때를 생각
		String result = "";
		if (computer == 3 & user == 1){	// c-보 u-가 일 때 1인 user가 이겨야함
			result = "user win";
		}else if(computer == 1 & user == 3) {	// c-가 u-보 일 때 1인 computer가 이겨야함
			result = "computer win";
		}else {		// 나머지의 경우 큰 수인 쪽이 승리
			if(computer > user) {	// computer가 클 경우
				result = "computer win";
			}else if (computer < user) {	// user가 큰 경우
				result = "user win";
			}else {		// 나머지 경우 = 비긴 경우
				result = "draw";
			}
		
		// 결과 출력
		System.out.println("Computer : "+rcp[computer-1]);
		System.out.println("User : "+rcp[user-1]);
		System.out.println("결과는 "+result);
		}
	/* 이 방법으로 해보기
	 *  		컴
	 *  		1	2	3
	 *  나	1
	 *  
	 * 		2
	 * 
	 * 		3
	 */		

	}

}

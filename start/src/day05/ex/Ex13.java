package day05.ex;
/*
문제 12 ]
	5자리 숫자 하나를 입력받아서 
	이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
	
	참고 ]
		회문수란?
			첫번째 자리수와 마지막 자리수
			두번째 자리수와 마지막에서 두번째 자리수
			...
			가 동일한 수를 말한다.
*/
import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		// 입력도구 및 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력해주세요 : ");
		String input = sc.nextLine();
		sc.close();
		
		// 변수 생성
		char ch1, ch2;			// 판별 문자 변수
		int check = 0;	// 회문수 맞는 부분당 +1	-> 3이면 회문수이다
		
		// 회문수 판별
		for (int i = 0; i < 3; i++) {
			ch1 = input.charAt(i);			// 숫자 첫 문자부터
			ch2 = input.charAt(input.length()-(i+1));	// 숫자 마지막 문자부터
			if(ch1 == ch2) {
				check += 1;
			}
		}
		if (check == 3) {
			System.out.println(input+"은 회문수입니다.");
		}else {
			System.out.println(input+"은 회문수가 아닙니다.");
		}
		
		
	}

}
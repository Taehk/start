package day05.ex;

/*
	문제 08_01 ]
		1바이트로 기억되는 2진수를 랜덤하게 만들어
		그숫자가 10진수로 몇인지출력하는 프로그램을 작성하세요.
		
		참고 ]
			문자열 2진수를 10진수 정수로 변환해주는 방법
				
				Integer.valueOf("문자열 2진수", 2);
				Integer.parseInt("문자열 2진수", 2);
		
		힌트 ]
			이진수 는 0과 1을 랜덤하게 발생시켜서 문자열에 덧붙여서 만든다.
 */

public class Ex08_1 {

	public static void main(String[] args) {
		// 랜덤생성용 변수
		int low, high;
		low = 0; high = 1;
		int ran;
		
		// 2진수 문자열 생성
		String binary = "";
		for (int i = 0; i<8; i++) {	// 1바이트 = 8비트 = 8번 반복
			ran = (int)(Math.random() * (high-low+1)+low);
			binary += ran;			
		}
		
		// 문자열2진수 -> 정수10진수
		int result = Integer.valueOf(binary, 2);
		System.out.printf("%s의 10진수 계산은 %d입니다.", binary, result);
	}

}

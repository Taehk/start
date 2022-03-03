package day05.ex;

/*
	 문제 03_01 ]
	 	
	 	0 ~ 255 사이의 정수를 10개를 랜덤하게 만들고
	 	그 정수를 아스키 코드값으로 하는 문자열을 만들어서
	 	만들어진 문자열의 문자를 하나씩 추출해서
	 	추출한 문자가 
	 		대문자인지 소문자인지 특수문자인지를
	 	출력하는 프로그램을 작성하세요.
	 	
	 	참고 ]
	 		문자열의 길이를 알아내는 방법
	 			
	 			int 변수 = 문자열.length();
 */

public class Ex03_1 {

	public static void main(String[] args) {
		// 랜덤값 생성
		int low, high;
		low = 0; high = 255;
		
		// 랜덤값으로 문자열 만들기
		int num;	// 랜덤값 변수
		String word = "";	// 문자열로 저장시킬 변수
		for (int i = 0; i< 10; i++) {
			num = (int)(Math.random() * (high-low+1)+low);
			word += (char)num;
			}
		System.out.println("만들어진 문자열 : " +word);
		
		// 문자열의 길이만큼 반복
		int len = word.length();
		int check; String result;
		for (int i = 0; i<len; i++) {
			check = word.charAt(i);
			
			if (check >= 62 & check <= 90) {	// 해당 문자가 대문자라면
				result = "대문자";
			}else if (check >= 97 & check <= 122) {	// 소문자라면
				result = "소문자";
			}else result = "특수문자";		// 나머지는 특수문자
			
			System.out.printf("%2c는 %4s입니다.\n", word.charAt(i), result);
		}
				
	}

}

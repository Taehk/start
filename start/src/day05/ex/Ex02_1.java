package day05.ex;

/*
 *	3~10 사이의 정수를 랜덤하게 발생시켜서
 *	그 정수를 길이로하는 영어 단어를 랜덤하게 생성하시오.
 *	단, 시작문자는 대문자로 나머지는 소문자로 하시오. 	
*/

public class Ex02_1 {

	public static void main(String[] args) {
		// 랜덤값 생성
		int low, high;
		low = 3; high = 10;
		int len = (int)(Math.random() * (high-low+1)+low);
		System.out.println("랜덤 문자의 길이는 "+len+"입니다.");
		
		// 해당 영어 단어의 길이만큼 랜덤영단어 생성
		int ch = 0; //랜덤 영단어 생성 변수
		low = 97; high = 122;
		for (int i = 0; i<len; i++) {
			ch = (int)(Math.random() * (high-low+1)+low);	// 랜덤 소문자 코드
			if (i == 0)		// 첫글자일 경우
			{
				ch -= 32;	// 대문자로 변환
			}
			System.out.print((char)ch);
		}
		
	}

}

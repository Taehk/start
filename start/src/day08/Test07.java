package day08;

import java.util.Arrays;

/*
 	"Black Pink"라는 문자열을 기억하는 변수 str을 만들고
 	그 중에서
 		1. Black만 추출해서 출력
 		2. Pink만 추출해서 출력
 */
public class Test07 {

	public static void main(String[] args) {
		// 문자열 변수
		String str = "Black Pink";
		
		// 잘라낸 단어 변수
		String word1, word2;
		
/*		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				String word1 = str.substring(0, i-1);
				String word2 = str.substring(i+1);
				break;
			}
		}*/
		
		// ' '의 위치		
		int idx = str.indexOf(' ');	// 문자열 중 특정문자의 위치값 알려주는 함수
		// 문자 추출
		word1 = str.substring(0, idx);
		word2 = str.substring(idx+1);
		
		// 출력
		System.out.println(word1);
		System.out.println(word2);
	}

}

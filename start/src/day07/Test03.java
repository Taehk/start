package day07;


/*
 	10개의 문자를 기억할 배열을 만들고
 	'A' - 'J' 까지 차례로 입력하고 출력하세요.
 */
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		char[] str = new char[10];
		for(int i = 0; i < str.length; i++) {
			str[i] = (char)('A'+i);
		}
		System.out.println(Arrays.toString(str));
		
		for(char alpa: str) {
			System.out.printf("%c\t", alpa);
		}
	}

}

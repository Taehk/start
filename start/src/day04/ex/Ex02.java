package day04.ex;
/*
 * 문제2)
 * 		알파벳 문자를 임의로 랜덤하게 입력한 후
 * 		그 문자가 대문자이면 소문자로 아니면 역으로
 * 		특수문자이면 그 문자 그대로 출력하는 프로그램을 작성하세요.
 * 
 */
import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
/*		char c1, c2, c3;
		c1 = 'a'; c2 = 'A'; c3 = 'z';		// A는 65, a는 97 -> 대/소문자 코드의 차이는 32이다.
		System.out.println((int)c1);		// a는 97, z는 122 -> 알파벳은 25개이다.
		System.out.println((int)c2);
		System.out.println((int)c3);			*/
//		-> 대문자는 65 ~ 90, 소문자는 97 ~ 122의 범위임을 알 수 있다.		
		
		// 입력 도구 및 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		int cha = sc.next().charAt(0);
		
		// 판별
		cha = (cha >= 65) ? ((cha <= 87)?(cha += 32):((cha < 97)?(cha):((cha<=122)? (cha-32):(cha)) ) ):((cha));
//			65보다 크거나 같지 않다면 특수문자이다 + 87보다 작거나 같다면 대문자이므로 소문자 변환(+32)
//															ㄴ 87보다 크다면 소문자나 특수문자
		//														ㄴ 97보다 작다면 특수문자
		//															ㄴ 122보다 작으면 소문자(-32) 아니면 특문
		sc.close();
		
		// 출력
		System.out.println((char)cha);
		
	}
}

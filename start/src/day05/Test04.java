package day05;

/*
 * 나이를 입력받아서
 * 		유년기~40~장년층 으로 구분해서 출력하세요.
 * 		Switch문
 */
import java.util.*;

public class Test04 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력
		System.out.print("나이를 입력하세요 : ");
		
		// 입력받아 변수에 기억
		int age = sc.nextInt();
		String result = "";
		
		// 판별해서 결과 기억하고	10의 자리가 해당 나이대면 된다. (ex - 10대는 1, 20대는 2..)
		switch (age / 10) {
			case 0:
				result = "유아기";
				break;
			case 1:
				result = "10대";
				break;
			case 2:
				result = "20대";
				break;
			case 3:
				result = "30대";
				break;
			case 4:
				result = "40대";
				break;
			default:
				result = "장년층";		
		}
		
		// 결과 출력
		System.out.println("입력받은 나이는 "+result+"입니다.");
		
		sc.close();
	}
	
}

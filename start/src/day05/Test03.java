package day05;

/*
 * 나이를 입력받아서
 * 		유년기~40~장년층 으로 구분해서 출력하세요.
 */
import java.util.*;

public class Test03 {
	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 메세지 출력
		System.out.print("나이를 입력하세요 : ");
		
		// 입력받아 변수에 기억
		int age = sc.nextInt();
		String result = "";
		
		// 판별해서 결과 기억하고
		if (age < 10) {
			result = "유년기";
		} else if(age<20) {
			result = "10대";
		} else if(age<30) {
			result = "20대";
		} else if(age<40) {
			result = "30대";
		} else if(age<50) {
			result = "40대";
		} else {
			result = "장년층";
		}
		
		// 결과 출력
		System.out.println("입력받은 나이는 "+result+"입니다.");
		
		sc.close();
	}
	
}

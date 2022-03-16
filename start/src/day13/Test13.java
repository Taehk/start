package day13;
/*
 	강제 예외 던지기
 		자바는 예외로 인정하지 않지만 프로그램 목적상 예외로 처리해야하는 경우
 */
import java.util.*;

public class Test13 {
	/*
	 	사용자가 나이를 입력하면 입력된 나이를 출력하는 프로그램
	 	음수 입력시 예외처리
	 */
	
	public Test13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("# 나이 입력");
		int age = 0;
		
		while(true) {
			try {
				age = sc.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("- 잘못된 입력입니다.");
			}
		}
		
		if(age < 0) { 
			// 이 경우 나이가 음수로 입력된 경우
			// 강제예외발생 = 예외던지기 사용
			try{
				throw new Exception();	// 예외던지기 = 예외 무조건 발생
			} catch(Exception e) {
				System.out.println("나이를 음수로 입력하였습니다.");
			}
		}
	}

	public static void main(String[] args) {
		new Test13();
	}

}

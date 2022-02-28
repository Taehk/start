package day05.ex;
/*
 * 예제 7
 * 		숫자형식의 다섯자리 정수를 입력받아서
 * 		각자리 수의 합을 구하는 프로그램을 작성하세요.
 * 		문자열로 입력받아서 문자로 변환 후 처리하세요.
 */

import java.util.*;

public class Ex09 {

	public static void main(String[] args) {
		// 입력 도구 및 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 형식의 다섯자리 정수를 입력하세요 : ");
			int no = sc.nextInt();;
			sc.close();
			
		// 각 자리수만큼 반복
			int result = 0;
			int zari = 0;
			
			for (int i = 5; i >0; i--) {
				int ten = 1;
				
				for ( int j = 0; j < i-1; j++) {
					ten *= 10;
				}
				
				zari = (no/ten);
				no -= zari*ten;
				result += zari;
				System.out.print(ten+"\t");		
				System.out.print(zari+"\t");		
				System.out.print(no+"\t");		
				System.out.println(result);				
				
				
			}
			System.out.println("각 자리의 합은 : " + result+"입니다.");
	}

}

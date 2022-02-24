package day03.ex;
/*
 *  P1)
 *  	두 개의 숫자를 입력받은 후(가로, 세로)
 *  	그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를 구해서 결과를 출력하세요
 *  
 *  	출력 형식)
 *  				가로 : XXXX
 *  				세로 : XXXX
 *  				사각형 넓이 : XXXX
 *  				삼각형 넓이 : XXXX.X
 *  
 */

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		// 입력도구 준비하고
			Scanner sc = new Scanner(System.in);
		//			<---변수로 저장		ㄴ 입력받은 데이터
		// 입력 메세지 출력
			System.out.print("가로 : ");
			int width = sc.nextInt();
			System.out.print("세로 : ");
			int height = sc.nextInt();
			System.out.println("사각형 넓이 : " + width * height);
			System.out.println("삼각형 넓이 : " + (double)(width * height) / 2);
			
			
		//   => 문자열로 입력받아서 처리하는 방법
		
		//  정수형으로 입력받아서 처리하는 방법
		//		ㄴ int width = sc.nextInt();
			
			sc.close();
	}

}

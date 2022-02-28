package day05;

/*
 *  정수를 입력받아서
 *  그 숫자가 짝수인지 홀수인지를 판별해서 출력하세요.
 *   * 0인 경우는 0으로 출력
 */

import java.util.*;


public class Test02 {

	
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new  Scanner(System.in);
		// 입력메세지 출력
		System.out.print("정수 입력 : ");
		// 입력받아서 변수에 기억시키고
		int no = sc.nextInt();
		// 판별하고
		String result = "";	// 짝수인지 홀수인지 기억할 변수
		
		if(no==0) {
			result = "0";
		}
		else if(no % 2 == 0) {
			result = "짝수";
		}
		else {
			result = "홀수";
			}
		/*
		 * if(no != 0 && no % 2 == 0){
		 * 	result = "짝수";
		 *  }
		 *  
		 * if(no != 0 && no % 2 == 1){
		 * 	result = "홀수";
		 *  }
		 *  
		 * if(no != 0){
		 *	// no가 0이 아닌 경우
		 * 		if(no % 2 == 0){
		 * 			result = "짝수";
		 *  	}
		 * 		if(no % 2 == 1){
		 * 			result = "홀수";
		 *  	}
		 *  } else{	
		 *  	// no가 0인 경우
		 *  	result = "0";
		 *  }
		 */
		
		// 결과 출력하기
		System.out.println("입력한 정수 "+ no + "는 "+ result + "입니다.");
		sc.close();
	}

}

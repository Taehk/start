package day05;

/*
 * 	1~6까지를 기억하는 배열의 데이터를
 * 	꺼내서 출력하시오
 */
public class Test07 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 7, 5, 6};
		String[] ch = {"asd", "sdf", "dfg"};
		//	1~6까지 하나로 관리하는 정수 배열
		
		int len = num.length;
		
		// 배열만큼 반복문 사용
		for(int i = 0; i < len; i++) {
			System.out.println((i+1) + "번째 데이터 : "+ num[i]);
		}
		
		// 향상된 for문
		for(int num1: num) {
			System.out.println("###"+num1);
		}
		for(String ch1: ch) {
			System.out.println("###"+ch1);
		}
	}

}

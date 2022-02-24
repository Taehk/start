package day03;

/*
 * 문자열 데이터의 비교는 equals()를 사용해서 비교해야한다.
 * 	형식)
 * 			문자열.equals(비교할 문자열)
 */

public class Test05 {
	public static void main(String[] args) {
		String str1 = "우앵";
		String str2 = new String("우앵");
		
		//	변수가 기억하는 주소를 비교한다.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("비교연산자로 비교했을 때 = " + (str1 == str2));
		System.out.println(".equals()로 비교했을 때 = " + str1.equals(str2));
		
	}
}

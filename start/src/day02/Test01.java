package day02;

/** 
 * 이 클래스는 주석의 형식을 보여주기 위한 클래스
 *	@author 김태현
 *	@since 2022.02.23
 *	@version v.1.0
 *
 */

public class Test01 {
	// 진입점 함수
	public static void main (String[] args) {
		// 여기는 한 줄 주석
		System.out.println("한 줄 주석 작성 끝...");
		
		// 다시 한 줄 주석 System.out.println("다시 한 줄 주석");
		
		/*
		 * 여러 줄 주석
		 * 이 안에서 작성한 내용은 모두 주석처리가 된다. 
		 */
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		System.out.println("name1: " + name1);
		System.out.println("name2: " + name2);
		System.out.println("name1 == name2 : " + (name1 == name2));
		
	}
}

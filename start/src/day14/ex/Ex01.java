package day14.ex;

/*
 	원의 정보를 기억할 클래스 제작
 	가지는 정보 : rad, round, area
 	기능 : 변수에 접근할 수 있는 함수들
 			반지름이 같으면 같은 원으로 처리해주는 기능으로 오버라이드한 equals()함수
 			해당 원의 정보를 출력해주는 함수도 추가
 */

public class Ex01 {

	public Ex01() {
		Circle won1 = new Circle(5);
		Circle won2 = new Circle(5);
		
		boolean result = won1.equals(won2);
		
		System.out.println("won1 = "+won1);
		System.out.println("won2 = "+won2);
		System.out.println("won1과 won2는 "+((result)?"동일하다":"다르다"));
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

package day14.ex;
/*
 		사각형 정보 기억하는 클래스 Nemo
 		변수 함수 생성자 필요한 만큼 추가
 		가로와 세로가 동시에 같은 사각형만 같은 사격형을 ㅗ처리
 		equals, toString사용
 */
public class Ex02 {

	public Ex02() {
		Nemo square1 = new Nemo(5, 10);
		Nemo square2 = new Nemo(3, 8);
		
		boolean result = square1.equals(square2);
		
		System.out.println("Square1은 "+square1);
		System.out.println("Square2은 "+square2);
		System.out.println("따라서 위 도형은 "+(result?"같다":"다르다"));
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

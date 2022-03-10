package day11;

public class Test02 {
	public Test02() {
		// 원 객체 만들기
		Won c1 = new Won((int)(Math.random()*21+5));
		
		// c1 계산
		int rad = c1.getRad();
		double arround = rad * 2 * Won.PI;
		double area = rad * rad * Won.PI;
		
		// 입력
		c1.setArround(arround);
		c1.setArea(area);
		
		// 출력
		System.out.printf("반지름이 %3d이고 둘레가 %5.2f이고 넓이가 %5.2f인 동그라미", rad, arround, area);
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}

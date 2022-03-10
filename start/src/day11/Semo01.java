package day11;

public class Semo01 extends Moyang {
	private int width, height;
	private double area;
	
	public Semo01() {
		
	}
	
	public Semo01(int width, int height) {
		this.width = width;
		this.height = height;	
		setArea();
		
	}
	
	/*
	 	 Override 규칙
	 	 	0. 상속해준 클래스에 고쳐쓸 함수가 존재.
	 	 	1. 함수의 원형(반환값타입 함수이름 매개변수리스트)가 일치해야한다.
	 	 	2. 접근지정자는 같거나 넓은 방향으로
	 	 	3. 예외처리는 같거나 좁은 방향으로
	 */
	public void toPrint() {
		System.out.printf("밑변 : %3d | 높이 : %3d | 넓이 : %6.2f -> 삼각형\n", width, height, area);
	}
	

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {		// 오버로딩
		area = width * height / 2.;
	}
	
}

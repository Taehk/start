package day14.ex;

public class Circle {

	// 변수
	private int rad;
	private double area, around;
	
	// 생성자
	public Circle() {
	}
	public Circle(int rad) {
		this.rad = rad;
		setArea();
		setAround();
		
	}
	
	// 둘레, 면적 계산
	public void setArea() {
		area = rad * rad * Math.PI;
	}
	public void setAround() {
		around = rad * 2 * Math.PI;
	}
	
	// area가 같을 경우 true를 반환해주는 equals의 오버라이드
	@Override
	public boolean equals(Object o) {
		// 반환값 변수
		boolean bool = false;
		
		Circle won = null;
		
		// Circle타입이 아닌 다른 타입 입력시 예외처리
		try {
			won = (Circle)o;
		}catch(Exception e) {
			return false;
		}
		if(this.area == won.getArea()) {
			bool = true;
		}
		
		return bool;
	}
	
	// 위 객체의 변수 등을 표시해주는 toString()의 오버라이드
	@Override
	public String toString() {
		return "원 - 반지름 : "+rad+"\t둘레 : "+around+"\t면적 : "+area;
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getAround() {
		return around;
	}
	public void setAround(double around) {
		this.around = around;
	}
	

}

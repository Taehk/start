package day11;

public class Circle01 extends Moyang {
	private int rad;
	private double arround, area;
	
	public Circle01() {}
	public Circle01(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	@Override
	public void toPrint() {
		System.out.printf("반지름 : %2d | 둘레 : %6.2f | 넓이 : %6.2f -> 원\n", rad, arround, area);		

	}
	
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}	

	// 오버로딩
	public void setArea() {
		area = rad * rad * 3.14;
	}
	public void setArround() {
		arround = rad * 2 * 3.14;
	}
	
	
}

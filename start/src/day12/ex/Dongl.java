package day12.ex;


public class Dongl implements Fig {
	// private 변수
	private int rad;
	private double arround, area;
	
	// 생성자
	public Dongl() {}
	public Dongl(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	@Override
	public int ranInt() {
		return (int)(Math.random() * 21 + 5);
	}
	
	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("도형 :   원   | 밑변 : %2d | 둘레 : %5.2f\t| 넓이 : %5.2f\n", rad, arround, area);
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
	// 오버로딩
	public void setArround() {
		arround = rad * 2 * Math.PI;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	

}

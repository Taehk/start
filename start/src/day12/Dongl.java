package day12;

public class Dongl extends Figure {

	// 변수생성
	private int rad;
	private double area, arround;
	
	public Dongl() {}
	public Dongl(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
	}

	public void setArround() {
		arround = rad * 2 * Math.PI;
	}
	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d이고 면적이 %6.2f이고 둘레가 %6.2f 입니다.\n", rad, area, arround);

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
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}

}

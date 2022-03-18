package day15;

public class Circle {
	private int rad;
	private double arround, area;
	
	public Circle() {
	}
	public Circle(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}

	@Override
	public String toString() {
		return "반지름이 " + rad + "이고\n둘레가 "+arround+", \n면적이 "+area;
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
	
	public void setArround() {
		arround = rad * 2 * 3.14;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = rad * rad * 3.14;
	}
	
	

}

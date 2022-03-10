package day11;

public class Nemo01 extends Moyang {
	private int height, width;
	private double area;
	
	// 생성자
	public Nemo01() {
		
	}
	
	public Nemo01(int height, int width) {
		this.height = height;
		this.width = width;
		setArea();
	}
	@Override
	public void toPrint() {
		System.out.printf("가로 : %3d | 세로 : %3d | 넓이 : %6.2f -> 사각형\n", width, height, area);		
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
		
	}
	public void setArea() {	// 오버로딩
		area = width * height;
		
	}
}

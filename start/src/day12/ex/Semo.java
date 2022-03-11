package day12.ex;

public class Semo implements Fig {
	// private 변수
	private int width, height;
	private double area;
	
	// 생성자
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public int ranInt() {
		return (int)(Math.random() * 21 + 5);
	}
	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.printf("도형 : 삼각형 | 밑변 : %2d | 높이 : %2d\t\t| 넓이 : %5.2f\n", width, height, area);
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
	
}

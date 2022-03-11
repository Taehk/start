package day12;

public class Nemo extends Figure {
	// 변수 추가
	private int width, height;
	private double area;
	
	// 생성자
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public void setArea() {
		// 사각형 면적 세팅하는 기능
		area = width * height;
		
	}

	@Override
	public void toPrint() {
		// 사각형 내용 출력하는 기능
		System.out.printf("이 사각형은 가로가 %3d이고 세로가 %3d이고 면적이 %6.2f 입니다.\n", width, height, area);
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

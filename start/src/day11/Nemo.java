package day11;

public class Nemo {
	private int width;
	private int height;
	private int area;
	
	// 기본생성자
	public Nemo() {
		
	}
	
	// 입력받는 데이터를 셋팅해서 객체로 만들 수 있는 생성자 = 오버로딩
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public int getArea() {
		return area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {
		area = width * height;
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

}


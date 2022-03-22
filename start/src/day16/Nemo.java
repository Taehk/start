package day16;

public class Nemo {
	private int width, height;
	private double area;
	
	public Nemo() {		
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
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
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {
		area = width * height;
	}
	// 가로가 같으면 같은 네모로 처리되도록하는 equals() 오버라이드
	@Override
	public boolean equals(Object obj) {
		boolean bool = false;
		Nemo nemo = (Nemo) obj;
		
		bool = width == nemo.getWidth();
		
		return bool;
	}
	@Override
	public int hashCode() {
		return 1;		// 이 클래스 객체는 이제부터 모두 해쉬코드 값을 1로 갖는다
	}
	
	@Override
	public String toString() {
		return String.format("이 사각형은 가로: %3d 세로: %3d 면적: %6.2f 입니다.", width, height, area);
	}
	
}

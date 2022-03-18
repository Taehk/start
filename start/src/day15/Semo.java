package day15;

public class Semo implements Comparable{
	private int width, height;
	private double area;
	
	public Semo() {
	}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		// 나와 다른 Semo를 비교하는 것
		// o를 Semo로 강제 형변환
		Semo s = (Semo) o;
		
		// 높이 기준으로 내림차순 정렬할 예정
		// 내 높이 - 비교 높이
		int result = this.height - s.getHeight();
		
		
		return -result;	// 내림차순이니까 부호 반전
	}
	
	@Override
	public String toString() {
		return "삼각형\n"+
				"\t높이"+height+"\n"+
				"\t너비"+width+"\n"+
				"\t면적"+area;
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
	public void setArea() {
		area = width * height * 0.5;
	}
	
}

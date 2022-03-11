package day12.ex;


public class Nemo implements Fig {
	// private 변수
	private int width, height, area;
	
	// 생성자
	public Nemo() {}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	
	@Override
	public void setArea() {
		area = width * height;
	}

	@Override
	public void toPrint() {
		System.out.printf("도형 : 사각형 | 밑변 : %2d | 높이 : %2d\t\t| 넓이 : %5d\n", width, height, area);
	}
	@Override
	public int ranInt() {
		return (int)(Math.random() * 21 + 5);
	}
}

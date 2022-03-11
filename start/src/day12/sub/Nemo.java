package day12.sub;

public class Nemo implements Figure {
	private int garo, sero, area;
	
	// 생성자
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = garo * sero;
	}

	@Override
	public void toPrint() {
		System.out.printf("이 사각형은 가로가 %3d이고 세로가 %3d이고 면적이 %3d 입니다.\n", garo, sero, area);

	}

}

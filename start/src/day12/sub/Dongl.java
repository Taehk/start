package day12.sub;

public class Dongl implements Figure {
	private int rad;
	private double arround, area;
	
	public Dongl() {}
	public Dongl(int rad) {
		this.rad = rad;
		setArea();
		
	}
	@Override
	public void setArea() {
		arround = rad * 2 * Math.PI;
		area = rad * rad * Math.PI;
		
	}

	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d이고 둘레가 %6.2f이고 면적이 %6.2f 입니다.\n", rad, area, arround);

	}

}

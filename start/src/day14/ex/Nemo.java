package day14.ex;

public class Nemo {
	// 변수 생성
	private int sero, garo;
	private int area;
	
	// 기본 생성자 생성
	public Nemo() {
	}
	public Nemo(int sero, int garo){
		this.sero = sero;
		this.garo = garo;
		setArea();
	}
	
	// 면적 계산함수
	public void setArea() {
		area = sero * garo;
	}
	
	// equals함수 오버라이드
	@Override
	public boolean equals(Object o) {
		// 반환갑 변수
		boolean bool = false;
		
		Nemo square = null;
		
		// Nemo외의 타입 입력시 오류처리
		try {
			square = (Nemo)o;
		}catch(Exception e) {
			System.out.println("입력한 타입이 Nemo타입이 아닙니다.");
			return bool;
		}
		
		// 가로와 세로 같은지 판별하는 변수
		boolean width = this.garo == square.getGaro();
		boolean height = this.sero == square.getSero();
		
		// 가로도 같고 세로도 같을 때 참이다
		if ((width & height) == true) {
			bool = true;
		}
		return bool;
	}
	
	@Override
	public String toString() {
		return "현재 도형은 사각형입니다. 세로 : "+sero+"\t가로 : "+garo+"\t면적 : "+area;
	}
	
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	

}

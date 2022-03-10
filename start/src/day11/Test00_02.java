package day11;

public class Test00_02 {
	Nemo[] sagak;
	
	public Test00_02() {
		// sagak 변수에 네모 배열 만들어서 네모객체가 채워지도록 해준다
		setSagak();
		toPrint();
	}
	
	public void setSagak() {
		// 배열 만들고
		sagak = new Nemo[5];	// -> 네모객체를 채울 수 있는 공간만 확보한 상태
		// 배열에 네모객체 채워주는 작업
		for(int i = 0; i < sagak.length; i++) {
			sagak[i] = new Nemo((int)(Math.random() * 21 + 5),(int)(Math.random() * 21 + 5));
		}
	}
	
	public void toPrint() {

		for(int i = 0; i < sagak.length; i++) {
			System.out.printf("사각형 %d는 가로가 %3d이고 세로가 %3d이고 넓이는 %4d입니다.\n",
				i+1, sagak[i].getWidth(),sagak[i].getHeight(), sagak[i].getArea());
		}
	}
	
	public static void main(String[] args) {
		new Test00_02();
	}

}

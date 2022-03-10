package day11;

public class Test00_01 {
	
	public Test00_01() {
		Nemo[] sagak = new Nemo[5];
		// 만들어진 함수에 사각형 채워주는 함수 호출
		setArr(sagak);
		// 출력
		toPrint(sagak);
	}
	
	// 만들어진 배열에 사격형 채워주는 함수
	public void setArr(Nemo[] sagak) {
		// 할일
			// 건네받은 배열의 길이만큼 네모객체 채워주고
		for(int i = 0; i < sagak.length; i++) {
			sagak[i] = new Nemo((int)(Math.random() * 21 + 5),(int)(Math.random() * 21 + 5));
		}
	}
	
	public void toPrint(Nemo[] sagak) {
		for(int i = 0; i < sagak.length; i++) {
			System.out.printf("사각형 %d는 가로가 %3d이고 세로가 %3d이고 넓이는 %4d입니다.\n",
				i+1, sagak[i].getWidth(),sagak[i].getHeight(), sagak[i].getArea());
		}
	}
	
	public static void main(String[] args) {
		new Test00_01();
	}

}

package day11;

/*
 		사각형의 정보를 기억할 클래스 Nemo 정의
 		필요한 데이터 입력해서 가로, 세로가 객체가 되는 순간 입력이 되도록 -> 객체 생성 시 입력 = Nemo클래스에서 생성
 		그 클래스 객체 5개를 관리할 배열
 		배열출력
 */

public abstract class Test00 {
	
	public Test00() {
		Nemo[] sqrArr = new Nemo[5];
		for(int i = 0; i < sqrArr.length; i++) {
			Nemo square = new Nemo((int)(Math.random() * 21 + 5),(int)(Math.random() * 21 + 5));
			sqrArr[i] = square;
			
			System.out.printf("사각형 %d는 가로가 %3d이고 세로가 %3d이고 넓이는 %4d입니다.\n",
					i+1, sqrArr[i].getWidth(),sqrArr[i].getHeight(), sqrArr[i].getArea());
		}	
		
	}
	
	public static void main(String[] args) {
	}
	
	
}

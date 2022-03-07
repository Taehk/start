package day09.ex;
/*
 		Ex03
 			사격형 변 하나를 랜덤하게 입력한 후
 			사격형 넓이
 			사격형 둘레
 			를 계산해서 출려겨하는 프로글매
 			
 			반지름 랜덤 함수
 			넓이 	둘레 
 			출력 함수
 * 
 */
public class Ex03 {
	
	public Ex03() {
		toPrint();
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
	// 랜덤
	public int side() {
		int side = (int)(Math.random() * (10)+1);
		return side;
	}
	
	// 넓이
	public int area(int side) {
		int area = side * side;
		return area;
	}
	
	// 둘레
	public int round(int side) {
		int round = side * 4;
		return round;
	}
	
	// 출력
	public void toPrint() {
		int side = side();
		System.out.println("사각형   변 : "+side);
		System.out.println("사각형 넓이 : "+area(side));
		System.out.println("사각형 둘레 : "+round(side));
	}

}

package day09.ex;
/*
 		Ex02
 			반지름 하나를 랜덤하게 입력한 후
 			원 넓이
 			원 둘레
 			를 계산해서 출려겨하는 프로글매
 			
 			반지름 랜덤 함수
 			넓이 	둘레 
 			출력 함수
 * 
 */
public class Ex02 {
	double pie = 3.14; 	// 원주율 전역변수로 저장
	
	public Ex02() {
		toPrint();
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
	
	// 랜덤
	public int radius() {
		int rad = (int)(Math.random() * (10)+1);
		return rad;
	}
	
	// 넓이
	public double area(int rad) {
		double area = rad * rad * pie;
		return area;
	}
	
	// 둘레
	public double round(int rad) {
		double round = rad * 2 * pie;
		return round;
	}
	
	// 출력
	public void toPrint() {
		int rad = radius();
		System.out.println("원의 반지름 : "+rad);
		System.out.println("원의   넓이 : "+area(rad));
		System.out.println("원의   둘레 : "+round(rad));
	}

}

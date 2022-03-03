package day07.ex;

/*
	반지름 5개를 기억하는 배열을 만들고
	랜덤하게 반지름을 만들어서 기억시키고
	각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
	넓이도 배열에 기억시켜주세요.
 */


public class Ex03 {

	public static void main(String[] args) {
		// 반지름 배열 생성
		double[] radius = new double[5];
		double[] area = new double[5];
		
		// 랜덤 변수 저장 및 랜덤 생성
		int low, high;
		low = 1; high = 10;
		
		for(int i = 0; i < radius.length; i++) {
			radius[i] = (double)((int)(Math.random() * (high - low + 1) + low));
		}
		
		// 원넓이 저장
		double pie = 3.14;
		for(int i = 0; i < area.length; i++) {
			area[i]  = radius[i] * radius[i] * pie;
		}
		// 출력
		System.out.println("원의 반지름 길이");
		for(double rad : radius) {
			System.out.printf("%.2f ", rad);
		}
		System.out.println();
		
		
		System.out.println("원의 넓이");
		for(double ar : area) {
			System.out.printf("%.2f ", ar);
		}
		
	}

}

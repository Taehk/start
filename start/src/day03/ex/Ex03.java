package day03.ex;
/*
 *  84232원을 지불하려고 한다.
 * 	우리나라 화폐단위로 이 금액을 지불하려면
 * 	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
 * 	
 * 	5만원, 만원, 5천원, 천원, 오백원, 백원, 십원 ,1원
 */

public class Ex03 {
	public static void main(String[] args) {
		int current = 84232;	 // 현재 돈
		
		int cal = current / 50000;	// 화폐 계산
		current = current % 50000;		// 5만원 빼고 남은 돈
		System.out.printf("%8s%2d%c\n","5만원권 : ", cal, '장');	// 5만원권 출력

		cal = current / 10000;	// 1만원권 갯수
		current = current % 10000;		// 1만원 빼고 남은 돈
		System.out.printf("%8s%2d%c\n","1만원권 : ", cal, '장');	// 1만원권 출력
		
		cal = current / 5000;	// 5천원권 갯수
		current = current % 5000;		// 5천원 빼고 남은 돈
		System.out.printf("%8s%2d%c\n","5천원권 : ", cal, '장');	// 5천원권 출력
		
		cal = current / 1000;	// 1천원권 갯수
		current = current % 1000;		// 1천원 빼고 남은 돈
		System.out.printf("%8s%2d%c\n","1천원권 : ", cal, '장');	//	1천원권 출력

		cal = current / 500;	// 500원 갯수
		current = current % 500;		// 500원 빼고 남은 돈
		System.out.printf("%10s%2d%c\n","500원 : ", cal, '개');	// 5백원갯수 출력

		cal = current / 100;	// 100원 갯수
		current = current % 100;		// 100원 빼고 남은 돈
		System.out.printf("%10s%2d%c\n","100원 : ", cal, '개');	// 1백원갯수 출력
		
		cal = current / 50;	// 50원 갯수
		current = current % 50;		// 50원 빼고 남은 돈
		System.out.printf("%10s%2d%c\n","50원 : ", cal, '개');	// 50원 갯수 출력
		
		cal = current / 10;	// 10원 갯수
		current = current % 10;		// 10원 빼고 남은 돈 = 1원 갯수
		System.out.printf("%10s%2d%c\n","10원 : ", cal, '개');	// 10원 갯수 출력
		System.out.printf("%10s%2d%c\n","1원 : ", cal, '개');		// 1원 갯수 출력
		
	}
}

package day05.ex;
/*
 * 예제 9
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */


public class Ex10 {

	public static void main(String[] args) {
		int total = 0;
		int i = 0;
		while(total <= 100) {
			i += 1;
			if (i%2==1) {	// 홀수일 때
				total += i;
			}else {			// 짝수일 때
				total -= i;
			}			
		}
		System.out.println("현재 계산은 "+total+"입니다.");
		System.out.println("현재 "+i+"까지 계산했습니다.");
		
	}

}

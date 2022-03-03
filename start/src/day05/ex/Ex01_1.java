package day05.ex;

/*
 * 	1부터 정수를 더해갔을때 그 합이 5000을 초과하는 수는 몇부터인지 출력하시오.
 * 	/ 처음 합이 5000을 넘는 순간 반복문을 종료한다.
 */

public class Ex01_1 {

	public static void main(String[] args) {
		int total = 0;		// 5000인지 세는 합이며 조건문 변수
		int i = 1;			// 5000일때 몇일지 확인하는 변수
		while(total<5000) {
			total += i;
			i++;
		}
		System.out.println("합이 5000을 초과한 " + total + " 입니다.");
		System.out.println("이 때 정수는 " + (i-1) + " 입니다.");
		
	}

}

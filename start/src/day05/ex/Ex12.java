package day05.ex;
/*
문제 11 ]
	2x + 4y = 10 의 방정식의 결과를 출력하세요.
	단, x, y는 모두 
		0 <= x, y <= 10
	사이의 숫자이다.
*/


public class Ex12 {

	public static void main(String[] args) {
		int x, y;
		for(int i = 0; i<11; i++) {	// i와 j가 주사위
			for (int j = 0; j<11; j++) {
				x = i;
				y = j;
				if(2*x + 4*y == 10) {
					System.out.printf("x : %d / y : %d\n",x, y);
				}
			}
		}
	}

}
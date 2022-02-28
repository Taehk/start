package day05.ex;
/*
문제 14 ]
	다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
	
	1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
	2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
	3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
	4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
*/

/*
 * 	반복 for문 (b,c,d 3중 for문)
 * 		a = d+2
 * 		b = 2~9 (c보단 커야하니 1이 불가능)
 * 		c = 1~8 (b보다 작아야하니 9가 불가능)
 * 		d = 1~7 (a보다 2 작아야하니 8, 9 불가능)
 */
public class Ex15 {

	public static void main(String[] args) {
		int a, b, c, d;
		int total = 0;
		int reverse = 0;
		for (d = 1; d<8; d++) {	// d는 1~7 + a도 저장
			a = d+2;		
			
			for (c = 1; c<9; c++) {	// c는 1~8
				if (c == d | c == a) {	// c가 a나 d와 중복이면 바로 스킵
						continue;
						}
				for (b=2; b<10; b++) {	// b는 2~9
					if (b == d | b == a | b <= c) {	// b가 a,d와 중복이면 바로 스킵 + c보다는 무조건 크다
						continue;
						}
				//	모두 다른 숫자이며 0이 아님을 만족 -> 계산 시작
					total =		a*1000 + b*100 + c*10 + d;
					reverse =	d*1000 + c*100 + b*10 + a;
					if( total+reverse == 16456) {
						System.out.println("해당 조건이 만족했습니다.");
						System.out.printf("a : %d\n",a);
						System.out.printf("b : %d\n",b);
						System.out.printf("c : %d\n",c);
						System.out.printf("d : %d\n",d);
					}
				}
			}
		
		}
	}
}

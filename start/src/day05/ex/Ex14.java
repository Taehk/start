package day05.ex;
/*
	문제 13 ]
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		최대 공약수 :
			두 수의 약수중 제일 큰 수.
			두 수를 나눌 수 있는 수중 제일 큰 수
			
		extra ]
			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.

*/


public class Ex14 {

	public static void main(String[] args) {
		// 랜덤 최저최고 저장뒤 랜덤값 입력
		int high, low;
		high = 100;
		low = 1;
		
		int num1 = (int)(Math.random() * (high - low + 1)+low);
		int num2 = (int)(Math.random() * (high - low + 1)+low);
		
		// 최대 공약수 구하기
		int gongyak = 0;
		
		int small = 0;	// 작은 쪽까지 나눠보기
		
		if (num1 > num2) small = num1;
		else small = num2;
		
		for (int i = 0; i<small; i++) {
				if(num1 % (i+1) == 0 & num2 % (i+1) == 0) {	// 둘 다 나누어 떨어질때
					gongyak = (i+1);
				}
			}
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n", num1, num2, gongyak);
		
		// 최소 공배수 구하기
		int gongbae = 0;

		for(int i = 0; ; i++) {
			for(int j = 0; j < num1; j++) {
					if( (num1*(i+1)) != (num2*(j+1))) {
						continue;
					} else{
						gongbae = num1*(i+1);
						break;
						}
				}
			if (gongbae > 0) {
				break;
				}
			}
		
		System.out.printf("%d와 %d의 최소공배수는 %d입니다.", num1, num2, gongbae);

		
	}
	
		
}

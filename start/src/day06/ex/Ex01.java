package day06.ex;
/*
 * 문제1
 * 		3 ~ 100 사이의 정수를 입력받아서
 * 		이 정수가 소수인지 판단하는 프로그램을 작성하세요.
 * 		
 * 		참고) 소수 - 1과 자신으로만 나눠지는 수
 * 		보너스) 3~100 사이의 숫자 중에서 소수만 모두 출력하세요.
 */


public class Ex01 {

	public static void main(String[] args) {
		// 3~100 랜덤값
		int low, high;
		low = 3; high = 100;
		int num = (int)(Math.random() * (high - low + 1) + low);
		
		boolean issosu = false;
		for(int i = num-1; i>1; i--) {
			if(num%i == 0) {	// 1이 아닌데 나누어 떨어진다면
				issosu = true;
				break;
			}			
		}
		String answer = (issosu == true)?("는 소수가 아닙니다."):("는 소수 입니다.");
		System.out.printf(num+answer);
		
		System.out.println("");
		
		int nn = 0;
		sosu:
		for(int i = 3; i<=100; i++) {
			for(int j = i-1; j>1; j--) {
				if(i%j == 0) {
					continue sosu;
				}else {
					if(j==2) {
						nn++;
						System.out.printf("%d\t",i);
					}
				}
				
				
			}

			if(nn%5==0) {
				System.out.println();
			}
		}
		
		
	}

}

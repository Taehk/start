package day04.ex;
/*
 * 문제1)
 * 		1~25 범위의 랜덤한 숫자 3개를 랜덤하게 발생시켜서
 * 		그들 중 가장 큰 수만 출력하는 프로그램을 작성
 * 	
 * 	*삼항 연산자 사용
 */
public class Ex01 {
	public static void main(String[] args) {
		//	숫자 변수 생성
		int no1, no2, no3;
		
		// 랜덤 범위 변수로 지정
		int low, high;
		low = 1; high = 25;
		
		// 랜덤값 생성
		no1 = (int) (Math.random() * ((high - low + 1) + low));
		no2 = (int) (Math.random() * ((high - low + 1) + low));
		no3 = (int) (Math.random() * ((high - low + 1) + low));
		
		// 랜덤값 비교
		int result = (no1 >= no2) ? ( (no1 >= no3)?(result = no1):(result = no3) ):((no2 >= no3) ? (result = no2):(result = no3));
				//	n1이 n2보다 크다 /                n1이 클때					/         n2가 클 때
							//										큰쪽을 n3과 비교
		System.out.println("no1    : "+no1);
		System.out.println("no2    : "+no2);
		System.out.println("no3    : "+no3);
		System.out.println("  가장 큰 수");		
		System.out.println("result : "+result);
		
		
	}
}

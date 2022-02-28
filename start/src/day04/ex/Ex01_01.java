package day04.ex;
/*
 * 문제1)
 * 		1~25 범위의 랜덤한 숫자 3개를 랜덤하게 발생시켜서
 * 		그들 중 가장 큰 수 / 중간 / 작은 수 출력하는 프로그램을 작성
 * 	
 * 	*삼항 연산자 사용
 */
public class Ex01_01 {
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
		
		// 랜덤값 비교		 가장 큰 값
		int big = (no1 > no2) ? (no1) : (no2);	// 1, 2 중에 큰 수
		big = (big > no3) ? (big) : (no3);		// ㄴ 큰수, 3 중에 큰 수
		
		int small = (no1 < no2) ? (no1) : (no2);	// 1, 2 중에 작은 수
		small = (small < no3) ? (small) : (no3);	// ㄴ 작은수, 3 중에 작은수
		
		int mid = ((no1 != big) && (no1 != small)) ? (no1): (((no2 != big) && (no2 != small)) ? (no2) : (no3));
		
		
				//	n1이 n2보다 크다 /                n1이 클때					/         n2가 클 때
							//										큰쪽을 n3과 비교
		System.out.println("no1    : "+no1);
		System.out.println("no2    : "+no2);
		System.out.println("no3    : "+no3);
		System.out.println("\n  큰 수");		
		System.out.println("       : "+big);
		System.out.println("\n  중간 수");		
		System.out.println("       : "+mid);
		System.out.println("\n  작은 수");		
		System.out.println("       : "+small);
		
	}
}

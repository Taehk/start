package day04;
/*
 *  -100 ~ 100 사이의 정수를 랜덤하게 발생
 *  
 *  
 */
public class Test06 {
	public static void main(String[] args) {
	//	숫자 변수 생성
	int no1, no2, no3;
	
	// 랜덤 범위 변수로 지정
	int low, high;
	low = 0; high = 200;
	
	// 랜덤값 생성
	no1 = (int) (Math.random() * ((high - low + 1) + low)) - 100;
	no2 = (int) (Math.random() * ((high - low + 1) + low)) - 100;
	no3 = (int) (Math.random() * ((high - low + 1) + low)) - 100;
							//		100 - -100 + 1 - 100
	System.out.println(no1);
	System.out.println(no2);
	System.out.println(no3);
	
	}
}

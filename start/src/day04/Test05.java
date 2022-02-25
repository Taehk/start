package day04;
/*
 * 5~25 사이의 정수 랜덤 출력
 */
public class Test05 {

	public static void main(String[] args) {
		int low, high;
		low = 5; high = 25;
		int no = (int)(Math.random() * (high-low +1) + low);
		
		String result = (no%2 ==0)?(result ="짝수"):(result="홀수");
		System.out.println("1~25사이 랜덤하게 발생한 숫자 "+no+ "는 "+result+"입니다.");
	}
}

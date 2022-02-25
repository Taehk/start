package day04.ex;
/*
 * 문제 4)
 * 		1000~3000 사이 숫자를 랜덤하게 발생시켜
 * 		이 숫자를 년도로 하는 해는 윤년인지 평년인지 판별하고 출력 프로그램 작성
 *
 * 		* 윤년 : 4로 나누어 떨어지고 100으로 나누어 떨어지면 안되고 400으로 나눠 떨어지는 해
 */
public class Ex04 {
		public static void main(String[] args) {
			// 랜덤 최소값 최대값 지정
			int high, low;
			low = 1000; high = 3000;
			// 랜덤값 출력
			int year = (int)(Math.random() * ((high - low +1)+low));
			
			// 윤년계산
			String check = (year%4 == 0)?((year%100 == 0) ? ((year%400 == 0)?("윤년"):("평년(400으로 나누어떨어지지 않음)")) : ("윤년")):("평년(4로 나누어 떨어지지 않음)");
/*							4로 나누어 떨어져야함 아니면 윤년X
 * 										100으로 나누어 떨어지지 않으면 윤년
 * 											나누어 떨어진 것 중 400으로 나눠지면 윤년
 */			
			// 출력
			System.out.println("랜덤 년도 : "+year);
			System.out.println("윤년 판별 : "+check);
			
		}
}

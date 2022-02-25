package day04.ex;
/*
 * 문제5)
 * 		3자리 숫자(100~999)를 입력받아서
 * 		이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 * 		얼마가 필요한지를 계산해서 출력하는 프로그램
 * 
 * 		ex) 241은 200에 가까우므로 41을 빼야한다.
 * 			777은 800에 가까우므로 23을 더해줘야한다.
 * 			750의 경우 700에 가깝도록
 */
public class Ex05 {
	public static void main(String[] args) {
		// 랜덤 최소값 최대값 저장
		int low, high;
		low = 100; high = 999;
		
		// 랜덤값 입력
		int num = (int)(Math.random() * ((high-low+1)+low));

		// num의 백의 자리수와 다음 백의 자리수
		int hun = num / 100 * 100;
		int hun_n = hun + 100;
		
		// 계산 판별
		int answer = ((num-hun) <= (hun_n-num))?(hun): (hun_n);
/*						ㄴ 랜덤값이 작은 백의 자리수에 가깝거나 50이라면 그만큼의 차이 변수에 저장
 * 								ㄴ 아니라면 반대로 						*/
		int value = (answer == hun)?(num-hun):(hun_n-num);
		String sAnswer = (answer == hun)?("빼야한다."):("더해줘야한다.");
		
		System.out.printf("%d의 경우는 %d에 가까우므로 %d을 %s", num, answer, value, sAnswer);
		
 
	}

}

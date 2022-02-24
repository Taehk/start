package day03.ex;

/*
 *  1년은 365.2426일이다.
 *  이것은 과연 몇일 몇시간 몇분 몇초인지 계산하고 출력하세요.
 * 	
 *  365.2426일은 단위가 일 단위이다.
 * 	하루는 24시간이다.
 * 	따라서 0.5일은 12시간을 의미한다.
 */


public class Ex04 {

	public static void main(String[] args) {
		double day = 365.2426;
		double hour = (day - (int)day) * 24;			// 0.5일은 12시간 = 0.5 * 24 = 12 -> 일에서 24를 곱하면 시간이다.
		double minute = (hour - (int)hour) * 60;		// 비슷하게 시간에서 60을 곱하면 분이다.
		double second = (minute - (int)minute) * 60;	// 위와 같이 초를 계산한다.
		System.out.printf("따라서 1년은 %d일 %d시간 %d분 %d초이다.\n",(int)day,(int)hour,(int)minute,(int)second);	
	
		double asd = 0.2426 * 24 * 60 * 60;
		double r_d = asd / 3600;
		asd = asd % 3600;
		double r_m = asd / 60;
		asd = asd % 60;
		double r_s = asd;
		
		System.out.println(r_d);
		System.out.println(r_m);
		System.out.println(r_s);
	}
	
}

package day06.ex;
/*
문제 2 ]
	두 사람이 등산을 한다.
	한사람은 산 입구에서 0.54m/sec 의 속도로 등산을 시작하고
	한사람은 정상에서 1.07m/sec 의 속도로 내려온다.
	산의 높이가 7564m 라고 가정하면
	두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요.
*/

public class Ex02 {

	public static void main(String[] args) {
		
		double man1_go = 0;
		double man2_go = 7564;
		double man1 = 0.54;
		double man2 = 1.07;
		
		int sec = 0;
		
		while(man1_go < man2_go) {
			man1_go += man1;
			man2_go -= man2;
			sec++;
		}
		int min = sec / 60;
		sec = sec % 60;
		
		System.out.printf("두 사람은 %d분 %d초 뒤에 %.2f에서 만납니다.",min,sec,man1_go);
	}

}

package day05;

public class Test11 {

	public static void main(String[] args) {
		// 구구단 5단을 출력하는데 곱이 5인 경우는 출력하지 않는다
		int dan = 5;
		
		for(int i = 0; i < 9; i++) {
			int gop = (i+1);

			if(gop == 5) continue;
		
			System.out.printf("%d X %d = %d\n",dan, gop, dan*gop);
			}
	}

}

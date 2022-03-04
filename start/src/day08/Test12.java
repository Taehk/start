package day08;


/*
 	문자와 출현수를 기억한 배열들 10개를 관리하는 배열을 만들고
 	'A' - 'J'를 랜덤하게 100번 반복시켜 만들고
 	배열에 카운트를 기억해서
 	결과를 출력하세요
 */
public class Test12 {

	public static void main(String[] args) {
		// 배열 생성 (문자 10개의 데이터2개)
		int[][] munja = new int[10][2];
		
		// 각 배열에 문자 입력하기
		for(int i = 'A'-'A'; i <= 'J'-'A'; i++) {
			munja[i][0] = 'A'+i;
		}
		
		String ran = "";
		
		for(int i = 0; i < 100; i++) {
			ran += (char)((int)(Math.random()*('J'-'A'+1)+'A'));
		}
		System.out.println(ran);
		
		for(int i = 0; i < ran.length(); i++) {
			int idx = ran.charAt(i) - 'A';
			munja[idx][1]++;
		}
		int total = 0;
		for (int i = 0 ; i < munja.length; i++) {
			System.out.printf("%c : %d\n", munja[i][0], munja[i][1]);
			total += munja[i][1];
		}
		System.out.println(total);
	}

}

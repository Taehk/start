package day05.ex;
/*
 * 예제3 
 * 		1~25의 숫자 3개 랜덤 발생
 * 		가장 큰 수만 출력
 */
public class Ex04 {

	public static void main(String[] args) {
		// 랜덤값 최소/최대값 설정
		int low, high;
		low = 1; high = 25;
		
		// 반복문으로 랜덤값 입력
		int[] ran = new int[3];		
		for(int i = 0; i<3; i++) {
			ran[i] = (int)(Math.random() * ((high - low + 1) +low));	
		}
		
		// 큰 수 판별
		int result = 0;
		if (ran[0] > ran[1]) {
			if (ran[0] > ran[2]) {
				result = ran[0];
			}
			else {
				result = ran[2];
			}
		}
		else {
			if (ran[1] > ran[2]) {
				result = ran[1];
			}
			else {
				result = ran[2];
			}
		}
		
		// 출력
		for(int num : ran) {
			System.out.print(num);
			if (num != ran[ran.length-1]) {
				System.out.print(", ");
			}
			else {
				System.out.println();
			}			
		}
		
		System.out.printf("가장 큰 수는 %d입니다.", result);
	}

}

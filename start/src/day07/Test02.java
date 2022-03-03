package day07;

/*
 * 	6개의 메모리를 배열로 만들고
 * 	그 안에 랜덤한 숫자를 입력한 후 출력하세요
 */

public class Test02 {

	public static void main(String[] args) {
		// 5개의 메모리를 배열로 만들기
		int[] num = new int[6];
		
		// 랜덤값 생성 및 배열에 넣기
		int low, high;
		low = 40; high = 45;
		
		loop:
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (high - low + 1) + low);
			
			for(int j = 0; j < i; j ++) {
				if(num[i] == num[j]) {
					i--;
					continue loop;
				}
			}
		}

		for(int no : num) {
			System.out.printf("%d\t", no);
		}
		
	}

}

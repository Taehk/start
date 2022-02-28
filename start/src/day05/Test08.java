package day05;
/*
 * 1~10까지 합을 구해서 출력해주는 프로그램
 */
public class Test08 {

	public static void main(String[] args) {
		int result = 0;
		int[] nu = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i<10; i++) {
			result += (i+1);
		}
		System.out.println(result);
		
		
		int result1 = 0;
		for(int num : nu) {
			result1 += num;
		}
		System.out.println(result1);
		
		int[] se = new int[10];
		for(int i = 0; i < 10; i++) {
			se[i] = i+1;
			System.out.println(se[i]);
		}
	
	
	}

}

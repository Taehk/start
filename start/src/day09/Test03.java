package day09;


/*
 		5개의 숫자를 입력받아서 더하는 프로그램을 작성하세요.
 		단, 입력/계산/출력은 함수로 처리하세요.
 */

public class Test03 {

	public Test03() {
		toPrint(getArr());
		
	}
	
	public static void main(String[] args) {
		new Test03();
	}
	
	// 출력

	// 함수가 실행되면 5개의 랜덤한 정수를 관리하는 배열을 완성시켜 반환해주는 함수
	public int[] getArr() {
		// 반환값 변수
		int[] arr = new int[5];
		
		// 1~99 사이의 랜덤값 만들어서 채워줌
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 99 + 1);
		}
		
		// 반환값 반환
		return arr;
	}
	
	// 정수 배열을 입력받아서 모든 정수의 합을 구해서 반환해주는 함수
	public int calc(int[] arr) {
		int result = 0;
		
		for(int i = 0; i<arr.length; i++) {
			result += arr[i];
		}
		
		return result;
	}
	
	// 배열을 입력받아서 결과를 출력해주는 함수
	public void toPrint(int[] arr) {
		// 배열 내용
		int result = calc(arr);
		
		System.out.print("입력된 배열 : ");
		for(int num : arr) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		System.out.println("배열의 총합계는 "+result);
	}
}

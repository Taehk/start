package day05;

public class Test09 {

	public static void main(String[] args) {
			
		// 1~숫자를 만들어서 출력하고 50이 되면 반복을 종료하세요.
		
		for(int i = 0;  ; i++) {
			/* 
			 * 참고
			 * 		for문에서 조건식에 아무것도 기술하지 않은 경우는 true로 실행 
			 */
			int no = i + 1;
			if(no>50) {
				break;
			}
			System.out.print(no+", ");
		}
		System.out.println();		
	
		int no = 1;
		while(true) {
			if(no>50) {
				break;
			}
			System.out.print(no+", ");
			no++;
		}
		System.out.println();				

	}
	

}

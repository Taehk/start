package day06.ex;

/*
문제 4 ]
	
	다음 형태로 출력하세요
	
*****
*****
*****
*****
*****
*****
****
***
**
*
*
**
***
****
*****
*
***
*****
*/

public class Ex04 {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0; i<5; i++) {
			for(int j = 5-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		loop:
		for(int i = 0; i<5; i++) {
			for(int j = i+1; j>0; j--) {
				if ((i+1)%2 == 1) {
				System.out.print("*");
				}else continue loop;
			}
			System.out.println();
		}
		System.out.println();
		
	}

}

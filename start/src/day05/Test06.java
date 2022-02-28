package day05;

/*
 * 구구단 7단
 */

public class Test06 {

	public static void main(String[] args) {
		for (int dan = 0; dan<9; dan++) {
				for (int i = 0; i<8; i++) {
					System.out.printf("%2d X %2d = %2d", i+2, dan+1 ,(dan+1)*(i+2));
					if (i != 7) {
						System.out.print("\t");
					} else {
						System.out.println("");
					}
			}
		}
	}

}

package day03;

public class Test04 {
	public static void main(String[] args) {
		int no1,no2;
		no1 = no2 = 10;
		   int no3 = no1++;	//	-> no1 = 11, no3 = 10
		   int no4 = ++no2;	//  -> no2 = 11, no4 = 11

		System.out.println(no1);
		System.out.println(no3);
		System.out.println(no2);
		System.out.println(no4);
	}
}

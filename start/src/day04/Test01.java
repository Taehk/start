package day04;

public class Test01 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 10;
		boolean bool = (no1 == no2) && (++no1 > no2);
		
		System.out.println(bool);
		System.out.println(no1+" "+no2);
		
		System.out.println(no1>no2);
		System.out.println(no1++>no2);
		
		
	}
}

package day09;

/*
 		두 수를 입력하면 더해서 반환해주는 기능의 함수를 만들어서 실행하세요
 */

public class Test05 {
	public Test05() {
		int no1 = getInt();
		int no2 = getInt();
		
		int result = add(no1, no2);
		
	}
	
	public static void main(String[] args) {
		new Test05();
	}
	
	public int getInt() {
		int no = (int)(Math.random() * 10 + 1);
		return no;
	}
	
	// 범위를 입력하면 랜덤하게 정수를 만들어주는 함수
	public int getInt(int pos1, int pos2) {
		int min = pos1 < pos2 ? pos1 : pos2;
		int max = pos1 < pos2 ? pos2 : pos1;
		int no = (int)(Math.random() * (max - min +1) + min);
		
		return no;
	}
	
	// 두 수 더해서 반환해주는 함수
	public int add(int no1, int no2) {
		return(no1+no2);
	}
	// 출력해주는 함수
	public void toPrint() {
		// 출력하세용
	}
}

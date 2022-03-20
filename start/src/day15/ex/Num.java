package day15.ex;

public class Num implements Comparable{
	// 변수 생성
	private int no;
	// 기본 생성자
	public Num() {
		no = (int)(Math.random() * 99 + 1);
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return no+" ";
	}

	@Override
	public int compareTo(Object o) {
		Num no2 = (Num) o;
		int result = no - no2.getNo();
		return -result;	// 내림차순이므로
	}
	
	
}

package day09;

public class Test01 {
	int no = 10;
	
	// abc라는 이름의 함수
	static void abc(int no) {
		
	}
	
	public static void main(String[] args) {
		abc(10);
	}
	
	void xyz() {	// 뭔가 기능이 필요한 경우 함수를 제작
		int no = 10;
		abc(no);
		
		// 1, "숫자 : " ==> "숫자 : 1"
	}
	
	public String add(int no, String str) {
		return str + no;
		
	}
}

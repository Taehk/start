package day13;

public class Test08 {

	public Test08() {
		System.out.println("(1) abc() 호출");
		abc();
		System.out.println("(2) abc() 종료 직후");
	}

	public void abc() {
		int no1 = 25;
		int no2 = 0;
		int result = 0;
		
		try {
			result = no1 / no2;
		} catch(Exception e) {
			System.out.println("***예외 발생");
			return;		// finally 블럭을 실행한 후 함수 종료 시킨다.
		} finally {
			System.out.println("### 여기는 finally 블럭");	// 위에 리턴이 있더라도 무조건 실행함
		}
	}
	
	public static void main(String[] args) {
		new Test08();
		
	}

}

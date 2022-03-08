package day10;

public class Test05 {

	public static void main(String[] args) {
		new Test05();	// 이 경우 JVM이 자동으로 기본 생성자 호출
		
		Test05_01 t1 = new Test05_01(10);
		System.out.println(t1);
	}

}

class Test05_01{
	public Test05_01(int no) {
		System.out.println(no);
	}
}
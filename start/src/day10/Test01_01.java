package day10;
/*
 		Test01 클래스의 변수에 접근해서 데이터를 읽어보자
 */
public class Test01_01 {

	private int num1, num2, num3, num4;
	public void getNo() {
		Test01 t = new Test01();
//		num1 = t.no1;	// no의 접근지정자는 Test01 클래스 내에서만 가능하도록 private로 지정되어 있다.
		num2 = t.no2;
		num3 = t.no3;
		num4 = t.no4;
	}
	
}

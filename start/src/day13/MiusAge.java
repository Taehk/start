package day13;

public class MiusAge extends Exception {
	/*
	 * 		사용자정의 예외 클래스 만드는 방법
	 * 			1. Exception 클래스를 상속받은 클래스를 만든다. (이거)
	 * 			2. toString()함수를 오버라이드해서 예외 정보를 기술한다.
	 * 			이후 예외처리문에서 e.printStackTrace();를 사용하면 해당 오류문이 나타난다.
	 */
	
	@Override
	public String toString() {
		return getClass().getName() + " : 음수의 나이가 입력되었습니다.";
	}
}

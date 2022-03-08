package day10.sub;

import day10.*;

public class sample01 {
	private int num1, num2, num3, num4; // 은닉화
	
	// day10.Test01의 멤버 변수를 읽어서 위 변수에 셋팅하는 함수
	public void setNum() {
		// 힙에 객체 만들고
		Test01 t1 = new Test01();
		
//		num1 = t1.no1;		no1의 접근지정자가 private이기 떄문에 X
//		num2 = t1.no2;		no2는 같은 패키지 안의 클래스인 경우까지만 접근가능하도록 접근지정자가 생략이므로 X
//		num3 = t1.no3;		no3는 Test10을 상속받은 클래스거나 같은 패키지 내의 클래스안에서만 사용가능하므로 X
		num4 = t1.no4;		// public은 삽가능
		
	}
}

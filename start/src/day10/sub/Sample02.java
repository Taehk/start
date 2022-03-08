package day10.sub;

import day10.Test01;


public class Sample02 extends Test01{
	public Sample02() {
//		System.out.println("no1 : "+no1);	// 같은 클래스 내에서만 사용가능한 변수
//		System.out.println("no2 : "+no2);	// 접근지정자가 생략된 경우이므로 같은 패키지가 아니면 사용 불가능
		System.out.println("no3 : "+no3);	// 접근지정자가 protected이고
							// 이 경우는 같은 패키지 안에 있거나 상속받은 클래스 내에서는 사용가능하다
		System.out.println("no4 : "+no4);
	}
}

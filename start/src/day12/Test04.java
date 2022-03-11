package day12;

import java.util.*;

public class Test04 {
	public Test04() {
//		Calender cal  = new Calender();// TODO Auto-generated method stub
//		ㄴ 이 클래스는 추상클래스로 new 시켜서 객체를 만들 수 없다.
		Calendar cal = Calendar.getInstance();	// 추상클래스의 객체를 getInstance함수로 받는다.
		System.out.println(cal.getTime());
	}
	public static void main(String[] args) {
		new Test04();
	}

}

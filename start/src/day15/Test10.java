package day15;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test10 {

	public Test10() {

		// ArrayList 타입의 list에 1 ~ 25사이의 정수 10개를 랜덤하게 만들어서 채워주세요.
		ArrayList list = new ArrayList();
		Random rd = new Random();
		
		System.out.println(list.size());
		
		for(int i = 0; i< 10; i++) {
			list.add((int)(rd.nextInt(25)+1));
		}
		
		Collections.sort(list, new DownSort());
	}

	public static void main(String[] args) {
		new Test10();
	}

}

class DownSort implements Comparator {
	/*
	 	정렬 방식을 변경하기 위해서는 Comparator을 상속 받은 클래스를 만들어야 한다.
	 	
	 	이 클래스는 Object클래스를 상속받아서 만들어졌기 때문에
	 	이 클래스 내부에 equals()가 이미 존재하고 있다
	 	
	 	정렬을 할 경우에는 Comparator에게 물려받은 compare() 함수를 오버라이드해서
	 	정렬 방식을 직접 정해서 적용시킬 수 있게 된다.
	 	
	 	이 때 이 함수의 반환값은 정수를 반환하도록 되어 있는데
	 	값의 크기는 중요하지 않고
	 	부호가 중요하다.	음수이면 위치를 바꾸지 않고 양수면 위치를 바꿈
	 */
	@Override
	public int compare (Object o1, Object o2) {
		int result = 0;
		
		// 입력된 데이터를 원래 형태로 강제형변환한다.
		int no1 = (int) o1;
		int no2 = (int) o2;
		
		result = no1 - no2;	
		
		return -result;// 내림차순으로 돌려야하니 -로 부호 바꿈
	}
}
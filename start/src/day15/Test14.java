package day15;

import java.util.*;

public class Test14 {

	public Test14() {
		/*
		TreeSet set = new TreeSet();
		Circle cir1 = new Circle(5);
		Circle cir2 = new Circle(10);
		
		set.add(cir1);	// TreeSet은 오름차순 정렬을 하는데 객체로는 비교를 못함
		set.add(cir2);
		
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		} */
		// 해결방법 1. TreeSet을 만들 때 정렬 방식을 알려주면서 만드는 방법 = Comparator 이용
		// 해결방법 2. Circle을 정렬 가능한 클래스로 만든 후 입력
		//					ㄴ 정렬 가능한 클래스로 만드는 법
					// 				Comparable 인터페이스를 구현하는 클래스로 제작한다.
					//				소속 함수 중 compareTo(Object o)함수를 오버라이드해서 작성
		
		// 1번 방법	+ 내림차순 정렬
		TreeSet set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Circle cir1 = (Circle) o1;
				Circle cir2 = (Circle) o2;
				
				int result = cir1.getRad() - cir2.getRad();
				
				return -result;	// <- 내림차순 정렬이다.
			}
		});
		Circle cir1 = new Circle(5);
		Circle cir2 = new Circle(10);
		
		set.add(cir1);
		set.add(cir2);
		
			// 출력
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		// 2번 방법
	}

	public static void main(String[] args) {
		new Test14();
	}

}

package day16;

import java.util.*;

public class Test11 {

	public Test11() {
		// 문자열만 입력받도록 하는 Set
		HashSet<String> set = new HashSet<String>();
		// 이 Set은 문자열만 입력받도록 조치해놓은 Set이다.
		// 따라서 꺼낼때 꺼낸 데이터는 당연히 문자열이 된다.
		set.add("제니");
		set.add("로제");
		set.add("지수");
		set.add("리사");
		
		// 향상된 for문으로 꺼내기
		for(String name : set) {
			System.out.println(name);
		}
		
		// 제너릭스 전파X
		ArrayList<String> blackpink = new ArrayList<String>(set);
		for(int i = 0; i < blackpink.size(); i++) {
			String name = blackpink.get(i);
			System.out.println(name);
		}
		
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}

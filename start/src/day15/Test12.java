package day15;

import java.util.*;

/*
 	블랙핑크 맴버를 HashSet에 저장하고 출력
 */

public class Test12 {

	public Test12() {
		HashSet set = new HashSet();
		
		// 데이터 추가
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		// 입력된 개수 꺼내오기
		int len = set.size();
		System.out.println("채워진 멤버 수는 "+len+"이다.");
		
		/*
		 	Set 계열 클래스는 데이터를 꺼내는 함수가 존재하지 않는다.
		 	꺼내서 사용해야할 경우는 Iterator 변환 or List 변환해서 진행한다.
		 */
		
		System.out.println("1. Iterator을 이용하는 방법");
		
		// 1. Iterator로 변환해서 사용하기	 해시코드값으로 정렬
		Iterator itor = set.iterator();
			/*
			 	Iterator는 StringTokenizer랑 유사하게 하나씩 순차적으로 꺼내고 사용한 순간 사라진다.
			 */
		while(itor.hasNext()) {
			// hasNext() : 꺼낼 데이터가 남아있는지 알려주는 함수, 반환값은 boolean타입
			
			// 데이터를 꺼낸다
			String name = (String) itor.next(); // .next(); 데이터 꺼내주는 함수
			
			//출력
			System.out.println(name);
			
		}
		
		System.out.println();
		// 2. List로 변환해서 사용하기
		System.out.println("2. Iterator을 이용하는 방법");
		Vector vec = new Vector(set);	// set에 저장된 데이터 Vector로 바꾼다.
			// 데이터 추출 및 출력
		for(int i  = 0; i<vec.size(); i++) {
			String name = (String)vec.get(i);
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}

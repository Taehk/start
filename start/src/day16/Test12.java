package day16;

/*
 	학생들의 점수를 기억하는 Map을 만들자.
 */
import java.util.*;

public class Test12 {

	public Test12() {
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		
		student.put("제니",95);
		student.put("리사",85);
		student.put("지수",80);
		student.put("로제",90);
		
		// 키값을 꺼내보자
		Set<String> set = student.keySet();
		
		// 키와 데이터를 동시에 꺼내보자 Map.Entry
		Set<Map.Entry<String, Integer>> entry = student.entrySet();
		
		// Iterator 변환
		Iterator<Map.Entry<String, Integer>> itor = entry.iterator();
		while(itor.hasNext()) {
			String key = itor.next().getKey();
			int date = student.get(key);
			System.out.println(key+" : "+date);
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}

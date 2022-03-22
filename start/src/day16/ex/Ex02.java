package day16.ex;

import java.util.*;

public class Ex02 {
/*
 			학생들의 과목점수를 기억하는 HashMap을 만들고
 			다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하세요.
 			과목은 국어 영어 수학 과학 국사의 점수를 기억하도록 하세요
 */
	public Ex02() {
		// 학생 이름 + 점수 저장용 Student클래스를 기억하는 HashMap
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		// 학생 5명 생성
		for(int i = 0; i<5; i++) {
			map.put((char)('A'+i)+"", new Student());
		}
		
		// 출력
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		for(int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			Student stud = map.get(name);
			System.out.println("학생명 : "+name+"\n"+stud);
		}
		Iterator<String> itor = list.iterator();
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println("학생 : "+name+"\n"+map.get(name));
		}
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		for(int i = 0; i < set.size(); i++) {
			String name = iter.next();
			System.out.println("학생2 : "+name+"\n"+map.get(name));
		}
		

		Set<Map.Entry<String, Student>> entry = map.entrySet();
		Iterator<Map.Entry<String, Student>> it2 = entry.iterator();
		while(it2.hasNext()) {
			String name = it2.next().getKey();
			System.out.println("학생3 : "+name+"\n"+map.get(name));
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

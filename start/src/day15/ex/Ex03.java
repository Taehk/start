package day15.ex;

/*
	학생 한명의 정보를 저장할 클래스를 제작하세요
	정보는
		학생이름, 반, 번호, 
		자바, 데이터베이스, 웹, 스프링 점수
		총점, 평균
	를 기억하게 하고
	
	10명의 학생을 TreeSet에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.
	
 */

import java.util.*;

public class Ex03 {
	String[] name = new String[10];
	
	public Ex03() {
		// 이름 생성 + 인덱스를 번호로 지정할 예정
		for(int i = 0; i < name.length; i++) {
			name[i] = (String)((char)(int)('A'+i)+"");
		}
		
		
		// 1번 방법	무명 내부 클래스
		System.out.println("1번 방법	무명 내부 클래스\n");
		TreeSet set1 = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Stud stud1 = (Stud)o1;
				Stud stud2 = (Stud)o2;
				int result = stud1.getBan() - stud2.getBan();
				if(result == 0) {
					result = stud1.getNum()-stud2.getNum();
				}
				return result;
			}			
		});
		
		for(int i = 0; i<name.length;i++) {
			set1.add(new Stud(name[i],i+1));
		}
		
			// 출력 Iterator형식
		Iterator itor = set1.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next());
		}
		
		System.out.println();
		System.out.println();
		
		// 2번 방식 Comparable 인터페이스를 구현한 Student 클래스 사용
		System.out.println("2번 방식 Comparable 인터페이스를 구현한 Student 클래스 사용\n");
		TreeSet set2 = new TreeSet();
		for(int i = 0; i < name.length; i++) {
		set2.add(new Student(name[i], i+1));
		}
			// 출력 Vector(list로 출력)하는 형식
		Vector vec = new Vector(set2);
		for(int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i));
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
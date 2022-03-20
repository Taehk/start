package day15.ex;

/*
	1 ~ 99 사이의 정수를 랜덤하게 발생시켜서 
	10개를 TreeSet에 입력한 후
	내림차순으로 정렬해서 출력하세요.
 */

import java.util.*;

public class Ex02 {

	public Ex02() {
		// 방법 1. 무명 내부 클래스 이용
		TreeSet set1 = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int no1 = (int)o1;
				int no2 = (int)o2;
				int result = no1 - no2;							
				return -result;				
			}
		});
		for(int i = 0; i<10; i++) {
			set1.add((int)(Math.random()*99+1));
		}
		System.out.println(set1);
		
		// 방법 2. Comparable 계승하는 클래스 생성 후 이용
		TreeSet set2 = new TreeSet();
		for(int i = 0; i<10; i++) {
			set2.add(new Num());
		}
		Vector vec = new Vector(set2);
		for(int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i));
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
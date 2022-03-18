package day15;

import java.util.*;

public class Test13 {
/*
 		HashSet에 숫자 6개를 채워보자.
 			Set 특징
 				1. 입력 순서 고려 X
 				2. 중복 데이터 허락 X
 				
 */
	
	public Test13() {
		HashSet set = new HashSet();
		
		int count = 0;
		while(set.size()<6) {
			set.add((int)(Math.random() * 20 +1));
			count++;
		}
		System.out.println(set);
		System.out.println(count);
		
		// 1. Iterator형
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.printf("%2d |",(int)itor.next());
		}
		System.out.println();
		
		// 2. List형
		Vector vec = new Vector(set);
		for(int i = 0; i < vec.size(); i++) {
			System.out.printf("%2d |",(int)vec.get(i));
		}
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}

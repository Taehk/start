package day15;

import java.util.*;

public class Test09 {

	public Test09() {
		// ArrayList 타입의 list에 1 ~ 25사이의 정수 10개를 랜덤하게 만들어서 채워주세요.
		ArrayList list = new ArrayList(10);
		Random rd = new Random();
		
		System.out.println(list.size());
		
		for(int i = 0; i< 10; i++) {
			int ran = rd.nextInt(25)+1;
			list.add((Integer)ran);
		}
		
		for(Object num : list) {
			System.out.printf("%2d | ", (int)num);
		}
		System.out.println();

		// 오름차순 정렬
		Collections.sort(list);
		System.out.println("오름차순 정렬 후");
		
		for(int i = 0; i < list.size(); i++){
			System.out.printf("%2d | ",(int)(list.get(i)));
		}
		System.out.println();
		
		
		
		// 내림차순 정렬
		Collections.reverse(list);	// 오름차순 정렬한걸 reverse
		System.out.println("내림차순 정렬 후");
		
		for(int i = 0; i < list.size(); i++){
			System.out.printf("%2d | ",(int)(list.get(i)));
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}

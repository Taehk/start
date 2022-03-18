package day15;

import java.util.*;

public class Test15 {

	/*
	 		삼각형의 정보를 기억하는 Semo클래스를 만들고
	 		15개의 삼각형을 높이가 큰 삼각형부터 정렬되어 저장되도록
	 		TreeSet을 만들고
	 		내용을 출력하세요
	 */
	
	public Test15() {
		TreeSet set = new TreeSet();
		while(true) {
			Semo s = new Semo((int)(Math.random()*21+5),(int)(Math.random()*31+5));
			set.add(s);
			
			if(set.size() >= 15) {
				break;
			}
		}
		
		Vector vec = new Vector(set);
		for(int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
			System.out.println("################");
		}
		
	}

	public static void main(String[] args) {
		new Test15();
	}	

}

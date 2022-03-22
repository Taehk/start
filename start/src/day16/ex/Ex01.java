package day16.ex;

import java.util.*;

/*
 			5 ~ 10 사이의 정수를 랜덤하게 발생키셔서
 			그 수만큼의 학생의 점수를 기억하는
 			HashMap을 만들어서 데이터를 기억시키고
 			꺼내서 출력하세요
 			데이터를 꺼낼 때 키를 모두 추출해서 꺼내는 방식으로 출력하세요
 */

public class Ex01 {

	public Ex01() {
		// Map생성
		HashMap<String, Integer> stud = new HashMap<String, Integer>();
		
		int ran =(int)(Math.random()*5+5);
		// 점수랑 학생 이름 입력
		for(int i = 0; i < ran; i++) {
			stud.put((char)('A'+i)+"",(int)(Math.random()*40+60));
		}
		
		
		// 키값 추출
		Set<String> set = stud.keySet();
		Vector<String> vec = new Vector(set);
		for(int i = 0; i < vec.size(); i++) {
			String name = vec.get(i);
			int score = stud.get(name);
			System.out.println("이름 : "+name+"\t점수 : "+score);
		}
		
	}
	
	public static void main(String[]args) {
		new Ex01();
	}

}

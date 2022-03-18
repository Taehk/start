package day15;

import java.util.*;

public class Test07 {

	public Test07() {		
		ArrayList vec = new ArrayList();
		
		vec.add("제니");
		vec.add('F');		// 기본데이터형은 자동 Boxing이 돼서 입력
		vec.add(21);
		vec.add(168.5);
		vec.add(false);
		
		// 자동화 처리
		for(int i = 0; i < vec.size(); i++) {
			// 데이터 꺼내고
			Object o = vec.get(i);	// 따로 처리해놓지 않으면 모든 객체가 Object형으로 기억됨
			
			// 데이터의 형태에 맞게 각각 처리
					// 여러 형태의 데이터를 사용하려는 경우는 무조건 강제 형변환으로 원래 형태로 변환해줘야 한다.
			if(o instanceof String) {
				String str = (String) o;
				System.out.println("이름 : "+str);
			}else if(o instanceof Integer) {
				int num = (int) o;
				System.out.println("나이 : "+num);				
			}else if(o instanceof Character) {
					char gen = (char) o;
				System.out.println("성별 : "+gen);				
			}else if(o instanceof Boolean) {
				boolean aca = (boolean) o;
				System.out.println("학원 : "+aca);								
			}else if(o instanceof Double) {
				double height = (double) o;
				System.out.println("신장 : "+height);
			}
		}
		/*
		 	컬렉션의 특징은 여러 형태의 데이터를 동시에 보관할 수 있다는 것이다.
		 	하지만 실무에서는 이렇게 사용하는 경우는 드물고
		 	배열과 동일하게, 될 수 있으면 한 종류로만 데이터를 저장한다.
		 */
	}

	public static void main(String[] args) {
		new Test07();
	}

}

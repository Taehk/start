package day14;

/*
 		문자열 데이터
 			"제니 리사 로제 지수"를 ,를 구분자로 분리 출력하자
 * 
 * 
 */
import java.util.*;

public class Test05 {

	public Test05() {
		String member = "제니,리사,로제,지수";
		
		// , 기준으로 자른다
		StringTokenizer token = new StringTokenizer(member, ",");
			// 이렇게 객체가 만들어지면 잘려진 결과는 버퍼메모리(임시메모리공간)에 기억이 되고
			// 하나씩 꺼내서 사용해야하는데 주의사항은 한번 꺼낸 데이터는 꺼내는 즉시 메모리에서 사라진다.
			// 따라서 결과를 사용해야한다면 변수나 다른 타입의 변수나 배열 등에 기억시켜 놓아야 한다.
		
		int len = token.countTokens(); // 잘려진 데이터의 갯수를 반환해주는 함수
		
		// 데이터를 기억할 배열
		String[] pink = new String[len];
		
		// 인덱스 변수 만들고
		int idx = 0;

		
		// 하나씩 꺼내서 출력한다
		while(token.hasMoreTokens()) {
			// token.hasMoreTokens() : 임시메모리에 꺼낼 문자열이 있는지 여부를 논리값으로 반환해준다.
			// token.hasMoreElements() : 임시메모리에 꺼낼 객체가 있는지 여부를 논리값으로 반환해준다.
			String black = token.nextToken();
			// 한번 꺼낸 데이터는 그대로 사라지기 떄문에 다시 접근해서 사용할 수 없다.
				// 여기선 출력만 할 예정이므로 사라져도 상관이 없다.
			System.out.println(black);
			pink[idx] = black;
			idx++;
		}
		
		for(String black : pink) {
			System.out.print(black+"||");
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}

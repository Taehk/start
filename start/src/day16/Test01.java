package day16;

/*
 		Set계열의 특징
 			1. 입력순서 보장 X	<- 자기 나름의 정렬규칙을 가지고 정렬해서 보관하니까
 			2. 중복데이터 입력 X
 */
import java.util.*;

public class Test01 {

	/*
	 	네모 클래스를 만들고 가로가 같은 네모면 같은 네모로 처리되도록 하시오.
	 */
	
	public Test01() {
		Nemo n1 = new Nemo(5,3);
		Nemo n2 = new Nemo(5,5);		
		Nemo n3 = new Nemo(5,3);
		Nemo n4 = new Nemo(5,5);
		
		// HashSet을 만든다.
		HashSet set = new HashSet();
		// 위에 만든 네모 2개를 넣는다
		set.add(n1);
		set.add(n2);
		for(Object o : new ArrayList(set)) {
			System.out.println(o);	// 출력이 목적이면 최종적으로 오버라이드 된 Nemo의 toString()가 호출되므로
											// 강제 형변환 필요X
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}

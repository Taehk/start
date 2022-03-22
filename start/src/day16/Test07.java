package day16;
import java.util.*;

public class Test07 {
	/*
	 * 		재귀 호출함수(재귀함수)
	 * 			함수 내부에서 자기자신을 다시 호출하는 함수
	 * 			주로 반환값 반환부분에서 다시 호출하는 형식을 띈다.
	 * 
	 * 			주의사항 : 반드시 호출 종료지점을 지정해주어야한다.
	 */

	public Test07() {
		System.out.println(getSum(50));
		
	}
	

	// 1~n까지 합을 구해서 반환해주는 값은?
	public int getSum(int n) {
		if (n<1) return 0;
		return n + getSum(n-1);
	}
	public static void main(String[] args) {
		new Test07();
	}

}

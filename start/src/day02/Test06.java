package day02;

public class Test06 {

	public static void main(String[] args) {
		/*
		 * 타입이 다른 두 데이터의 연산의 결과는 항상 큰 타입쪽을 따른다.
		 */
		
		double no = 3.14 + 10;
		
		// 'a'의 다섯번째 이후 문자를 출력하시오.
		
		char ch ='a';
		int num = ch + 5;
		char ch1 = (char)num;
		System.out.printf("%s : %c\n", "'a'보다 5번째 이후 문자", (char)num);
		System.out.printf("%c", ch1);
	}
}

package day02;

/**
 * 자신의 정보를 기억하고 출력하는 클래스
 * 
 * @author 김태현
 * @since 2022.02.23
 * @version v.1.0
 * 
 */

public class Test03 {
	public static void main(String[] args) {
		// 자신의 이름, 나이, 이름 첫문자, 키를 변수에 입력시키고 출력하세요.
		String name = "김태현";
		short age = 25;
		char initial = '김';	// 유니코드로 변환되기 때문에 한글도 한 글자 가능 + 대소 비교 가능
		double height = 179.8;	// 소수점 아래자리 없이 실수형으로 자동 저장 179.
		
		System.out.printf("%c > %c : %b\n",initial, '남', (initial>'전'));
		// 내용 출력
		System.out.printf("%s : %s\n", "이름", name);
		System.out.printf("%s : %d\n", "나이", age);
		System.out.printf("%s : %c\n", "첫문자", initial);
		System.out.printf("%s : %.2f\n", "키", height);
		
		
	}
}

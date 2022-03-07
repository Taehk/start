package day09;

public class Test02 {
	
	public Test02(){
		abc();
		int no1 = makeInt();
		int no2 = makeInt();
		prn(no1, no2);
		prn(no1, no2, calc(no1, no2));
	}
		// 기본 생성자
			// 생성자 함수는 반환값 타입을 기술하면 안된다.
	
	public static void main(String[] args) {
		new Test02();
		
	}
	
	public int makeInt() {
		int no = 0;
		
		no = (int)(Math.random() * 100 + 1);
		
		return no;
	}
	
	public int calc(int no1, int no2) {
		int result = no1 + no2;
		
		return result;
	}
	
	public void prn(int no1,int no2) {
		int result = calc(no1, no2);
		System.out.println(no1+" + "+no2+" = "+result);
	}
	public String prn(int no1, int no2, int no3) {
		// 함수의 오버로딩 (함수의 중첩 = 같은 함수명 사용)
		//	ㄴ 같은 이름으로 함수를 한 클래스 내에 추가하는 법
			// 해당 방법
		System.out.println("두 정수" + no1 +"과 "+ no2+ "의 합은 "+ no3 + "입니다.");
		return null;
	}
	
	
	public void abc() {
		System.out.println("abc함수 호출...");
	}

}

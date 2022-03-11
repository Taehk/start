package day12;

public class Test03 {
	public Test03 () {
		// getData()를 다섯번 호출해서
		// 반환값 숫자에 회수 * 10을 더해서 -> 이 작업을 위해선 getData()의 형태에 따라 강제 형변환 필요
		// 그 결과를 호출하세요
		for(int i = 0; i< 5; i++) {
			Object obj = getData();
			
			int result = 0;
			
			if( obj instanceof Integer) {	// Integer(int형 오브젝트타입)인 경우
				result = ((Integer)obj) + (i*10);	// Wrapper 클래스(ex Integer)에서 기본형 타입으로 형변환 : unboxxing
			}else if ( obj instanceof String) {
				String str = (String)obj;	// 형변환
				result = Integer.parseInt(str) + (i * 10);
			}
			
			System.out.println((i+1)+"번째 결과 : "+result);
		}
		
		
	}
	public static void main(String[] args) {
		new Test03();
	}
	
	public Object getData() {
		// 0-1 랜덤하게 숫자 발생
		// 0 - 정수100
		// 1 - 문자열 "100" 반환해주는 함수
		int no = (int)(Math.random() * 2);
		
		Object obj = null;
		
		if (no == 0) {
			obj =  100;		// int -> Integer -> object
		}else if (no == 1) {
			obj =  "100";	// String -> Object
		}
		
		return obj;	// 이 때 반환타입은 오브젝트이다
	}

}

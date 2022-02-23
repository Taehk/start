package day02;

public class Test05 {
/*
 *  3.14를 강제 형변환을 이용해서
 *  float 타입 변수 pi에 기억시키고 출력하세요.
 */
	public static void main(String[] args) {
		// 변수 선언
		float pi;
//		pi = 3.14;		<- 에러남 3.14가 double 타입이기 때문
//			  ㄴ 3.14를 float타입으로 강제로 바꾼 다음에 초기화
		pi = (float)3.14;
//					 ㄴ 3.14는 여전히 리터럴 풀에 double타입으로 저장
	}
}

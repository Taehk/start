package day15;

/*
 *  5 ~ 25 사이의 랜덤한 정수를 반지름으로 하는 원을 기억할 클래스를 만들고
 *  원 10개를 리스트에 채워서
 *  넓이가 넓은 원부터 내림차순으로 정렬해서 출력하세요
 */
import java.util.*;

public class Test11 {

	public Test11() {
		ArrayList list = new ArrayList();
		
		
		// 데이터 추가
		Random rd = new Random();	// 랜덤 객체 생성		
		for(int i = 0; i<10; i++) {
			Circle cir = new Circle(rd.nextInt(20+5));
			// 만들어진 원을 각 방에 채워 준다.
			list.add(cir);
		}
		
		// 정렬 전
		System.out.println("1. 내림차순 정렬 전");
		for(Object o : list) {
			// 이떄 꺼낸 데이터 o는 원래는 circle객체를 입력한 것이다.
			// 따라서 원래 데이터로 강제 형변환한다.
			Circle cir = (Circle) o;
			System.out.println(cir);
		}
		System.out.println();
		
		// 정렬하기
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				// 원래 데이터타입으로 강제 형변환
				Circle cir1 = (Circle)o1;
				Circle cir2 = (Circle)o2;
				
				result =  ((cir1.getArea() - cir2.getArea()) < 0)? -1 : 1 ;		// 반환값은 크기 중요 X 부호가 중요
				
				return -result;
			}
		});
		
		// 정렬 이후
		System.out.println("2. 내림차순 정렬 이후");
		for(Object o : list) {
			// 이떄 꺼낸 데이터 o는 원래는 circle객체를 입력한 것이다.
			// 따라서 원래 데이터로 강제 형변환한다.
			Circle cir = (Circle) o;
			System.out.println(cir);
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
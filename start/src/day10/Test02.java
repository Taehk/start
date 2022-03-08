package day10;
/*
 *  	블랙핑크 친구들의 정보를 기억시키고 출력하세요
 */
public class Test02 {
	public Test02() {
		// 제니 객체
		Friend f1 = new Friend();
		
	//	f1.name = "제니"ㅣ; <- 이 변수는 접근지정자가 private이므로 다른 클래스에서는 접근할 수 없다.
		
		// 제니 정보 세팅
		f1.setName("제니");
		f1.setAddr("ygM");
		f1.setBirth("1996/03/08");
		f1.setMail("jennie@githrd.com");
		f1.setTel("010-1111-1111");
		f1.setAge(27);
		f1.setGen('F');
		
		
		// 출력
		System.out.println("제니의 이름 : "+ f1.getName());
		System.out.println("제니의 주소 : "+ f1.getAddr());
		System.out.println("제니의 생일 : "+ f1.getBirth());
		System.out.println("제니의 메일 : "+ f1.getMail());
		System.out.println("제니의 번호 : "+ f1.getTel());
		System.out.println("제니의 나이 : "+ f1.getAge());
		System.out.println("제니의 성별 : "+ f1.getGen());
		
		System.out.println(f1.toString());
		
		// 로제 객체
		Friend f2 = new Friend();
		
		// 리사 객체
		Friend f3 = new Friend();
		
		// 지수 객체
		Friend f4 = new Friend();
		
		// 4멤버를 하나의 변수로 관리해보자
		Friend[] black  = new Friend[4];
			// 이렇게하면 friend타입의 데이터를 기억할 공간 4개를 확보한 상태
		
		Friend tmp1 = black[0];
		black[0] = f1;
		black[1] = f2;
		black[2] = f3;
		black[3] = f4;
		
	}
	
	public static void main(String[] args) {
		new Test02();

	}

}

package day10;

/*
 	Black Pink 멤버의 정보를 기억할 배열을 만들고
 	데이터를 입력하고
 	완성이 되면 데이터를 출력하세요
 * 	
 * 	단, 각 멤버의 데이터 정보는 Friend 클래스에 기억시키도록 한다
 */

public class Test04 {
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] naee;
	char gen;
	String addrs;
	
	Friend[] black;
	
	public Test04() {
		// 맴버 변수들 초기화
		setData();
		
		// 배열 완성하고
		setBlack();
		
		toPrint();
	}
	
	public void setBlack() {
		// 데이터 기억할 공간 확보
		black = new Friend[4];
		
		// 확보된 공간에 데이터 채워주고 
		for(int i = 0; i < black.length; i++) {
			black[i] = new Friend();
			
		}
		// 각 방에 객체의 데이터 입력
		for(int i = 0; i< black.length; i++) {
			Friend f = black[i];

			f.setName(names[i]);
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setAge(naee[i]);
			f.setGen(gen);
			f.setAddr(addrs);
		}
		
	}
	
	public void toPrint() {
		Friend[] b = black;
		for(int i = 0; i < b.length; i++) {
			// 이때 배열의 각 방에 기억된 객체들의 맴버 변수는 접근이 불가능하므로
			// 접근할 수 있는 함수를 호출해서 처리해야한다.
			String name = b[i].getName();
			String addr = b[i].getAddr();
			String tel = b[i].getTel();
			String mail = b[i].getMail();
			String birth = b[i].getBirth();
			int age = b[i].getAge();
			char gen = b[i].getGen();
			
			System.out.println("이름 : "+name);
			System.out.println("주소 : "+addr);
			System.out.println("전화 : "+tel);
			System.out.println("메일 : "+mail);
			System.out.println("생일 : "+birth);
			System.out.println("나이 : "+age);
			System.out.println("성별 : "+ ((gen == 'M')?'남':'여'));
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
	}
	
	public Friend[] getBlack() {
		// 이 함수는 Friend[] 배열을 만들고
		Friend[] anne = new Friend[4];
				// 각 방에 Friend 타입의 객체는 들어있지 않고 기억할 공간만 확보
		
		// 각방에 Friend 데이터 채워서
		for(int i = 0; i < anne.length; i++) {
			anne[i] = new Friend();
			
		}
		for(int i = 0; i < anne.length; i++) {			
			Friend f = anne[i];
			
			f.setName(names[i]);
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setAge(naee[i]);
			f.setGen(gen);
			f.setAddr(addrs);
		}
		
		// 위의 반복문이 종료가 되면 각 방에 있는 객체의 변수에 데이터를 입력할 수 있는 상태가 된다.
		
		// Friend의 배열을 반환해준다
		return anne;
	}
	
	// 각 데이터 초기화 해주는 함수
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수"};
		tels = new String[] {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444"};
		email = new String[] {"jennie@githrd.com", "lisa@githrd.com", "rose@githrd.com", "jisu@githrd.com"};
		birthday = new String[] {"1997/03/08","1996/04/05","1998/05/05","1997/07/07"};
		naee = new int[] {27, 28, 26, 27};
		gen = 'F';
		addrs =" ygM";
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}

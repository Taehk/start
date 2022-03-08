package day10;

public class Semo01 {
	private int height, width;
	private double area;
	
	public Semo01() {
/*		height = 1;
		width = 1;
		setArea();	// 사실상 아래의 Semo01과 하는 일이 똑같다 */
		
		this(1,1); // 이 함수는 아래에 정의된 생성자를 호출하는 것이다.
		// 반드시 생성자의 첫줄 첫문장에 기술되어야 한다.
		
	}
		// 아무것도 입력받지 않고 이 클래스를 객체로 만든다면
		// 높이와 너비를 1로 셋팅하고 삼각형을 만들기로 하자.
		
	public Semo01(int height, int width) {
		// 이 생성자는 높이와 너비를 입력받아서 삼각형 객체로 만들어주는 기능의 생성자
		// 이 생성자의 역할은 입력된 숫자를 높이와 너비에 입력하고 넓이를 계산해서 입력해주는 역할
		this.height = height;
		this.width = width;
		//  전역변수  매개변수
		setArea();
	}
	
	public void setArea() {
		area = width * height / (double)2;
	}
}

package day11;

import static java.lang.Math.*;	// static import

public class Test03 {
	
	public Test03() {
		Samgak sam = new Samgak((int)(random()*21+5), (int)(random()*21+5));
		sagak nemo = new sagak((int)(random()*21+5),(int)(random()*21+5));
		
		System.out.printf("밑변이 %3d이고 높이가 %3d이고 넓이가 %6.2f인 삼각형\n", sam.getWidth(), sam.getHeight(), sam.getArea());
		System.out.printf("밑변이 %3d이고 높이가 %3d이고 넓이가 %6.2f인 사각형\n", nemo.getWidth(), nemo.getHeight(), nemo.getArea());
		
		Figure f1 = sam;
		Figure f2 = nemo;
			// 이 경우 삼각형, 사각형에 있는 getWidth(), getHeight() 등은 Figure의 멤버로는 존재하지 않으므로
			// 이렇게 Figure 타입의 변수에 삼각, 사각의 객체를 담은 경우는 해당 함수를 호출할 수 없다.
		System.out.printf("넓이가 %6.2f인 삼각형\n", f1.getArea());
		System.out.printf("넓이가 %6.2f인 사각형\n", f2.getArea());
			// 상위 클래스 타입 변수에 하위 클래스 인스턴스를 넣은 경우
				// 상위 클래스 함수 이외는 호출할 수 없다.
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}

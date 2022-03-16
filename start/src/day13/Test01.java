package day13;

import day12.sub.*;

/*
 		day12.sub 패키지의 figure 인터페이스를 구현한 사각형 무명 내부 클래스를 만들어서
 		사용해보자.
 */

public class Test01 {
	int width = (int)(Math.random() * 21 + 5);
	int height = (int)(Math.random() * 21 + 5);
	double area;

	public Test01() {
		// 사각형
		Figure fig = new Figure() {
			@Override
			public void setArea() {
				area = width * height;
			}
			@Override
			public void toPrint() {
				System.out.printf("사각형 가로: %3d 세로: %3d 넓이: %6.2f\n", width, height, area);
			}
			
		};
		
		// 삼각형
		Figure fig1 = new Figure() {
/*			int width = (int)(Math.random() * 21 + 5);
			int height = (int)(Math.random() * 21 + 5);
			double area; */
			@Override
			public void setArea() {
				area = width * height * 0.5;
			}
			@Override
			public void toPrint() {
				System.out.printf("사각형 가로: %3d 세로: %3d 넓이: %6.2f\n", width, height, area);
			}
			
		};
		fig.setArea();
		fig.toPrint();
		fig1.toPrint();
	}
	public static void main(String[] args) {
		new Test01();
	}

}

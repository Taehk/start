package day12.ex;

public class Ex02 {
	Fig[] figArr = new Fig[10];
	
	public Ex02() {
		
		setArr();
		for(Fig f : figArr) {
			f.toPrint();
		}
	}
	
	
	
	// 배열에 데이터 넣기
	public void setArr() {
		
		for(int i = 0; i<figArr.length; i++) {
			int no = (int)(Math.random() * 3 + 3);
			switch (no) {
			case 3:
				figArr[i] = new Fig(){
					int width;
					int height;
					double area;
					@Override
					public void setArea() {
						area = width * height * 0.5;
					}
					@Override
					public int ranInt() {
						return (int)(Math.random() * 3 + 3);
					}
					@Override
					public void toPrint() {
						width = ranInt();
						height = ranInt();
						setArea();
						System.out.printf("삼각형 %3d %3d %6.2f\n", width, height, area);
					}
					
					
				};
				break;
			case 4:
				figArr[i] = new Fig() {
					int width;
					int height;
					int area;
					@Override
					public void setArea() {
						area = width * height;
					}
					@Override
					public int ranInt() {
						return (int)(Math.random() * 3 + 3);
					}
					@Override
					public void toPrint() {
						width = ranInt();
						height = ranInt();
						setArea();
						System.out.printf("사각형 %3d %3d %6d\n", width, height, area);
					}
					
					
				};
				break;
			case 5:
				figArr[i] = new Fig() {
					int rad;
					double area;
					@Override
					public void setArea() {
						area = rad * rad * Math.PI;
					}
					@Override
					public int ranInt() {
						return (int)(Math.random() * 3 + 3);
					}
					@Override
					public void toPrint() {
						rad = ranInt();
						setArea();
						System.out.printf("원 %3d %6.2f\n", rad, area);
					}
					
					
				};
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
	
	
}

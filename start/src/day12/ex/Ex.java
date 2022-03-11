package day12.ex;
/*
 *  랜덤하게 3-5 정수 발생
 *  3 삼
 *  4 사
 *  5 원
 *  도형 10개 관리 배열
 */
public class Ex {
	public Ex() {
		Fig[] figArr = new Fig[10];
		
		
		// 채우기
		setData(figArr);
		
		// 출력
		printTo(figArr);
	}
	public static void main(String[] args) {
		new Ex();
	}
	
	// 3-5 랜덤 정수
	public int setRan() {
		return (int)(Math.random() * 3 + 3);
	}
	
	// 배열별 데이터 채우기
	public void setData(Fig[] figArr) {
		for(int i = 0; i < figArr.length; i++) {
			int ran = setRan();
			switch (ran) {
			case 3:
				figArr[i] = new Semo((int)(Math.random() * 9 + 1), (int)(Math.random() * 9 + 1));
				break;
			case 4:
				figArr[i] = new Nemo((int)(Math.random() *  9 + 1), (int)(Math.random() * 9 + 1));
				break;
			case 5:
				figArr[i] = new Dongl((int)(Math.random() * 9 + 1));
			}
		}		
	}
	
	public void printTo(Fig[] figArr) {
		for(Fig f1 : figArr) {
			f1.toPrint();
		}
	}

}

package day08;

import java.util.Arrays;

/*
 	얕은 복사의 특징
 		Heap영역에 있는 데이터는 프로그램이 종료할 때까지 살아남는다.
 */
public class Test03 {
int[] no;	
	
	public void SetNo() {
		no = new int[5];
		for(int i = 0; i < no.length; i++) {
			no[i] = (int)(Math.random() * 99 +1);
		}
	}
	
	public static void main(String[] args) {
		int[] a;		// 배열의 주소를 기억할 변수
		{
			int[] b;
			b = new int[5];		// new라는 명령으로 heap에 배열을 생성했지만
			b[2] = 500;			// 블럭 안에 만들어진 변수이므로
			a = b; // <- 얕은 복사
			b[1] = 300;
		}						// 	<- 블럭을 벗어나면 b는 사라짐
	System.out.println(Arrays.toString(a));
	}

}

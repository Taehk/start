package day09.ex;

import java.util.Arrays;

/*
	문제 4 ]
		1차원 배열에 정수 10개를 입려한 후
		합계와 평균을 구해주는 프로그램을 작성하세요.
		
		배열에 정수를 랜덤하게 채워주는 함수
		합계를 계산해주는 함수
		평균을 계산해주는 함수
		출력해주는 함수
*/

public class Ex04 {

	int[] num = new int[10];
	
	public Ex04()
	{
		toPrint();
		
		
	}
	public static void main(String[] args) {
		new Ex04();
	}
	
	// 랜덤값 채우기
	public void inputNum() {
		
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 10 + 1);	// 1~10사이 랜덤값
		}				
	}
	
	// 합계 계산
	public int sum() {
		int sum = 0;
		for(int i = 0; i<num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	// 평균 계산
	public double avg(int sum) {
		double avg = sum / (double)num.length;		
		return avg;
	}
	
	// 출력
	public void toPrint() {
		inputNum();
		System.out.println("현재   배열은 "+Arrays.toString(num));
		System.out.println("배열의   합은 " +sum());
		System.out.println("배열의 평균은 " +avg(sum()));
		
	}

}

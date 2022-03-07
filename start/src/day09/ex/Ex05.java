package day09.ex;

import java.util.Arrays;

/*
	문제 5 ]
		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
		총점과 석차를 구하는 프로그램을 작성하세요.
		
		각 학생의 점수입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
		
 */

public class Ex05 {
	// 학생 배열 전역변수 사용
	int[][] stud = new int[10][3];
	
	public Ex05()
	{
		ranScore();
		toPrint(total());
	}
	public static void main(String[] args) {
		new Ex05();
	}
	
	// 랜덤입력
	public void ranScore() {
		for(int i = 0; i < stud.length; i++) {
			for(int j = 0; j< stud[i].length; j++) {
				stud[i][j] = (int)(Math.random() * 41 + 60);	// 60~100점 사이				
			}
		}
	}
	
	// 총점계산
	public int[] total() {
		int[] total = new int[10];
		for(int i = 0; i < stud.length; i++) {
			for(int j = 0; j < stud[i].length; j++) {
				total[i] += stud[i][j];
				}
			}
		return total;
	}
	
	// 등수 계산
	public int[] rank ( int[] total) {
		int[] rank = new int[10];
		for(int i = 0; i < total.length; i++) {
			for(int j = 0; j < total.length; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
			rank[i]++;
		}
		return rank;
	}
	
	// 출력
	public void toPrint(int[] total) {
		int[] rak = rank(total);
		
		for(int i = 0; i < stud.length; i++) {
			System.out.printf("학생 %2d의 점수는 ",i+1);
			System.out.print(Arrays.toString(stud[i]));
			System.out.printf("\t총점 : %3d",total[i]);
			System.out.printf("\t등수 : %2d등\n",rak[i]);
		}
	}
}	

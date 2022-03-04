package day08.ex;

import java.util.Arrays;

/*
 	Ex01에서 만든 배열의 내용을
 	다섯 과목의 7학생의 배열로 바꿔서
 	해결해보세요
 			학생 학생 학생 총점
 		과목
 		과목
 		총점
 */
public class Ex02 {

	public static void main(String[] args) {
		// 학생 배열 생성
		int[][] stu = new int[6][8];
		
		// 랜덤변수 저장
		int high, low;
		high = 100; low = 60;

		// 랜덤 점수 기억 및 총점 계산		
		for(int i = 0; i < stu.length-1; i++) {
			int total_sub = 0;		// 과목별 총 합
			for(int j = 0; j < stu[i].length-1; j++) {
				int score_sub = (int)(Math.random() * (high - low + 1) + low);
				total_sub += score_sub;
				stu[i][j] = score_sub;				
				}
			stu[i][stu[i].length-1] = total_sub;
			}
		
		for(int i = 0; i < stu[0].length; i++) {
			int total_stu = 0;	// 학생별 총 합
			for(int j = 0; j < stu.length; j++) {
				total_stu += stu[j][i];
			}
			stu[stu.length-1][i] = total_stu;
		}
		
		// 평균 계산
		double[] sub_avg = new double[stu.length-1];		// 마지막칸은 총점칸이니까 -1
		double[] stu_avg = new double[stu[0].length-1];
		
			// 과목별 평균
		for(int i = 0; i < stu.length-1; i++) {
			sub_avg[i] = stu[i][stu[i].length-1] / (double)stu[0].length-1;
			}
			// 학생별 평균
		for(int i = 0; i < stu[0].length-1; i++) {
			stu_avg[i] = stu[stu.length-1][i] / (double)stu.length-1;
		}

		// 출력
		System.out.print("\t");
		for(int i = 0; i < stu[0].length-1; i++) {
			System.out.printf("학생%d ", i+1);
		}
		System.out.print("총점\n");
		for(int i = 0; i < stu.length-1; i++) {
			System.out.printf("과목 %d : %s\n", i+1, Arrays.toString(stu[i]));						
		}
		System.out.printf("총점   : %s\n", Arrays.toString(stu[stu.length-1]));			
		System.out.println();
			// 평균 출력
		for(int i = 0; i < sub_avg.length; i++) {
			System.out.printf("과목 %d 평균 : %.2f\n", i+1, sub_avg[i]);						
		}
		System.out.println();
		for(int i = 0; i < stu_avg.length; i++) {
			System.out.printf("학생 %d 평균 : %.2f\n", i+1, stu_avg[i]);						
		}
	}
}
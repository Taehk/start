package day08.ex;

import java.util.Arrays;

/*
 	7학생의 5과목 점수를 랜덤하게 기억시키고
 	각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
 	평균도 계산해서 출력하세요.
 	석차 입력
 	내림차순 정렬
 */
public class Ex01 {

	public static void main(String[] args) {
		// 학생 배열 생성
		int[][] stu = new int[7][6];
		
		// 랜덤변수 저장
		int high, low;
		high = 100; low = 60;
		
		// 랜덤 점수 기억 및 총점 계산		
		for(int i = 0; i < stu.length; i++) {
			int total = 0;
			for(int j = 0; j < stu[i].length; j++) {
				if(j == stu[i].length-1) {
					stu[i][j] = total; 
				} else {
					int score = (int)(Math.random() * (high - low + 1) + low);
					total += score;
					stu[i][j] = score;
				}
			}
		}
		
		
		// 평균 계산
		double[] avg = new double[stu.length];
		for(int i = 0; i< stu.length; i++) {
			int total = 0;
			for(int j = 0; j < stu[i].length-1; j++) {
				total += stu[i][j];
			}
			avg[i] = total / (double)stu[i].length-1;
		}
		
		for(int i = 0; i < stu.length; i++) {
		System.out.printf("학생 %d의 점수/총점/평균\n\t-> %3s %.2f\n",i+1, Arrays.toString(stu[i]), avg[i]);
		}
		
		// 석차 입력
		int[] rank = new int[stu.length];
		for(int i = 0; i<rank.length; i++) {
			for(int j = 0; j<rank.length; j++) {
				if(stu[i][stu[i].length-1] < stu[j][stu[j].length-1]) {
					rank[i]++;
				}
			}
			rank[i]++;
		}
		for(int i = 0; i<stu.length;i++){
			System.out.printf("%3d ",stu[i][stu[i].length-1]);
		}
		System.out.println("\n"+ Arrays.toString(rank));
		
		int[][] temp = new int[7][2];
		for(int i = 0; i < stu.length; i++) {
			temp[i] = stu[rank[i]-1];
			stu[rank[i]-1] = stu[i];
			stu[i] = temp[i];
		}
		

	}
	
}

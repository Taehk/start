package day08;

import java.util.Arrays;

/*
 		랜덤하게 5명의 학생의 점수를 만들고 배열에 입력시키고 각학생의 석차를 등록하는 배열 생성하시오
 * 
 */
public class Test02 {

	public static void main(String[] args) {
		int[] rank = new int[5];	// 석차 배열
		
		int[] score = new int[5];	// 점수 배열 (랜덤값 사용)
		int low, high;
		low = 60; high = 100;
		for(int i = 0; i < score.length;i++) {
			score[i] = (int)(Math.random() * (high - low + 1)+low);			
		}
		
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
			rank[i]++;
		}
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(rank));
		
	}

}

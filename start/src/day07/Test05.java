package day07;

import java.util.*;

/*
 	5과목의 점수를 기억할 배열을 만들고
 	과목 점수를 입력하고 총점도 배열의 마지막에 계산해서 입력하고
 	평균도 구하고 출력하세요
 	배열에 담긴 과목 점수도 같이 출력하세요.
 */
public class Test05 {

	public static void main(String[] args) {
		int[] sub = new int[6];
		
		int low, high;
		low = 60; high = 100;
		
		for(int i = 0; i < sub.length-1; i++) {
			int score = (int)(Math.random() * (high - low + 1) + low);
			sub[i] = score;
			sub[sub.length-1] += score;
			
		}
		
		System.out.println(Arrays.toString(sub));	//과목 성적 및 총점
		System.out.printf("%.2f",sub[sub.length-1]/(double)sub.length);	// 평균

	}

}

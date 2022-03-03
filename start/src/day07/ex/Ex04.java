package day07.ex;


/*
	5명의 학생의 이름을 기억할 배열을 만들고
	각학생의 시험 성적을 기억할 배열을 만들고
	결과를 출력하는 프로그램을 작성하세요.
	
	출력예 ]
		
		둘리 : 80
		제니 : 90
		리사 : 85
		로제 : 75
		지수 : 100
		-------------
		총점 : 000
		평균 : 00.00
 */

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		// 배열 미리 선언
/*		String[] name = new String[5];
		int[] grade = new int[6];
		
		// 입력 도구 준비 및 반복 = 이름 및 성적 입력
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < name.length; i++) {
			System.out.print("학생의 이름을 입력해주세요 : ");
			name[i] = sc.nextLine();
			System.out.print("학생의 성적을 입력해주세요 : ");
			grade[i] = sc.nextInt();			
		}
*/		

		String[] name = {"둘리", "제니", "리사", "로제", "지수"};
		int[] grade = new int[7];
		for(int i = 0; i < name.length; i++) {
			grade[i] = 80+(i*5);
		}
		
		// 총점 및 평균 계산
		int total = 0;
		for(int i = 0; i < name.length; i++) {	// 학생인원수만큼 성적이 있음
			total += grade[i];
		}
		grade[(grade.length)-1] = total;
		double avg = total / (double)(name.length);	// 평균은 총합 / 학생 인원 수

		// 출력
		for(int i = 0; i < name.length; i++) {
			System.out.printf("%2s : %3d\n",name[i],grade[i]);
		}
		System.out.println("---------------------------------");
		System.out.printf("총점 : %3d\n",grade[grade.length-1]);
		System.out.printf("평균 : %2.2f\n", avg);
		
	}

}

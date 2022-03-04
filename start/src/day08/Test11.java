package day08;
/*
 	세 학생의
 	java, db, web, jsp, spring 점수를 기억할 배열을 만들고
 	각 과목의 점수를 랜덤하게 만들어서 입력하고
 	결과를 출력하는 프로그램을 작성하세요.
 */
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] stu = new int[3][5];
		int low, high;
		low = 60; high = 100;
		
		for(int i = 0; i < stu.length; i++) {
			for(int j = 0; j<stu[i].length; j++) {
				stu[i][j] = (int)(Math.random() * (high - low + 1) + low);
			}
		}
		for(int i = 0; i< stu.length; i++) {
			System.out.printf("학생 %d의 성적은 ",i+1);
			for(int score : stu[i]) {
				System.out.printf("%2d ",score);
			}
			System.out.println();
		}
	}

}

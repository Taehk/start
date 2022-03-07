package day09;

/*
 		5학생의 점수를 배열(총점 포함)에 입력한 후
 		총점을 구하는 프로그램을 작성하세요
 		
 		단, 점수입력/계산/출력은 함수로 처리하세요
 */

public class Test04 {

	public Test04() {
		int[][] stud = new int[5][4];
		// 점수만들고
		setArr(stud);
		// 총점구하고
		for(int i = 0; i<stud.length; i++) {
			setTotal(stud[i]);
		}
		// 내용출력
		toPrint(stud);
		
	}
	
	public static void main(String[] args) {
			new Test04(); // <- 객체만들때만 사용할 수 있는 함수
	
	}
	
	// 배열을 입력해서 실행하면 점수를 채워주는 변수
	public void setArr(int[][] stud) {
		for(int i = 0; i < stud.length; i++) {
			// 학생수 만큼 반복
			
			for(int j = 0; j < stud[i].length-1; j++) {
				//과목 점수 만들기
				stud[i][j] = (int)(Math.random() * 41+ 60);
				
			}
			// 이 함수의 경우 입력된 배열 stud의 내용을 변경하는 것이므로 배열을 반환해주지 않아도 가능
		}
	}
	
	// 배열을 입력하면 총점 계산해주는 함수
	public void setTotal(int[] stud) {
		int sum = 0;
		for (int i = 0; i < stud.length; i++) {
			sum += stud[i];
		}
		stud[3] = sum;
	}
	
	// 출력하는 함수
	public void toPrint(int[][] arr) {
		for(int i = 0; i<arr.length; i++) {
			// 한 학생의 점수를 뽑고
			System.out.print((char)('A'+i)+"학생 : ");
			for(int j = 0; j<arr[i].length; j++) {
				// 각 과목 점수 출력
				System.out.printf("%4d ", arr[i][j]);
			}	
			System.out.println();
		}
			
	}

}

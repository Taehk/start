package day14.ex;

/*
 		학생 성적을 관리하는 클래스 Student
 			반, 이름, 국어, 영어, 수학, 총점 기억
 		반과 이름이 같으면 같은 학생
 */

public class Ex03 {

	public Ex03() {
		Student stud1 = new Student("김태현");
		Student stud2 = new Student("김태현");
		Student stud3 = new Student("유현지");
		
/*		stud1.setBan(1);	// 랜덤으로 지정한 반 통일용
		stud2.setBan(1);
		stud3.setBan(1);
*/		
		boolean result_true = stud1.equals(stud2);	// 이름이 같은 경우
		boolean result_false = stud1.equals(stud3);	// 이름이 다른 경우
		
		System.out.println("학생 1의 경우\n"+stud1);
		System.out.println("########################");
		System.out.println("학생 2의 경우\n"+stud2);
		System.out.println("########################");
		System.out.println("학생 3의 경우\n"+stud3);
		System.out.println("########################");
		
		System.out.println("학생 1과 2의 비교 결과 : "+(result_true?"같다":"다르다"));
		System.out.println("학생 1과 3의 비교 결과 : "+(result_false?"같다":"다르다"));
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}

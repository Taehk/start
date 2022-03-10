package day11.prac;

/*
		학생 10명 반 배정
 *	 0 - 영어반 
 * 	 1 - 국어반
 * 	 2 - 수학반
 */

public class Ex01 {
	
	public Ex01(){
		Student[] stud = new Student[10];
		String[] name = {"학생A","학생B","학생C","학생D","학생E","학생F","학생G","학생H","학생I","학생J"};
		for(int i = 0; i < stud.length; i++) {
			
			int ran = (int)(Math.random() * 3);
			int num = (int)(Math.random() * 41);
			switch (ran){
			case 0:
				stud[i] = new Eng(name[i], num);
				break;
			case 1:
				stud[i] = new Kor(name[i], num);
				break;
			case 2:
				stud[i] = new Math01(name[i], num);				
				break;
			
			}
			stud[i].toPrint();
		}
		
		/*
		 * for(int i = 0 ; i< stud.length; i++) {
			stud[i].toPrint();
			}
		 */
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}

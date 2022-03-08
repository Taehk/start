package day10.ex;
/*
 * 	변수를 가지는 student 클래스를 제작하세요
 * 		String name
 *  	int ban, num, kor, eng, math, total, rank;	// 국영수 입력한 뒤에 총합 평균 등수 계산
 *  	double avg;
 *  
 *  	클래스를 만들고
 *  	Ex01 클래스에서 한 명의 데이터를 입력해서 출력하기
 *  		5명의 데이터를 배열로 만들어 데이터 입력하고 출력하기
 *  
 *  	1. 한개의 함수 내에서 처리하기
 *  	2. 기능별로 분리해서 함수 만들고 처리하기
 */
public class Ex01 {
	// 학생 1명 처리
	Student stu = new Student();
	// 학생 5명 배열로 처리
	Student[] stuArr = new Student[5];
	String name[];
	int ban[];	int num[];	int kor[];	int eng[];	int math[];
	int rank[];
	
	
	public Ex01() {
		// 한명의 학생 함수 하나로 다 처리하기
		getSoloStudent();
		
		// 학생 전역 변수 데이터 초기화
		setData();
		
		// 학생별 데이터 넣기
		getData();
		getTotalAvg();
		getRank();
		
		// 학생 데이터 출력하는 함수
		toPrint();
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
		// 학생 1명 초기화
	public void getSoloStudent() {
		stu.setName("김하나");
		stu.setBan((int)(Math.random()*5+1));
		stu.setNum((int)(Math.random()*30+1));
		stu.setKor((int)(Math.random()*40+60));
		stu.setEng((int)(Math.random()*40+60));
		stu.setMath((int)(Math.random()*40+60));
		
		System.out.println("학생의 이름은 "+stu.getName()+"입니다.");
		System.out.printf("  반 : %2d\t|  번호 : %2d\n",stu.getBan(), stu.getNum());
		System.out.printf("국어 : %2d\t|  영어 : %2d\t|  수학 : %2d\n",stu.getKor(), stu.getEng(), stu.getMath());
		
		stu.setTotal(stu.getKor()+stu.getEng()+stu.getMath());
		stu.setAvg(stu.getTotal()/3.);
		System.out.printf("총점 : %3d\t|  평균 : %2.2f\n",stu.getTotal(), stu.getAvg());
		System.out.println("===============================");
	}
	
	// 전역 변수 데이터 초기화
	public void setData() {
		name = new String[] {"김하나", "박둘", "이셋", "전넷", "최다섯"};
		ban = new int[5];	num = new int[5];
		kor = new int[5];	eng = new int[5];	math = new int[5];
		rank = new int[5];
		for(int i = 0; i < 5; i++) {
			ban[i] = (int)(Math.random()*5+1);
			num[i] = i+1;
			kor[i] = (int)(Math.random()*40+60);
			eng[i] = (int)(Math.random()*40+60);
			math[i] = (int)(Math.random()*40+60);
		}
	}
	
	// 학생별 데이터 입력하는 함수
	public void getData() {
		for(int i = 0; i<stuArr.length; i++) {
			stuArr[i] = new Student();
			stuArr[i].setName(name[i]);
			stuArr[i].setBan(ban[i]);
			stuArr[i].setNum(num[i]);
			stuArr[i].setKor(kor[i]);
			stuArr[i].setEng(eng[i]);
			stuArr[i].setMath(math[i]);
		}
	
	}
	
	// 학생 총점 및 평균 구하는 함수
	public void getTotalAvg() {
		for(int i = 0; i<stuArr.length; i++) {
			int kor = stuArr[i].getKor();	// 나열해두면 보기 불편해서 따로 변수 만듦
			int eng = stuArr[i].getEng();
			int math = stuArr[i].getMath();
			int total = kor + eng + math;
				// 총점 계산
			stuArr[i].setTotal(total);
				// 평균 계산
			stuArr[i].setAvg(total / 3.);
			
		}
	}
	
	// 순위 정하는 함수
	public void getRank() {
		for(int i = 0; i<stuArr.length; i++) {
			for(int j = 0; j<stuArr.length; j++) {
				int total_i = stuArr[i].getTotal();
				int total_j = stuArr[j].getTotal();
				
				if(total_i < total_j){		// 조건식 복잡해 보여서 따로 변수로 간소화
					rank[i]++;
				}
			}
			stuArr[i].setRank(rank[i]++);
		}
	}
	
	// 출력함수
	public void toPrint() {
		for(int i = 0; i < stuArr.length; i++) {
			String s_name 		= stuArr[i].getName();
			int s_ban 			= stuArr[i].getBan();
			int s_num 			= stuArr[i].getNum();
			int s_kor 			= stuArr[i].getKor();
			int s_eng			= stuArr[i].getEng();
			int s_math 			= stuArr[i].getMath();
			int s_total 		= stuArr[i].getTotal();
			double s_avg 		= stuArr[i].getAvg();
			int s_rank 			= stuArr[i].getRank();
			
			System.out.printf("%d반 %d번 학생의 이름은 %3s입니다.\n",s_ban, s_num, s_name);
			System.out.printf("\t국어 : %2d\t|  영어 : %2d\t|  수학 : %2d |\n",s_kor, s_eng, s_math);
			System.out.printf("\t총점 : %3d\t|  평균 : %2.1f\t|  석차 : %2d |\n",s_total, s_avg, s_rank);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			}
	}

}
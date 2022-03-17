package day14.ex;

public class Student {
	// 변수 생성
	private int ban, kor, eng, mat, total;
	private String name;
	
	// 기본생성자 생성
	public Student() {
	}
	public Student(String name) {
		this.name = name;
		setBan();
		setKor();
		setEng();
		setMat();
		setTotal();
	}
	
	
	// equals toString 오버라이디ㅡ
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		Student stud = null;
		
		try {
			stud = (Student)o;
		}catch(Exception e) {
			System.out.println("입력된 타입이 Student가 아닙니다.");
			return result;
		}
		
		boolean check_name = name == stud.getName();
		boolean check_ban = ban == stud.getBan();
		
		
		if((check_name & check_ban) == true) {
			result = true;
		}
		
		return result;
	}
	
	
	@Override
	public String toString() {
		String intro = "\t학생 이름 : "+name+"\n"
				+ "\t학생의 반 : "+ban+"\n"
				+ "\t국어 점수 : "+kor+"\n"
				+ "\t수학 점수 : "+mat+"\n"
				+ "\t영어 점수 : "+eng+"\n"
				+ "\t총합 점수 : "+total;
				
		return intro;
	}
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public void setBan() {
		this.ban = (int)(Math.random() * 5 + 1);
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setKor() {
		this.kor = (int)(Math.random() * 40 + 60);
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setEng() {
		this.eng = (int)(Math.random() * 40 + 60);
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public void setMat() {
		this.mat = (int)(Math.random() * 40 + 60);
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		total = kor + eng + mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

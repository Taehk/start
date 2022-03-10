package day11.prac;

public class Math01 extends Student {
	private String name;
	private int score;
	private char gen;
	private int num;
	

	// 기본 생성자
	public Math01() {}
	
	public Math01(String name, int num) {
		setName(name);
		setNum(num);
		setGen();
		setScore();
	}

	// 오버라이드
	@Override
	public void toPrint(){
		System.out.printf("수학반 - 이름 : %s | 성별 :  %c | 번호 : %2d | 배치고사 : %2d |\n", name, gen, num, score);
	}
	
	
	public char getGen() {
		return gen;
	}
	
	public void setGen(char gen) {
		this.gen = gen;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// 오버로딩
	public void setScore() {
		score = (int)(Math.random()*41 + 60);
	}
	public void setGen() {
		int ran = (int)(Math.random()*2);
		if( ran == 0) {
			gen = '남';
		}else gen = '여';
	}
}

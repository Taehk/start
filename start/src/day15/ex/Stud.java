package day15.ex;

public class Stud{
	private int java, database, web, spring, ban, num, total;
	private String name;
	private double avg;
	
	public Stud() {
	}
	public Stud(String name, int num) {
		this.name = name;
		this.num = num;
		setScore();
	}
	
	// 랜덤 입력 통합 메소드
	public void setScore() {
		ban = (int)(Math.random() * 5 + 1);
		java = (int)(Math.random() * 40 + 60);
		database = (int)(Math.random() * 40 + 60);
		web = (int)(Math.random() * 40 + 60);
		spring = (int)(Math.random() * 40 + 60);
		total = java + database + web + spring;
		avg = total / 4.;
	}
	
	
	@Override
	public String toString() {
		return "학생의 이름 : "+name+"\n" +
			   "\t반     : "+ban+"\n" +
			   "\t번호   : "+num+"\n" +
			   "\t자바   : "+java+"\n" +
			   "\t데베   : "+database+"\n" +
			   "\t스프링 : "+spring+"\n" +
			   "\t총점   : "+total+"\n" +
			   "\t평균   : "+avg+"\n"+
			   "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
	}

	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public int getWeb() {
		return web;
	}
	public void setWeb(int web) {
		this.web = web;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	
}

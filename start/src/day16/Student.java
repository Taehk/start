package day16;

public class Student {
	private String name;
	private int java, db, web, spring, total;
	private double avg;
	
	public Student() {
	}
	public Student(String name, int java, int web, int db, int spring) {
		this.name = name;
		this.java = java;
		this.db = db;
		this.web = web;
		this.spring = spring;
		setTotal(java+db+spring+web);
		setAvg(total/4.);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return String.format("-----------------\n이름 : %5s\n자바 : %3d\n데베 : %3d\n웹 : %3d\n스프링 : %3d\n총점 : %4d\n평균 : %6.2f",name, java, db, web, spring, total, avg);
	}
}

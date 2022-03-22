package day16.ex;

public class Student {
	private int kor, eng, mat, sci, his;
	
	public Student() {
		this.kor = (int)(Math.random()*40+60);;
		this.eng = (int)(Math.random()*40+60);;
		this.mat = (int)(Math.random()*40+60);;
		this.sci = (int)(Math.random()*40+60);;
		this.his = (int)(Math.random()*40+60);;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHis() {
		return his;
	}
	public void setHis(int his) {
		this.his = his;
	}
	@Override
	public String toString() {
		return String.format("\t국어 :%3d\n\t수학 :%3d\n\t영어 :%3d\n\t과학 :%3d\n\t역사 :%3d\n", kor,mat,eng,sci,his);
	}
}

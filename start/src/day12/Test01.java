package day12;

public class Test01 {
	public Test01() {
		Father f1 = new Son();
		
		Father f2 = new Father();
		Son s1 = (Son)f2;		// 문법은 문제 없는데 실행시 문제 -> Father인 f2에 Son의 필수 멤버가 존재하지 않을 수 있어서
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	

}

class Father {
	void abc() {
		System.out.println("#####father######");
	}
}

class Son extends Father {
	void abc() {
		System.out.println("-----son-------");
	}
}
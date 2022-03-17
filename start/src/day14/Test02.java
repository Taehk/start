package day14;

public class Test02 {

	public Test02() {
		//Nemo 객체 2개 만들어서 같은 네모인지 판별해서 출력
		Nemo n1 = new Nemo(20, 10);
		Nemo n2 = new Nemo(10, 20);
		
		// 결과값 변수
		String result = (n1.equals(n2)) ? "같은" : "다른";
		
		System.out.println("n1과 n2 네모는 " + result + "네모입니다.");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("n1 == n2" + (n1 == n2));
	}

	public static void main(String[] args) {
		new Test02();
	}

}

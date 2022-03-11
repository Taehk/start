package day12;

public class Test02 {
	public Test02() {
		Abc a = new Abc();
		toPrint(a);
		
		Efg e = new Efg();
		toPrint(e);	//  Abc a = e; 와 같이 자동형변환되서 매개변수에 기억된다.
	}
	public static void main(String[] args) {
		new Test02();
	}
	
	public void toPrint(Abc a) {
		a.abc();
	}
}

class Abc {
	public void abc() {
		System.out.println("###############3나는 Abc.abc() ##########");
	}
}

class Efg extends Abc{
	@Override
	public void abc() {
		System.out.println("################나는 Efg.abc() ##########");
	}
	
}
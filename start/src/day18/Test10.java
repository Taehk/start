package day18;

/*
  		Runnable 인터페이스를 구현한 스레드 프로그램을 만들어 보자.
  		
 */

public class Test10 {

	public Test10() {
		// Runnalbe 인터페이스를 구현한 스레드 프로그램을 실행하는 방법이 조금 다르다
		
		// 1. new 시킨다
		Yuna yuna = new Yuna();
		Euns euns = new Euns();
			// 아직 두 프로그램은 New Born상태가 아니다
		
		// 2. New Born상태로 만들어준다
		Thread t1 = new Thread(yuna);
		Thread t2 = new Thread(euns);
		// 이제서야 두 프로그램이 New Born상태가 된다.
		
		// Runnable 상태로 전위시킨다.
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test10();
	}
}


class Yuna implements Runnable{
	@Override
	public void run() {
		quest();
	}
	public void quest() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("*** io 유나씨가 "+(i+1)+"번째 질문을 합니다.");
		}
	}
}

class Euns implements Runnable{
	@Override
	public void run() {
		answer();
	}
	public void answer() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t### io 강사님이 "+(i+1)+"번째 대답합니다.");
		}
	}
}
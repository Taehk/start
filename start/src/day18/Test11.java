package day18;

public class Test11 {

	public Test11() {
		NameThread t1 = new NameThread("리사");
		NameThread t2 = new NameThread();
		// New Born된 상태
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test11();
	}

}

class NameThread extends Thread{
	/*
	 	하나의 프로그램을 이용해서 여러번 실행할 경우
	 	구분할 필요가 생길 수 있다.
	 	
	 	구분하는 여러 방법 중
	 		1. 변수 하나를 만들고 그 변수에 값을 다르게 입력해서 구분하는 방법
	 			String name;
	 			
	 		2. 스레드 프로그램 자체에 이름을 부여하는 방법
	 			이때는 상위 클래스인 Thread의
	 					Thread(String name)
	 						를 이용하면 된다.
	 			즉, 상위 클래스의 기본 생성자가 아닌
	 			다른 생성자를 이용하면 스레드에 이름을 부여할 수 있게 된다.
	 				이때 super();사용
	 					1. 이 명령은 반드시 생성자 안에서만 사용해아함.
	 					2. 반드시 첫 줄 첫 문장으로 사용해야 한다.
	 */
	
	public NameThread() {
		// 여러번 생성하더라도 항상 같은 이름으로 생성된다.
		super("제니");
	}
	public NameThread(String name) {
		// new 시킬 때마다 이름을 입력된 이름으로 만들 수 있다.
		super(name);
	}
	
	@Override
	public void run() {
		/*
		 		스레드 이름 이용방법
		 			getName() 가 이름을 알아내는 함수.
		 			지금 이 run()는 두 번 실행될 것이다.
		 			그 때 순서를 무시한 병행처리가 될 것이다.
		 				현재 실행 중인 스레드가 어떤 스레드인지를 알아야 한다.
		 					그것을 알아내는 함수가
		 						currentThread()
		 */
		for(int i = 0 ; i < 1000; i++) {
			Thread t = Thread.currentThread();
			String name = t.getName();	// 스레드의 이름을 알아낸다.
			System.out.println(name+"가 "+(i+1)+"번째 노래를 합니다.");
		}
	}
}
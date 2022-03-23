package day18;

public class Test14 {

	public Test14() {
		EndClass eCls = new EndClass();
		eCls.start();
		
		for(int i = 0; i< 50; i++){
			System.out.println("메인 실행 중...");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
		// 위 명령이 모두 실행이 끝나면 메인 내용이 완료되었으므로 스레도도 종료시켜본다.
		eCls.stop();
		
	}
	public static void main(String[] args) {
		new Test14();
		System.out.println("#### 프로그램 종료 #####");
	}

}

class EndClass extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println("\t\t쓰레드 실행 중입니다.");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
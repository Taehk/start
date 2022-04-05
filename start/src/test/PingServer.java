package test;
import java.util.*;	

/**
 * 	이 클래스는 Ping Server 프로그램 작성 평가용 클래스
 * 	@author 김태현
 * 	@since 2022.04.01
 * 	@version v.1.0
 */
public class PingServer {
	private boolean bool = true;
	private PingThread ping;
	private Scanner sc;
	public PingServer() {
		ping = new PingThread();
		
		sc = new Scanner(System.in);
		
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("*** 평가 프로그램 ***\n서버시작 : start\n서버중단 : quit\n명령을 입력하세요.");
			String str = sc.nextLine();
			
			switch(str) {
			case "start":				// 2-1. start 입력 시 thread 프로그램으로 실행 (10점)
				if(bool) {
					ping.start();
					bool = false;
					try {
						Thread.sleep(200);
					} catch(Exception e) {}
												// 2-2. 서버 실행 중일 때 start 입력시 이미 실행 중 출력 (10점)
				}
				System.out.println("\n*** 이미 서버가 실행중입니다! ***");
				break;
			case "quit":
				ping.setStart(false);	// 2-1. quit 입력 시 모두 종료 후 반복문 탈출 (10점)
				try {
					ping.allClose();
				} catch (Exception e) {}
				break loop;
			}
		}
	}

	public static void main(String[] args) {
		new PingServer();
	}

}
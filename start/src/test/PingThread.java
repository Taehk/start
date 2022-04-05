package test;

import java.io.*;
import java.net.*;

/**
 * 	이 클래스는 PingServer프로그램용 클래스
 *	Thread 프로그램으로 실행되는 클래스
 *	doResponse, close 메소드 생성
 *
 * 	@author 김태현
 * 	@since 2022.04.01
 * 	@version v.1.0
 */
public class PingThread extends Thread {		/// Thread 프로그램으로 실행
	private boolean isStart = true;
	private ServerSocket server;
	private Socket socket;
	private InputStream in;
	private OutputStream out;
	
	public boolean isStart() {
		return isStart;
	}
	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
	public ServerSocket getServer() {
		return server;
	}
	public void setServer(ServerSocket server) {
		this.server = server;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	public InputStream getIn() {
		return in;
	}
	public void setIn(InputStream in) {
		this.in = in;
	}
	public OutputStream getOut() {
		return out;
	}
	public void setOut(OutputStream out) {
		this.out = out;
	}
	
	// * 1-1 실행함수 오버라이드(5점)
	@Override
	public void run() {
		try {		// 예외처리
			server = new ServerSocket(7777);	// 1-2 연결요청을 기다리는 서버 소켓 생성 (10점)
			System.out.println("서버가 열렸습니다.");
			
			socket = server.accept();
			
			doResponse();
		} catch(SocketException e) {	// 서버 관련 오류 이외의 오류만 알아보면 된다.
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			allClose();
			System.out.println();
			System.out.println("서버가 닫혔습니다.");
		}
	}
	
	// 1-3 클라이언트와 통신가능한 메소드 제작(10점)
		// 클라이언트가 접속하면 메세지 받아서 응답해주는 함수
	public void doResponse() throws SocketException, Exception {
		while(isStart) {	// a. 요청이 올때마다 새로운 소켓 생성하기 위한 무한 루프(20점)
			
			String ip = socket.getInetAddress().getHostAddress();	// b. 수락되면 클라이언트 주소 추출 및 출력 (10점)
			System.out.println("\n\t현재 클라이언트의 ip는 " + ip + "입니다.");
			
			in = socket.getInputStream();
			out = socket.getOutputStream();
			
			byte[] buff = new byte[1024];
			int len = in.read(buff);		 // c. 클라이언트 메세지 받고 출력 (10점)	InputStream사용
			String msg = new String(buff, 0, len);
			System.out.println(ip + " : " + msg);
			
			buff = new String("클라이언트가 보낸 메세지) " + msg).getBytes();	// d. 받은 메세지 다시 클라이언트에게 응답 (10점)	OutputStream사용
			out.write(buff);
		}
	}
	
	// 열려있는 자원 모두 반환해주는 함수
	public void allClose() {
		close(out);
		close(in);
		close(socket);
		close(server);
	}
	
	// 1-4 자원 반환용 close 메소드 작성 (5점)
	// 사용하지 않는 자원 반환해주는 함수
	public void close(Object o) {
		try {
			if(o instanceof Socket) {
				((Socket) o).close();
			} else if(o instanceof ServerSocket) {
				((ServerSocket) o).close();
			} else if(o instanceof InputStream) {
				((InputStream) o).close();
			} else if(o instanceof OutputStream) {
				
				((OutputStream) o).close();
			}
		} catch(Exception e) {}
	}
}
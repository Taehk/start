package ping;

import java.io.*;
import java.net.*;

public class Pi {
	ServerSocket server;
	private boolean isStart = true;
	public Pi() {
		try {
			server = new ServerSocket(7777);
			
			while(isStart) {
				System.out.println("서버 접속 완료");
				
				Socket socket = server.accept();	// 소켓 정보 불러오기
				String ip = socket.getInetAddress().getHostAddress();	// ip정보 불러오기
				
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				byte[] buff = new byte[1024];
				int len = in.read(buff);
				
				String msg = new String(buff, 0, len);
				System.out.println(ip + " : "+msg);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package day17;

import java.io.*;

public class Ex01 {

	public Ex01() {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		
		try {
			
			fin = new FileInputStream("C:/Users/YCKIM/Desktop/강의/과제5/과제5_1.py");
			bin = new BufferedInputStream(fin);		// 필터 스트림 부착
			
			while(true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1) break;
				String str = new String(buff, 0, len);
				System.out.print(str);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bin.close();
				fin.close();
			}
			catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

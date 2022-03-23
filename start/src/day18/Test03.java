package day18;

import java.io.*;
/*
 	 이미지 파일을 문자단위 스트림으로 복사
 	 
 	 원래는 바이트코드가 역순이 될 수 있어서 문자단위 스트림으로 주고받으면 안된다.
 */
public class Test03 {

	public Test03() {
		// 기본 스트림 2개 필요
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/day17/ro.jpg");
			fw = new FileWriter("src/day18/result/ro_copy.jpg");
			
			// 몇번 반복해야하는지 알 수 없으므로
			char[] buff = new char[1024];
			while(true) {
				// 한쪽에 읽어서 배열에 채워주고
				int len = fr.read(buff);
				
				// 읽은 데이터가 없는 경우
				if (len == -1){
					break;
				}
				// 다른쪽에 내용을 쓴다.
				fw.write(buff,0, len);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

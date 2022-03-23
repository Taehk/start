package day18;
import java.io.*;

/*
  		버퍼리더를 사용해서	lylics.txt파일을 읽어보자
 */

public class Test04 {

	public Test04() {
		// 기본스트림
		FileReader fr = null;
		// 버퍼스트림
		BufferedReader br = null;
		
		try {
			// 스트림 연결
			fr = new FileReader("src/day17/result/가사.txt");
			br = new BufferedReader(fr);
			
			// 몇번 읽어야할지 모른다. 기억할 배열 + 반복
			char[] buff = new char[1024];
			while(true) {
				String line = br.readLine(); 	// 줄 단위로 한 행씩 읽음 but 줄바꿈기호(/r/n)는 읽지 않는다.
				
				if(line == null	) break;
				
				System.out.println(line);		// ㄴ 그래서 출력할때 println으로 줄바꿈 자동으로 삽입
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}

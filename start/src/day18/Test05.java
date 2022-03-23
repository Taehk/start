package day18;

import java.io.*;

/*
 		버퍼리더라이터를 이용해서 복사
 		PrintWriter을 이용해서 lylics.txt파일 복사
 */
public class Test05 {

	public Test05() {
		// 기본스트림 준비
		FileWriter fw = null;
		FileReader fr = null;
		// 보조스트림 준비;
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		// PrintWriter준비
		PrintWriter pw = null;
		
		try {
			// 읽는 쪽 스트림
			fr = new FileReader("src/day18/result/lylics.txt");
			br = new BufferedReader(fr);
			
/*			// 쓰는 쪽 스트림
			fw = new FileWriter("src/day18/result/lylics_copy.txt");
			bw = new BufferedWriter(fw);
*/			
			pw = new PrintWriter("src/day18/result/lylics_copy1.txt");
			// 반복
			while(true) {
				String str = br.readLine();
				
				if(str == null)	break;
				
/*				bw.write(str+"\r\n");
				
				// 버퍼가 다 채워지지 않은 경우 강제로 비워준다.
				bw.flush();
*/				
				pw.println(str);
				pw.flush();
			}
			System.out.println("### 복사성공 ###");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
/*				bw.close();
				fw.close();	*/
				br.close();
				fr.close();
				pw.close();
			}catch(Exception e) {}
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}

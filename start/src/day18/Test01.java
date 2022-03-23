package day18;
import java.io.*;

public class Test01 {
/*
 * 
 			char단위로 파일에 데이터를 저장하는 프로그램을 작성하시오
 			
 */
	public Test01() {
		// 타겟스트림(기본 스트림)을 준비
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day18/result/lylics.txt");
/*			// 1. 한글자(2바이트)만 저장해보자.
			char ch = 'S';
			fw.write(ch);
*/
			// 2. 여러 글자를 저장해보자.
			String str = "\tStronger than You\r\nThis is Garnet";
			// 여기는 문자단위로 처리를 해야하므로
			// 문자 배열을 준비해야함
/*
			char[] buff = str.toCharArray(); 	// toCharArray() 문자열을 char형 배열로 만들어주는 함수
			fw.write(buff);
*/			
			/*
			 	참고
			 		char단위는 텍스트데이터만 처리히도록 되어 있기 때문에 기본 함수에 문자 처리 기능이 추가되었다.
			 */
			fw.write(str);
			System.out.println("### 저장 작동 ###");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}

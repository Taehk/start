package day18;
import java.io.*;

public class Test02 {
/*
 		result폴더의 txt파일 읽기	
 */
	public Test02() {
		// 타겟스트림(기본) 준비
		FileReader fr = null;
		try {
			fr = new FileReader("src/day18/result/lylics.txt");
/*
 	1. 1글자만 읽기
			int ch = fr.read();
			System.out.println("읽은 문자 : "+(char)ch);	// 코드값으로 반환된 숫자를 char형변환
 */
/*	//2 . 
			char[] buff = new char[1024];
			int len = fr.read(buff);	// 읽은 데이터 배열에 넣기 + 반환값은 문자 갯수
			String str = new String(buff,0,len);
			System.out.println("읽은 문자 : "+str);	// 코드값으로 반환된 숫자를 char형변환
*/
			// 3. 문서 전체 읽기
			// 문자 배열준비
			char[] buff = new char[1024];
			while(true) {
				int len = fr.read(buff);
				if(len == -1) {
					break;
				}
				String str = new String(buff, 0, len);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}

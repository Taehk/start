package day17;

/*
 		파일에 내용을 저장하는 프로그램을 작성하세요.
 		단, BufferedStream을 
 */
import java.io.*;

public class Test08 {

	public Test08() {
		// 1. 반드시 장치에는 기본 스트림이 연결되어야 한다.
		FileOutputStream fout = null;
		// 2. 필요에 따라서 보조(필터)스트림을 연결할 수 있다.(같은 방향이어야한다 Out)
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day17/result/bufferTest01.txt");	// 타켓(기본)스트림 만들고
			bout = new BufferedOutputStream(fout);	// 기본 스트림과 연결
			
			// 내용 만들고
			String str = "Go ahead and try and hit me if you're able";
			// 내용을 byte배열로 변환하고
			byte[] buff = str.getBytes();
			// 데이터를 보조 스트림에 써준다.
			bout.write(buff);
			/*
			 	아직 버퍼가 차지 않았으므로
			 	버퍼의 내용이 fout으로 전달되지 않는다.
			 	따라서 저장이 되지 않는다.
			 	
			 	반드시 습관적으로 작업이 완료된 시점에서
			 	버퍼를 비워주는 습관을 가진다.
			 			 */
			bout.flush();
			
			System.out.println("*********** 작업완료 ************");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bout.close();	// 보조 기구 먼저 닫기
				fout.close();
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}

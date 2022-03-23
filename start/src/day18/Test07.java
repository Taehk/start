package day18;

import java.io.*;

/*
 		Test06에서 저장한 jennie.txt 파일을 읽어보자.
 		
 		ObjectOutputStream으로 저장한(내보낸) 파일은
 		반드시 ObjectInputStream으로 읽어야 한다.
 		
 		+ 보내는 쪽 받는 쪽 같은 클래스가 있어야 한다.
 */

public class Test07 {

	public Test07() {
		// 기본스트림
		FileInputStream fin = null;
		// 보조 스트림
		ObjectInputStream oin = null;
		
		try {
			// 스트림 연결
			fin = new FileInputStream("src/day18/result/jennie.txt");
			oin = new ObjectInputStream(fin);
			
			// 클래스 통채로 읽어온다.
			Friend jny = (Friend)oin.readObject();
			String name = jny.getName();
			String tel = jny.getTel();
			String mail = jny.getMail();
			String addr = jny.getAddr();
			int  age =jny.getAge();
			float height = jny.getHeight();
			char blood = jny.getBlood();
			char gen = jny.getGen();
			boolean rh = jny.isRh();
			
			// 출력
			System.out.println("이름 : "+name);
			System.out.println("번호 : "+tel);
			System.out.println("메일 : "+mail);

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}

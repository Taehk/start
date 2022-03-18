package day15.ex;
		/*
		 	 ID 입력 -> 유효한지 아닌지 판별
		 	 첫글자 영문대문자
		 	 두번째부터 영문숫자 사용
		 	 글자수 5글자 이상.
		 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {

	public Ex01() {
		String id = "Dasd2";
		
		// 정규식 검사
		// 1. 패턴을 정의
		Pattern form = Pattern.compile("[A-Z].{4}"); 
		// 2. 패턴에 맞는지 검사
		Matcher mat = form.matcher(id);
		// 3. 결과를 알아낸다
		boolean bool = mat.matches();
		
		String result = bool ? "올바른" : "잘못된";
		
		// 결과 출력
		System.out.println("입력받은 ID [" + id + "] 은 " + result + "ID입니다.");
	}

	public static void main(String[] args) {
		new Ex01();
	}

}

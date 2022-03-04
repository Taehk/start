package day08;

/*
 	사람들의 이름을 기억할 배열을 만들고
 	이름을 입력해서
 	출력하세요
 */

public class Test05 {

	public static void main(String[] args) {
		// 이름을 기억할 배열을 만들고
		String[] name = new String[4];	// 데이터를 기억할 공간만 확보한 상태
		name[0] = "man1";
		name[1] = "man2";
		name[2] = "man3";
		name[3] = "man4";
		
		// 출력
		for(int i = 0; i<name.length;i++) {
			System.out.println(name[i]);
				
		}
		
	}

}

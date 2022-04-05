package ping;

import java.util.*;

public class MP {

	public MP() {
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램 실행\n\t1. start\n\t2. quit");
		String str = sc.nextLine();
		
		switch(str.toLowerCase()){
			case "start":
				new Pi();
				break;
			default:
				break;
		}
	}

	public static void main(String[] args) {
		new MP();
	}

}

package day17;

/*
 	가사를 파일에 저장해보자
 */
import java.io.*;

public class Test11 {

	public Test11() {
		// 스트림 준비
		// PrintStream을 사용해보자.
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day17/result/가사.txt");
			// 직접 파일에 연결된 스트림을 만드는 보조 스트림이다.
			// 내용을 써준다.
ps.println("			Stronger than You");
ps.println();
ps.println("			This is Garnet");
ps.println("			Back together");
ps.println("			And I'm never going down at the hands of the likes of you");
ps.println("			Because I'm so much better");
ps.println("			And every part of me is saying 'go get her'");
ps.println("			The two of us ain't gonna follow your rules");
ps.println("			Come at me without any of your fancy tools");
ps.println("			Let's go, just me and you");
ps.println("			Let's go, just one on two");
ps.println("			Go ahead and try and hit me if you're able");
ps.println("			Can't you see that my relationship is stable?");
ps.println("			I can see you hate the way we intermingle");
ps.println("			But I think you're just mad 'cause you're single");
ps.println("			And you're not gonna stop what we made together");
ps.println("			We are gonna stay like this forever");
ps.println("			If you break us apart we'll just come back newer");
ps.println("			And we'll always be twice the gem that you are");
ps.println("			I am made o-o-o-o-of");
ps.println("			Lo-o-o-o-ove");
ps.println("			O-o-o-o-of");
ps.println("			Lo-o-o-o-ove");
ps.println("			Lo-o-o-o-ove");
ps.println("			Lo-o-o-o-ove");
ps.println("			Mm-mm-mm-mm-mm");
ps.println("			Mm-mm-mm-mm-mm");
ps.println("			Mm-mm-mm-mm-mm");
			
			System.out.println("***** 가사 저장 성공 *****");
			ps.flush();
			/*
			 		내부적으로 Buffered의 기능을 가지고 있으므로
			 		반드시 내보내기가 끝나면 버퍼를 비워둬야 한다.
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}

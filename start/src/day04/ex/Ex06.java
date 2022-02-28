package day04.ex;


import javax.swing.JOptionPane;


public class Ex06 {

	public static void main(String[] args) {
		// 세자리 정수를 입력받는다.
		String sno = JOptionPane.showInputDialog("세자리 정수 입력 : " );
		// 입력받은 데이터는 정수형태의 문자열이므로 정수로 변환해줘야 한다.
		// 정수형태의 문자열을 정수로 변환해주는 기능을 가지고 있는 함수는
		//	Integer.parseInt(문자열)
		int no = Integer.parseInt(sno);
		no = 15;
		
		
	}
}

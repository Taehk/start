package day05.ex;
/*
	문제 10 ]
		주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
 */


public class Ex11 {

	public static void main(String[] args) {
		int dice1, dice2;
		for(int i = 0; i<6; i++) {	// i와 j가 주사위
			for (int j = 0; j<6; j++) {
				dice1 = i+1;
				dice2 = j+1;
				if(dice1 + dice2 == 6) {
					System.out.printf("Dice1 : %d / Dice2 : %d\n",dice1, dice2);
				}
			}
		}
	}

}
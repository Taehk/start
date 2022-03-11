package day12;

public class Test00 {
	public Test00() {
		int no = 10;
		int[] arr = {1, 2, 3, 4, 5};
		
		arr = new int[] {1,2,3,4,5};
		
		no = addNo(no);
	}
	
	public int addNo(int no) {
		int sum = no + 10;
		return sum;
	}
	
	public void setArr(int[] arr) {	// int[]는 데이터 주소를 기억하는 것이므로 값을 변환하면 직접적으로 바뀜
		arr[0] = arr[0]+10;			//  ㄴ 기본형 데이터변수가 아님
	}
	
	public static void main(String[] args) {
		new Test00();
	}

}

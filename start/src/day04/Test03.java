package day04;

public class Test03 {
	public static void main(String[] args) {
		int no = 65;
			// 20 -> 00010100(2)
		int result = no << 1; // 오른쪽으로 2칸 시프트
			// 00010100(2) -> 00000101(2) = 5
		System.out.println(result);
	}
}

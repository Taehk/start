package day04.ex;
/*
 * 문제 3)
 * 		게시물을 게시판에 출력하는데
 * 		하나의 페이지에 게시물을 15개 출력할 예정이다.
 * 		게시물 수를 랜덤하게 발생시켜서
 * 		게시판의 페이지가 몇개 필요한지 계산해서
 * 		출력해주는 프로그램을 작성하시오
 * 		
 * 		* 참고 : 게시물이 없어도 최소 1페이지는 필요하다.
 */
public class Ex03 {
	public static void main(String[] args) {
		// 랜덤의 최소-최대값 지정
		int low, high;
		low = 0; high = 400;
		// 게시물 갯수 랜덤 입력
		int post = (int)( Math.random() * ((high - low + 1)+low));
		
		// 페이지 계산
		int page = post / 15;
		page = (post == 0) ? (1) : ((post%15 > 0)?(++page):(page));
			// post가 0일때 page = 1 / 아닐 때는 남은 게시물이 하나라도 있으면 페이지 + 1
		
		System.out.println("post의 갯수 : "+post);
		System.out.println("page는 "+page+"개가 필요합니다.");
		
	}
}

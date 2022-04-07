package jdbc;

import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.*;

/*

	emp테이블의 데이터를 조회하는데
	dno라는 문자열을 입력받으면 
		부서번호를 입력받아서 해당 부서의 부서원들의
		사원번호, 이름, 직급, 입사일, 급여, 부서번호, 부서 이름, 부서 위치
			출력해주고
		job 이라는 문자열을 받으면
		해당 직급을 가진 번호,이름, 직급, 입사일, 급여, 등급, 커미션
			조회하는 프로그램 작성
	+ all 입력되면 모든 사원들의
		사원번호, 이름, 직급, 입사일을 조회
	+ exit가 입력되면 즉시 종료
	
		
 */

	/*
	 	이 클래스는 사용자가 어떤 것을 입력하던지
	 		결국 오라클을 사용할 준비가 되어있어야 한다
	 	따라서 이 클래스가 new 되는 순간
	 	드라이버가 로딩이 되면 편리할 것
	 */
public class Jdbctest01 {
		// case문에 코드 많아지면 코드값으로 기억못하니까
		// 변경이 불가능한 final 변수로 사용
	public final int SEL_ALL = 0;
	public final int SEL_DNOINFO = 1;
	public final int SEL_JOBINFO = 2;

	
	//	작업에 필요한 변수 선언
		Connection con;
		Statement stmt;
		PreparedStatement pstmt;
		ResultSet rs;
		
		EmpSQL eSQL;	// 어차피 질의명령 빼올거라 미리 선언해둠

		public Jdbctest01() {
		
		//	드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			eSQL = new EmpSQL();	// EmpSQL이 있어야 getInput이 가능
			
			getInput();
			
		}catch(Exception e) {
			System.out.println("### 서버 로딩 실패 ###");
		}
		/*
		
		System.out.println(getSQL(this.SEL_ALL));
		System.out.println(getSQL(this.SEL_ALL));
		System.out.println(getSQL(this.SEL_ALL));
	위랑 같은거
		String sql1 = getSQL(SEL_ALL);
		System.out.println(sql1);
		
		String sql2 = getSQL(SEL_DNOINFO);
		System.out.println(sql2);
		
		String sql3 = getSQL(SEL_JOBINFO);
		System.out.println(sql3);
		 */
	}

	
	// 문자열 입력받는 변수
	public void getInput() {
		// Scanner를 이용해서 문자열을 입력받고
		// 각 문자열들마다 입력받을 내용도 또 받아서 실행시켜주는 함수
		
		// 작업순서
			// 입력받을 준비
		Scanner sc = new Scanner(System.in);
			// 메세지 출력
		System.out.print("부서번호로 조회 : dno\n직급으로 조회 : job\n모든사원 조회 : all\n프로그램 종료 : exit\n명령 입력 : ");
		String str = sc.nextLine();
		
		switch(str) {
		case "dno":
			getDnoInfo(sc);
			break;
		case "job":
			getJobInfo(sc);
			break;
		case "all":
			getAll();
		case "exit":
			System.out.println("*** 프로그램을 종료합니다. ***");
			sc.close();
			return;
		}

		sc.close();
	}
	
	// 직급을 입력받아서 해당 직급의 사원들의 정보를 조회해주는 함수
	public void getJobInfo(Scanner sc) {
	// 할일
		// 메세지 출력하고
			/*
			 	Bouns)	먼저 emp 테이블에 있는 직급을 모두 조회해서 출력하세요.
			 */
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pw = "tiger";
		String sql;
		try {
			con = DriverManager.getConnection(url, user, pw);						
			sql = eSQL.getSQL(eSQL.SEL_JOB);
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String job_list = rs.getString("job");
				
				System.out.printf("%10s | ", job_list);
			}
			System.out.println();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 직급 입력받고
		System.out.println("조회할 직급을 입력하세요!\n이전 단계는 quit을 입력하세요!");
		
		System.out.print("조회할 직급 : ");
		String job = sc.nextLine();
		if(job.equals("quit")){
			return;
		} 
		// 데이터베이스 작업
		try {
/*			// 커넥션 꺼내오고
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);	*/
			// 질의명령 가져오고
			sql = eSQL.getSQL(eSQL.SEL_JOBINFO);
			// 명령전달도구 준비하고
			pstmt = con.prepareStatement(sql);
			
			// 질의명령 완성하고
			pstmt.setString(1, job);		// 첫번째 ?에 job을 채워주세요.
			
			// 질의명령 보내고 결과받고
			rs = pstmt.executeQuery();
			
			// 결과에서 데이터 꺼내서 출력하고
			while(rs.next()) {
				// 필드의 데이터 꺼낸다.
				int emp = rs.getInt("empno");
				String name = rs.getString("ename");
				job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				int grade = rs.getInt("grade");
				String comm = rs.getString("comm");

				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 DD일");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				String sdate = form1.format(hdate) + form2.format(htime);
				
				// 출력
				System.out.printf("| %5d | %10s | %10s | %24s | %6d | %2d | %7s |\n", 
													emp, name, job, sdate, sal, grade, comm);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				pstmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}
	
	// 부서번호를 입력받아서 해당부서의 사원들을 조회해주는 함수
	public void getDnoInfo(Scanner sc) {
		// 할일
		// 메세지 출력하고	+ 부서번호와 부서명 알려주기
		
		while(true){
			System.out.println("부서번호를 입력하세요! 이전 단계는 -1을 입력하세요.");
			String sql;
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			try {
				// 따라서 데이터베이스에 접속하고	<- Connection
				
				con = DriverManager.getConnection(url, user, pw);
				sql = eSQL.getSQL(eSQL.SEL_DEPT);	// 부서 정보 추출
				
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					int deptno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					
					System.out.printf("|%3d - %10s ",deptno, dname);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("|");
			System.out.print("부서번호 : ");
			// 예시 보여주고 부서번호 입력
			int no = sc.nextInt();	// 줄바꿈 기호 남아있음
			sc.nextLine();// 줄바꿈기호 없애기
			if(no == -1) {
				// 이 경우는 이전 단계로 이동하길 원하는 경우이므로
				// 이 함수의 실행을 즉시 종료한다.
	
				return;
			}
			// 이 경우는 부서번호를 입력받은 경우이므로
			// 부서번호에 소속된 사원들의 정보를 조회하면 된다.
			try {
				
				// 질의명령 가져오고
				con = DriverManager.getConnection(url, user, pw);
				sql = eSQL.getSQL(eSQL.SEL_DNOINFO);
				// 명령전달도구 만들고
					// <-- 위에서 가져온 질의명령에는 ? 로 되어있는 부분을 데이터로 채워야하는
					//		불완전한 질의명령이다.
					//		이 대 사용하는 명령 전달 도구는 PreparedStatement를 사용한다.
				pstmt = con.prepareStatement(sql);
				// 질의 명령을 완성하고
				pstmt.setInt(1, no);
				/*
				 		만약 질의 명령이
				 			SELECT
				 				empno, ename
				 			FROM
				 				emp
				 			WHERE
				 				SAL >= ?
				 				AND deptno = ?
				 			라고 가정하면
				 			이 때
				 				SAL >= ?	의 ?의 위치값이 1이고
				 				deptno = ?	의 ? 위치값이 2가 된다.
				 */
				// 질의명령 보내고 결과(ResultSet) 받고
				rs = pstmt.executeQuery();
				// 꺼내서 출력하고
				while(rs.next()) {	// 레코드 포인터 한줄 내리고.. ( EOF로 이동하면 false 를 반환해준다. )
					// 데이터 추출하고
					int eno = rs.getInt("empno");
					String ename = rs.getString("ename");
					String job = rs.getString("job");
					Date hdate = rs.getDate("hiredate");
					Time htime = rs.getTime("hiredate");
					int sal = rs.getInt("sal");
					int dno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
	
	
					SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 DD일");
					SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
					/*
				 	import java.text.*;
				 	날짜 데이터를 원하는 문자열로 바꿔주는 형식화 클래스
				 		SimpleDateFormat form = new SimpleDateFormat(날짜형식문자열);
				 		String sdate = form.format(hdate);				 		
				 */
				
					String sdate = form1.format(hdate) + form2.format(htime);
					
					// 출력
					System.out.printf("| %5d | %10s | %10s | %24s | %6d | %2d | %10s | %8s |\n", 
														eno, ename, job, sdate, sal, dno, dname, loc);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					stmt.close();
					pstmt.close();
					con.close();
				}catch(Exception e) {}
				
			}
		}
	}
	
	//	모든 사원의 정보를 출력해주는 기능의 함수
	public void getAll() {
		// 할일
		try {
			// 질의명령을 준비하고
			String sql = eSQL.getSQL(eSQL.SEL_ALL);	// 질의명령 가지고 오고
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			// 질의명령 가져오고
			con = DriverManager.getConnection(url, user, pw);
				// 명령 전달 도구 준비 
			stmt = con.createStatement();
			//	질의명령을 보내고 결과를 받아서
			rs = stmt.executeQuery(sql);
			// 결과 출력
				// 몇행을 꺼내왔는지 알 수 없으므로 반복
			while(rs.next()) {
				// empno, ename, job, hiredate
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
					/*
					 	JDBC에서는 데이터베이스에서 날짜데이터를 꺼내올 때
					 	날짜와 시간을 따로 꺼내오도록 함수를 분리해서 만들어놨다.
					 */
				// 날짜데이터
				Date hdate = rs.getDate("hiredate");	// 날짜만 꺼내오는 함수
				Time htime = rs.getTime("hiredate");	// 시간만 꺼내오는 함수
				SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 DD일");
				SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
				/*
			 	import java.text.*;
			 	날짜 데이터를 원하는 문자열로 바꿔주는 형식화 클래스
			 		SimpleDateFormat form = new SimpleDateFormat(날짜형식문자열);
			 		String sdate = form.format(hdate);				 		
			 */
			
				String sdate = form1.format(hdate) + form2.format(htime);
				
				// 출력
				System.out.printf("| %5d | %10s | %10s | %24s |\n", 
													eno, name, job, sdate);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {}
		}
		// 이 함수에서는 데이터베이스에 연결해서
		
		// 질의명령을 보내고
		// 결과를 보내고
	}
	
	public static void main(String[] args) {
		new Jdbctest01();
	}

}

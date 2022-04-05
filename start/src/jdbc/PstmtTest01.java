package jdbc;

import java.sql.*;
import java.util.*;
	// 스캐너용

/*
 		이 클래스는
 		오라클에 있는 emp 테이블에서 부서번호가 ?? 번인 사원들의 정보를 조회해서 출력해주는 기능을 가진 클래스
		따라서 이 클래스는 객체가 되는 순간 데이터베이스에 여녈할 준비가 되어있어야 한다.
			-> 드라이버 로딩이 끝난 상태가 되어야 할 것이다.
 */

public class PstmtTest01 {
	// 사용할 변수 선언
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public PstmtTest01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 부서번호를 입력하세요! : ");
		int dno = sc.nextInt();
		
		// 작업순서
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 커넥션 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			
			con = DriverManager.getConnection(url, user, pw);
				// 이 명령이 정상적으로 실행되면 오라클에서 세션하나를 
			// 3. 질의명령 준비
			
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT " );
			buff.append("	empno eno, ename, job, mgr, TO_CHAR(hiredate, 'YYYY/MM/dd') hdate, deptno dno " );
			buff.append("FROM " );
			buff.append("	emp " );
			buff.append("WHERE " );
			buff.append("	deptno = ? " );

			String sql = buff.toString();
			
			// 4. 명령 전달 도구 준비
				/*
					Statement
						-> 프로그램에서 JDBC 명령을 전달하는 도구
							이때  사용해야되는 질의명령은 완벽한 질의명령이어야 한다.
							
						우리의 경우는 매번 부서번호를 정해서 바꿔야하는 불완전한 질의명령이다.
						이럴 때 사용하는 명령전달도구로 PreparedStatement가 있다
				 */
			pstmt = con.prepareStatement(sql);
				 /*
				  	명령전달 도구는 준비가 되어있지만
				  	도구 안에 셋팅된 질의명령은 아직 완벽한 질의명령은 아니다
				  	따라서 질의명령을 완벽하게 만들어 줘야한다.
				  	완벽한 질의명령으로 만드는 방법은 ?에 정확한 데이터를 채워주면 된다.
				  */
			/*
			 	불완전한 질의명령(? 있는 질의명령) 데이터를 채우는 방법
			 		문자열인 경우
			 			pstmt.setString(위치값, 데이터);
			 		정수(int)인 경우
			 			pstmt.setInt(위치갑스 데이터);
			 */
			pstmt.setInt(1, dno);;
			// 질의 명령이 완성됐으므로 JDBC에게 전달하고 결과를 받는다
			rs = pstmt.executeQuery();
				// 몇 사람이 조회될지 알 수 없으므로
			while(rs.next()) {
				// rs.next() -> 작업실행줄을 한줄 내려주는 함수
				// 이 때 내린 결과 꺼내올 데이터가 있으면 true를 반환해준다 없으면 false
				int eno = rs.getInt("eno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hdate = rs.getString("hdate");
				dno = rs.getInt("dno");
				
				System.out.printf("%5d, -%15s -%10s -%5d -%10s -%4d\n", eno, name, job, mgr, hdate, dno);
			}
			//출력
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				// 선언한 역순으로 close
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PstmtTest01();
	}

}

package jdbc;
// JDBC 사용을 위한 클래스를 준비한 패키지를 임포트
import java.sql.*;

public class Test01 {

	public Test01() {
		try {
			/*
					1. JDBC와 외부 데이터베이스를 연결할 드라이버를 프로그램에서 가져오기
							-> 외부 클래스를 로딩하는 함수 
								Class.forName()
							드라이버마다 외부 클래스의 이름이 조금씩 다르다.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 위 명령을 실행하면 JDBC가 해당 드라이버를 이용해서 연결을 시도한다.
			System.out.println("*****	드라이버 로딩 성공	*****");
			/*	오라클에 접속을 시도 -> 각각의 DBMS마다 접속하는 방법(URL)이 조금씩 차이가 난다.
				이 때는 구글선생님이 도와준다.
					접속하는 명령어는 JDBC에게 명령하면 된다.
			 			DriverManager.getConnection();	
					참고)
						오라클에서는 DBMS와의 연결을 세션이라고 표현하지만
						JDBC에서는 커넥션(Connection)이라고 부른다.		*/
			String url = "jdbc:oracle:thin:@localhost:1521:xe";	// 쓸거면 외우기 = url은 데이터베이스마다 다르니 찾아서 사용
										// ㄴ 오라클 저장된 IP 주소 : 포트번호 : 데이터베이스 ID
			Connection con = DriverManager.getConnection(url, "scott","tiger");
													//	url		계정이름	비밀번호
			System.out.println("## 접속 성공 ##");
			/*	 이처럼 접속을 하면 접속자가 관리하는 세션을 제공하게 된다.
				 이 세션을 관리하는 클래스가 바로 Connection 이다.
				 여기까지 데이터베이스들마다 조금씩 달라지고..
			 3. 명령 전달 도구를 만든다.
					형식) Statement stmt = con.createStatement();		*/
			Statement stmt = con.createStatement();
			
				// emp 테이블의 ename을 모두 조회해보기
			String sql = "SELECT * FROM emp WHERE ename = 'SMITH'";
			
			//	4. 질의명령이 준비가 됐으면 전달도구에 실어서 보내면 된다. JDBC한테 ...
			ResultSet rs = stmt.executeQuery(sql);
			/*
			 	명령을 전달하고 조회된 결과를 받아오는 함수
			 		stmt.executeQuery(sql);
			 		
			 	함수 실행의 결과는 ResultSet 타입의 데이터로 반환된다.
			 	ResultSet은 조회질의명령의 결과를 관리하는 클래스...
			 */
			// 결과가 여러 행이므로 반복해서 처리
			
			while(rs.next()){
				String name = rs.getString("ename");
				int empno = rs.getInt("empno");
				// 출력
				System.out.println(empno+" : "+name);
			}
			rs.close();
			stmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}

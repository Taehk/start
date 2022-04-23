package githrd.dao;

import java.util.ArrayList;
import java.sql.*;
import githrd.sql.*;
import githrd.db.*;

import githrd.vo.*;

public class MemberDao {
	private JenyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new JenyJDBC();
		mSQL = new MemberSQL();
	}
	
	// 회원번호와 아이디 조회
	public ArrayList<MemberVO> getNOID(){
		//할일
		// 반환값 변수 만들고
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		// 커넥션을 가져온다.
		con = db.getCon();
		
		// 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ALL_NOID);
		
		// 명령전달 도구
		stmt = db.getStmt(con);
		
		try {
			// 질의 명령 보내고 결과 받고
			rs = stmt.executeQuery(sql);
			// 데이터추출
			while(rs.next()) {
				// 한명의 데이터를 저장할 VO를 new 시키고
				MemberVO mVO = new MemberVO();
				
				// 데이터를 꺼내고
				int mno = rs.getInt("mno");
				String id = rs.getString("id");
				
				// VO에 채우고
				
				mVO.setMno(mno);
				mVO.setId(id);
				
				// list에 채우기
				list.add(mVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;		
	}
	
	// 회원번호 입력하면 해당 회원의 정보 출력
	public MemberVO getMnoInfo(int get_mno) {
		// 반환값 변수
		MemberVO mVO = new MemberVO();
		// 커넥션 꺼내기
		con = db.getCon();
		
		// 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_MNO_ALL);
		
		// 명령 전달 도구 준비
		pstmt = db.getPstmt(con, sql);
		
		try {
			// 질의명령 보내고 결과 받고
			pstmt.setInt(1, get_mno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				// 데이터를 꺼내고
				int mno = rs.getInt("mno");
				String name = rs.getString("name");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String mail = rs.getString("mail");
				String tel = rs.getString("tel");
				int avt = rs.getInt("avt");
				String gen = rs.getString("gen");
				Date jdate = rs.getDate("joindate");
				Time jtime = rs.getTime("joindate");
				String isshow = rs.getString("isshow");
				
				// VO에 채우고
				mVO.setMno(mno);
				mVO.setName(name);
				mVO.setId(id);
				mVO.setPw(pw);
				mVO.setMail(mail);
				mVO.setTel(tel);
				mVO.setAno(avt);
				mVO.setGen(gen);
				mVO.setIsshow(isshow);
				mVO.setJdate(jdate);
				mVO.setJtime(jtime);
				mVO.setSdate();
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return mVO;
	}
	
	// 아이디 입력해서 회원의 전화번호 수정
	public int updateTEL(String id) {
		// 할일
		int cnt = 0;
		// 커넥션 꺼내기
		con = db.getCon();
		// 질의명령 꺼내기
		String sql = mSQL.getSQL(mSQL.UPDATE_ID_TEL);
		// 명령 전달 도구 꺼내오기
		pstmt = db.getPstmt(con, sql);
		try {
			// 질의 명령 완성하기
			pstmt.setString(1, id);
			
			// 질의명령 보내고 결과 받기
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// 회원 가입 처리
	public int register(MemberVO memb) {
		int cnt = 0;
		// 신규 회원 데이터 추가
			// 데이터 꺼내기
		// name, id, pw, mail, tel, avt, gen
		String name, id, pw, mail, tel, gen;
		int avt, mno;
		name = memb.getName();	// pstmt 1
		id = memb.getId();		// pstmt 2
		pw = memb.getPw();		// pstmt 3
		mail = memb.getMail();	// pstmt 4
		tel = memb.getTel();	// pstmt 5
		avt = memb.getAno();	// pstmt 6
		gen = memb.getGen();	// pstmt 7
		mno = memb.getMno();
		
		// 커넥션 꺼내기
		con = db.getCon();
		// 질의명령 꺼내기
		String sql = mSQL.getSQL(mSQL.INSERT_INFO_MEM);
		// 명령 전달도구 꺼내오기
		pstmt = db.getPstmt(con, sql);
		try {
			// 질의명령 완성하기
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, mail);
			pstmt.setString(5, tel);
			pstmt.setInt(6, avt);
			pstmt.setString(7, gen);
			pstmt.setInt(8, mno);
			
			// 질의명령 보내고 결과받기
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
}
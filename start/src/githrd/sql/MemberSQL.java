package githrd.sql;

public class MemberSQL {
				// 		입력 결과
	public final int SEL_ALL_NOID		= 1001;
		// 회원번호와 아이디 조회해서 출력
	
	public final int SEL_MNO_ALL		= 1002;
		// 회원번호 입력하면 해당 회원의 정보 출력
	
	public final int UPDATE_ID_TEL		= 2001;
		// 아이디 입력 -> 전화번호 수정(010-1212-1212)
	
	public final int INSERT_INFO_MEM	= 3001;
		// scanner로 회원정보 입력 -> 회원가입 처리

	public String getSQL(int code) {
		// 입력받은 코드에 따라 질의명령 반환
		StringBuffer buff = new StringBuffer();
		
		// 코드값에 따른 질의문 switch
		switch(code){
			case SEL_ALL_NOID:
				buff.append("SELECT ");
				buff.append("	mno, id ");
				buff.append("FROM ");
				buff.append("	member ");
				break;
			case SEL_MNO_ALL:
				buff.append("SELECT ");
				buff.append("	mno, name, id, pw, mail, tel, avt, gen, joindate, isshow ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	mno = ? ");
				break;
			case UPDATE_ID_TEL:
				buff.append("UPDATE ");
				buff.append("	member ");
				buff.append("SET ");
				buff.append("	tel = '010-1212-1212' ");
				buff.append("WHERE id = ? ");
				break;
			case INSERT_INFO_MEM:
				buff.append("INSERT INTO member ");
				buff.append("( ");
				buff.append("	name,	id,	pw, ");
				buff.append("	mail,	tel,	avt,	gen, mno ");
				buff.append(") ");
				buff.append("VALUES ");
				buff.append("( ");
				buff.append("	?,	?,	?, ");
				buff.append("	?,	?,	?,	?, ? ");
				buff.append(") ");
				break;
		}
		
		String sql = buff.toString();
		return sql;
	}

}

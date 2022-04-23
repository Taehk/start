package empProj.controller;

import empProj.dao.*;
import empProj.vo.*;

import java.util.*;

public class JEmpCont {
	private JEmpDao jDao;
	public JEmpCont() {
		jDao = new JEmpDao();
		
		// jemp 테이블이 없는 경우에는 테이블을 생성하고
		// 이미 있는 경우에는 건너 뛰도록
		int cnt = jDao.tabCnt();
		if(cnt == 0) {
			// emp 테이블을 복사해서 jemp테이블을 만드세요.
		jDao.addJEmp();
		} else if(cnt == 1) {
			System.out.println("*** 테이블이 이미 존재합니다.");
		}
		
		
		// 추가된 사원의 정보를 조회해서 출력하세요.
		printEMP(jDao.selLast());
		
		delD30();
	}
	
	// 조회된 사원 정보 출력 함수
	public void printEMP(EmpVO eVO) {

		String sel_name = eVO.getEname();
		String sel_job = eVO.getJob();
		String sel_date = eVO.getSdate();
		int sel_dno = eVO.getDeptno();
		System.out.println("^	사원명	: "+sel_name);
		System.out.println("^	번호	: "+sel_dno);
		System.out.println("^	직급	: "+sel_job);
		System.out.println("^	입사일	: "+sel_date);
		
		
	}
	
	public static void main(String[] args) {
		new JEmpCont();
	}
	/*
		테이블의 데이터삭제는 원칙적으로는
		트리거가 처리하는 것이 원칙이다.
		
		여기서는 질의명령을 통해 수동으로 처리하기로 해보자
		
		삭제 명령의 순서
		1. 데이터를 백업테이블에 백업
		2. 테이블에서 데이터 삭제
		
		따라서 데이터베이스의 작업이 두 번 실행되어야 하고
		결과적으로 질의명령이 2개가 작성되어야 한다.
		
		여기서는 JEMP테이블의 30번 부서 사원들을 삭제해보기로 함
*/
	public void delD30() {
	// 먼저 백업
		int cnt = jDao.backupDno30();
		// 결과출력
		System.out.println("30번 부서원 "+cnt+"명의 데이터를 백업했습니다.");
		
		// 삭제
		int result = jDao.delDno30();
		System.out.println(30+"번 부서원 "+result+"명의 데이터를 사원 테이블에서 삭제하였습니다.");
		
		
		if(cnt==result) {	// 백업과 삭제 갯수가 동일
			System.out.println("퇴사처리가 정상적으로 완료되었습니다.");
		}else {
			System.out.println("퇴서처리 작업에 문제가 있습니다.");
		}
	}
}

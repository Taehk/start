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
		
		// Jennie 데이터를  추가해보자. 이름, 직급, 부서번호
		String name = "JENNIE";
		String job = "MANAGER";
		int dno = 40;
		// vo 만들고
		EmpVO eVO = new EmpVO();
		// 데이터 채우고
		eVO.setEname(name);
		eVO.setJob(job);
		eVO.setDno(dno);
		
		// 데이터베이스 작업 함수 호출...
		int result = jDao.insertJemp(eVO);
		if(result == 1) {
			System.out.println("### "+name+"사원의 데이터 입력에 성공했습니다.");
		}else {
			System.out.println("### "+name+"사원 추가가 실패했습니다.");
		}
		
		// 추가된 사원의 정보를 조회해서 출력하세요.
		printEMP(jDao.selLast());
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

}

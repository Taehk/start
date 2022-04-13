package empProj.controller;

import java.util.*;

import empProj.dao.*;
import empProj.vo.*;

public class EmpController {
	private EmpDao eDao;
	
	public EmpController() {
		eDao = new EmpDao();
		
		// 모든 사원의 정보를 조회
		ArrayList<EmpVO> list = eDao.getAll();
		for(EmpVO e : list) {
			System.out.println(e);
		}
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		// 20부서를 입력해서 부서원들의 정보를 조회
		ArrayList<EmpVO> list1 = eDao.getDnoInfo(20);
		for(EmpVO e : list1) {
			System.out.println(e);
		}
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		// SALESMAN 직급을 가진 사원들의 정보 조회
		ArrayList<EmpVO> list2 = eDao.getJobInfo("SALESMAN");
		for(EmpVO e : list2) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		new EmpController();
	}

}
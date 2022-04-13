package empPorj.controller;

import java.util.*;

import empPorj.vo.*;
import empPorj.dao.*;

public class EmpController {
	private EmpDao eDao;

	public EmpController() {
		eDao = new EmpDao();
		ArrayList<EmpVO> list = eDao.getAll();
		System.out.println(list);
		
		// 20부서 직원 조회
		
		// SALESMAN 직급을 가진 사원 조회
	}

	public static void main(String[] args) {
		new EmpController();
	}

}

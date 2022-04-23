package githrd.controller;

import java.util.ArrayList;
import java.util.*;

import githrd.dao.*;
import githrd.vo.*;

public class MemberController {
	private MemberDao mDao;
	
	public MemberController() {
		mDao = new MemberDao();
		
		// 회원번호 아이디 조회
		ArrayList<MemberVO> list = mDao.getNOID();
		for(MemberVO m : list) {
			System.out.println(m);
		}

		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		// 회원번호 1001를 입력해서 회원 정보 출력
			// 회원번호는 PK니까 vo하나만 들고 오면 된다.
		System.out.println("수정 전");
		MemberVO mVO = mDao.getMnoInfo(1001);
		System.out.println(mVO);
		
		// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해오는 함수
		String update_id = "jennie";
		int cnt = mDao.updateTEL(update_id);
		if(cnt == 1) {
			System.out.println(update_id+"의 전화번호가 수정되었습니다.");
			System.out.println("수정 후");
			mVO = mDao.getMnoInfo(1001);
			System.out.println(mVO);
		}
		else System.out.println("수정이 되지 않았습니다.");
		
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");
		
		// scanner로 회원정보를 입력받아서 회원가입을 처리해주는 함수
//		Scanner sc = new Scanner(System.in);
//		MemberVO new_memb = newMemb(sc);
		cnt = mDao.register(anno());
		if(cnt == 1) {
			System.out.println("회원가입이 정상적으로 처리되었습니다.");
			list = mDao.getNOID();
			System.out.println(mDao.getMnoInfo(((list.get(list.size()-1)).getMno())));
		}else {
			System.out.println("회원가입에 오류가 생겨 처리할 수 없습니다.");
		}
	}
	
	// 입력귀찮아서 그냥 VO에 넣는 함수
	public MemberVO anno() {
		MemberVO new_memb = new MemberVO();

		// 전체 회원 번호 중 마지막 회원(최근 추가회원)의 
		//		회원번호의 + 1
		ArrayList<MemberVO> list = mDao.getNOID();
		new_memb.setMno((list.get(list.size()-1)).getMno()+1);
		new_memb.setName("RO");
		new_memb.setId("ro12");
		new_memb.setPw("12125");
		new_memb.setMail("taehk10@gmail.com");
		new_memb.setTel("010-5123-1237");
		new_memb.setAno(10);
		new_memb.setGen("M");
		
		return new_memb;
	}
	
	// 회원정보 입력받고 VO에 넣어둔 함수
	public MemberVO newMemb(Scanner sc) {
		MemberVO new_memb = new MemberVO();
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("아이디를 입력해주세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요 : ");
		String pw = sc.nextLine();
		System.out.print("이메일 입력해주세요 : ");
		String mail = sc.nextLine();
		System.out.print("전화번호를 입력해주세요 : ");
		String tel = sc.nextLine();
		System.out.print("아바타번호를 입력해주세요 : ");
		int avt = sc.nextInt();
		System.out.print("성별을 입력해주세요(M, F) : ");
		String gen = sc.nextLine();
		
		// 전체 회원 번호 중 마지막 회원(최근 추가회원)의 
		//		회원번호의 + 1
		ArrayList<MemberVO> list = mDao.getNOID();
		new_memb.setMno((list.get(list.size()-1)).getMno()+1);
		new_memb.setName(name);
		new_memb.setId(id);
		new_memb.setPw(pw);
		new_memb.setMail(mail);
		new_memb.setTel(tel);
		new_memb.setAno(avt);
		new_memb.setGen(gen);
		
		return new_memb;
	}
	
	
	
	public static void main(String[] args) {
		new MemberController();
	}

}

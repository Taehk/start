package day16;
import java.util.*;

public class Test06 {

	/*
	 	전화번호 프로그램 작성
	 	추가될 친구들 그룹, 이름, 전화번호로 입력
	 	그룹 = 친구, 회사, 웬수
	 	친구 - (제니 : 010-1111-11111) (지수 : 010-2222-2222)...
	 		2중 Map으로 만들기
	 */

	// 그룹 관리 맵
	HashMap groupMap = new HashMap();
	
	// 새로운 그룹을 만들어주는 함수
	public void makeGroup(String name) {
		// 그룹 이름을 알려주면 그 그룹을 만들어주는 함수
		// 입력받은 이름에 해당하는 그룹이 없으면 만들기
		if(!groupMap.containsKey(name)) {
			groupMap.put(name,  new HashMap());
		}
	}
	
	// 친구를 등록하는 함수
	public void setFriend(String group, String name, String tel) {
		// 등록될 친구이름 그룹명, 전화번호를 알려주면 저장 + 등록하는 그룹이 Map에 존재하지 않으면 group생성하는 함수
		makeGroup(group);
		
		// 이 친구를 등록할 그룹의 해당 맵을 알아낸다
		HashMap tmp = (HashMap)groupMap.get(group);
		// 이 친구를 맵에 등록한다.
		tmp.put(name, tel);
	}
	
	// 한 사람만 꺼내는 함수
	public void getPerson(String group, String name) {
		// 특정 그룹의 특정 사람을 꺼내달라고 하면
		
		// 1. 꺼내야할 그룹을 알아내고
		HashMap tmp = (HashMap) groupMap.get(group);
		// 2. 그 그룹에서 친구의 정보를 꺼낸다.
		String tel = (String)tmp.get(name);
		
		// 출력
		System.out.println(name+" : "+tel);
	}
	
	// 특정 그룹의 전체를 알아내는 함수
	public void getGroup(String group) {
		// 할일
		// 1. 꺼낼 그룹의 맵을 알아낸다.
		HashMap tmp = (HashMap)groupMap.get(group);
		// 그룹 내 몇명이 누가 들어있는지 알 수 없으므로
		// 키 값만 꺼내와서
		Set set = tmp.keySet();
		// 꺼내온 키 값으로 데이터를 꺼낸다.
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			String key = (String) itor.next();
			String value = (String)tmp.get(key);
			System.out.println(key+" : "+value);
		}
		
	}
	
	public Test06() {
		setFriend("친구", "제니", "010-1111-1111");
		setFriend("친구", "로제", "010-2222-2222");
		setFriend("친구", "지수", "010-3333-3333");
		setFriend("친구", "리사", "010-4444-4444");
		
		setFriend("웬수", "정은", "010-1234-1234");

		getGroup("친구");
		getGroup("웬수");
		
		getPerson("친구", "제니");
	}
	
	
	public static void main(String[] args) {
		new Test06();
	}


}
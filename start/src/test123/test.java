package test123;

import java.util.*;


public class test {

	public test() {
	}

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "24");
		map.put("성별", "남자");
		
		Set key = map.keySet();
		Iterator itor = key.iterator();
		
		while(itor.hasNext()){
			String k = (String)itor.next();
			String value = map.get(k);
			System.out.println(k + " - " + value);
		}
	}
}
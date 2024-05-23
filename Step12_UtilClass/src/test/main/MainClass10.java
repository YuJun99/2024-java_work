package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		//1. 세명의 회원정보 ( 번호, 이름, 주소) 를 HashMap 객체를 생성해서 담아 보세요
		//HashMap 객체 하나당 한명의 회원정보를 담으니깐 총 3개의 HashMap 객체가 생성이 되어야 합니다.
		Map<String, Object> mem1 = new HashMap<String, Object>();
		mem1.put("num", 1);
		mem1.put("name", "김구라");
		mem1.put("addr", "노량진");
		
		Map<String, Object> mem2 = new HashMap<String, Object>();
		mem2.put("num", 2);
		mem2.put("name", "해골");
		mem2.put("addr", "동작구");
		
		Map<String, Object> mem3 = new HashMap<String, Object>();
		mem3.put("num", 3);
		mem3.put("name", "돌맹이");
		mem3.put("addr", "강남구");
		// 2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체를 생성해 보세요.
		List<Map<String, Object>> members = new ArrayList<>();
		// 3. ArrayList 객체에 HashMap 객체 3개를 담아 보세요.
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		// 4. 반복문 돌면서 ArrayList 에 담긴 회원정보를 콘솔창에 이쁘게 출력해 보세요.
		for (int i = 0; i < members.size(); i++) {
			System.out.printf("번호: %d 이름: %s 주소: %s",
					members.get(i).get("num"),
					members.get(i).get("name"),
					members.get(i).get("addr"));
			System.out.println("");
		}
//		for (Map<String, Object> map : members) {
//			String info = String.format("번호: %d 이름: %s 주소: %s",
//					(int)map.get("num"), (String)map.get("name"), (String)map.get("addr"));
//			System.out.println(info);
//		}
		
	}
}

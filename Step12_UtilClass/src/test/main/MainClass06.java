package test.main;

import java.util.ArrayList;

import test.mypac.MemberDto;

import java.util.*;



public class MainClass06 {
	public static void main(String[] args) {
		// 1. MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아 보세요
		List<MemberDto> members = new ArrayList<>();
		// 2. 3명의 회원 정보를 MemberDto 객체에 각각 담아 보세요. (MemberDto 객체는 3개가 생성되어야 함)
//		MemberDto m1 = new MemberDto(1, "김구라", "노량진");
		MemberDto m1 = new MemberDto();
		MemberDto m2 = new MemberDto(2, "해골", "행신동");
		MemberDto m3 = new MemberDto(3, "아무개", "동작구");
		
		m1.setNum(1);
		m1.setName("김구라");
		m1.setAddr("노량진");
		
		
		// 3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아 보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		// 4. 반복문을 이용해서 members 에 들어 있는 회원정보를 출력해 보세요.
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).getNum() +" "+ members.get(i).getName() +" "+ members.get(i).getAddr());
		}
		
		/*
		 * 	String 클래스의 format() 이라는 static 메소드를 이용하면
		 * 	원하는 문자열 형식을 좀 더 간편하게 얻어낼 수 있다.
		 * 
		 * %d => 숫자 출력할 때
		 * %s => 문자열 출력할 때
		 * %f => 실수
		 * %b => boolean
		 * %% => % 자체를 출력할 때
		 */
		for(MemberDto tmp:members) {
			String info = String.format("번호:%d  이름:%s  주소:%s", 1, "김구라", "노량진");
			System.out.println(info);
		}
		
		Object a = 1;
		Object b = "kim";
		
		
		test();
		test("hi");
		test("hi", "hello");
		test("hi", "hello", "bye");
	}
	
	//테스트용 메소드
	public static void test(String... msg) {
		//msg 는 String[] type 이다.
		String[] a = msg;
		for(String tmp:msg) {
			System.out.println(tmp);
		}
	}
}

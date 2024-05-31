package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		//만일 4번 회원을 삭제하려면?
		int num = 4;
		
		MemberDao dao = new MemberDao();
		dao.delete(num);
		
		// 이름 : batman, 주소 : hollywood 회원 정보를 DB 에 저장해보세요.
		
		MemberDto dto = new MemberDto();
		dto.setName("batman");
		dto.setAddr("hollywood");
		
		dao.insert(dto);
		
		// 1번 회원의 이름을 acorn 주소를 강남 으로 수정해보세요.
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("acorn");
		dto1.setAddr("강남");
		dao.updtate(dto1);
	}
}

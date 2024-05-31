package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정. 번호는 시퀀스로 넣기 (member_seq.NEXTVAL)
		String name = "덩어리";
		String addr = "상도동";
		
		//추가할 회원의 정보를 MemberDto 객체에 담는다.
		MemberDto dto1 = new MemberDto(0, name, addr);
//		dto1.setName(name);
//		dto1.setAddr(addr);
		//insert() 메소드를 호출하면서 MemberDto 객체의 참조값을 전달한다.
		
//		MainClass07. 생략됨
		insert(dto1);
	}
	
	//회원정보를 DB에 저장해주는 static 메소드
	public static void insert(MemberDto dto) {
		//dto 에 추가할 회원의 이름과 주소가 들어 있다는 가정하에서 메소드를 완성해 보세요.
		
		Connection conn = null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호":db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		try {
			
			String sql = "INSERT INTO member(num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(, dto.getNum());
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			pstmt.executeQuery();
			System.out.println("완료했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


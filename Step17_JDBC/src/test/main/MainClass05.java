package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정. 번호는 시퀀스로 넣기 (member_seq.NEXTVAL)
		String name = "원숭이";
		String addr = "동물원";
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {e.printStackTrace();}
		
		PreparedStatement pstmt = null;
		try {
			String sql = "INSERT INTO MEMBER(NUM, NAME, ADDR)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
//			pstmt.setInt(1, member_seq.NEXTVAL);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			
			pstmt.executeQuery();
			System.out.println("회원정보를 추가했습니다.");
		}catch(Exception e) {e.printStackTrace();}
	}

}


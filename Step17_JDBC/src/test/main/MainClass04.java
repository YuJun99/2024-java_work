package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass04 {
	public static void main(String[] args) {
		//삭제할 회원의 PK 라고 가정
		int num = 1;
		
		//실제 삭제하는 프로그래밍을 해 보세요.
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e) {e.printStackTrace();}
		
		PreparedStatement pstmt = null;
		try {
			String sql = "DELETE MEMBER"
					+ " WHERE NUM = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			
			pstmt.executeQuery();
			System.out.println("회원정보가 삭제되었습니다.");
		}catch(Exception e) {e.printStackTrace();}
	}
}

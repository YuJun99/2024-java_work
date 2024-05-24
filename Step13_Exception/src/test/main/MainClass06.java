package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		//문자열 안에서 역슬래시(\)는 특별한 기호이다.
		System.out.println("main 메소드가 \"시작\" 되었습니다!");
		
		// C:\Users\\user\playground\myFolder\memo.txt 파일에 관련된 작업을 할 수 있는 File 객체
		
		//	File 객체의 메소드를 활용해서
		//	실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		//	존재하면 memo.txt 파일을 삭제하도록 프로그래밍해 보세요.
		
		// 파일 구분자를 /로 작성을 해도 File 객체 내부에서 알아서 처리
		File f = new File("C:/Users\\user/playground\\myFolder\\memo.txt");
		try {
			boolean isExist = f.exists();
			if(isExist == true) {
				f.delete();
				System.out.println("삭제 완료");
			}
			else if(isExist == false) {
				f.createNewFile();
				System.out.println("생성 완료");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//문자열 안에서 역슬래시를 인식 시키고 싶으면 두 개를 작성
		System.out.println("main 메소드가 \\종료\\ 됩니다.");
	}
}

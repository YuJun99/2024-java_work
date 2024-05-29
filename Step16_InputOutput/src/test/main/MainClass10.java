package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass10 {
	public static void main(String[] args) {
		try {
			//File 로 부터 byte 알갱이를 읽어들일 객체
			var fis = new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			//byte 알갱이를 File 에 출력할 객체 생성
			var fos = new FileOutputStream("C:/Users/user/playground/myFolder/copied.jpg");
			while(true) {
				//1 byte 읽어 들여서
				int readedByte = fis.read();
				System.out.println(readedByte);
				//만일 더 이상 읽을 byte 가 없다면 반복문 탈출
				if(readedByte == -1)break;
				//읽어 들인 1 byte 를 출력
				fos.write(readedByte);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다");
			//마무리 작업
			fos.close();
			fis.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

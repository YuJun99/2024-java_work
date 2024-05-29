package test.main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수를 미리 만들고
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			//파일에서 읽어들을 객체
			fis = new FileInputStream("C:/Users/user/playground/myFolder/member.dat");
			//객체를 읽어들이는 객체
			ois = new ObjectInputStream(fis);
			//Object type 으로 리턴되는 값을 원래 type 으로 casting 해서 읽어온다.
			MemberDto dto = (MemberDto)ois.readObject();
			String info = String.format("번호:%d, 이름:%s, 주소:%s", dto.getNum(), dto.getName(), dto.getAddr());
			System.out.println(info);
			System.out.println("파일에 객체를 읽어왔습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			}catch(Exception e) {}
		}
	}
}

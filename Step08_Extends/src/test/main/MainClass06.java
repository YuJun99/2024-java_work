package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		
		//핸드폰 객체가 하나 있다고 가정하자
		HandPhone p1 = new HandPhone(); // new AndroidPhone(); 이라면 강제 형 변환을 통해 메소드를 불러올 수 있음. 
		
		//안드로이드 폰이 필요하다고 해서 핸드폰 객체로 안드로이드 폰을 만들 수 있을까?
		AndroidPhone p2 = (AndroidPhone)p1; // ClassCastException 발생!
		
		//가능할까?
		p2.doInternet();
	}
}

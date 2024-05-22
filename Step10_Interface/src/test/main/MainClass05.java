package test.main;

import java.util.Scanner;

import test.mypac.Calc;

public class MainClass05 {
	public static void main(String[] args) {
		// 인터페이스가 data type 의 역할을 하는 것을 확인!
		Calc c1 = null;

		//인터페이스 type 의 참조값 얻어내는 방법
		Calc c2 = new Calc() {
			
			@Override
			public double execute(double num1, double num2) {
				
				return num1 % num2;
			}
		};
		// 인터페이스 type 의 참조값을 함수 모양으로 얻어내기
		// 매개변수의 type 은 선언할 필요가 없다. 매개 변수의 갯수만 맞으면 됨.
		Calc c3 = (a, b) -> {
			return 0;
		};
		
		Calc add = (num1, num2)-> {
			return num1 + num2;
		};
		//매개변수로 전달한 두 수의 합이 리턴된다.
		double result1 = add.execute(5, 3);
		// 중괄호 안에서 따로 실행할 code 가 없다면 중괄호 생략,
		// return 예약어 생략 후 리턴할 값만 명시하면 된다.
		Calc add2 = (a, b)-> a+b; // 한 줄짜리 함수모양을 람다식 이라고도 한다
		
		Calc sub = (a, b) -> a-b;
		Calc mul = (a, b) -> a * b;
		Calc div = (a, b) -> a/b;
		
		double result2 = sub.execute(100, 1); // 99
		double result3 = mul.execute(2, 8); // 16
		double result4 = div.execute(3, 6); // 0.5
		
	}
}

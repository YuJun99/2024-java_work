package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type 을 저장할 수 있는 ArrayList 객체를 생성해서
		// 	  참조 값을 List 인터페이스 type 지역변수 cars 에 담아 보세요.
		List<Car> cars = new ArrayList<>();
		
		//2. Car 객체(3개)를 생성해서 List 객체에 저장해 보세요.
		Car car1 = new Car("소나타");
		Car car2 = new Car("볼보");
		Car car3 = new Car("벤츠");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		//3. 일반 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해 보세요.
		for (int i = 0; i < cars.size(); i++) {
			cars.get(i).drive();
		}
		System.out.println("------");
		
		//4. 확장 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해 보세요.
		for (Car a : cars) {
			a.drive();
		}
		System.out.println("-------");
		
		//5.Consumer 인터페이스를 활용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		// 순서대로 호출해 보세요.
		Consumer<Car> cars1 = (t) -> {
			t.drive();
		};
		cars.forEach(cars1);
	}
}

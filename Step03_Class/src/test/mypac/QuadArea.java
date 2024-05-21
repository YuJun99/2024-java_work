package test.mypac;

public class QuadArea {
	
	public int width;	//필드
	public int height;	//필드
	
	public void showArea() {	//메소드
		System.out.println("사각형의 넓이: " + (width * height));
	}
	
	public void show(int a, int b) {	//메소드
		System.out.println("사각형의 넓이: " + a*b);
	}
}

package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// int type 5 개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
		int[] nums = {10, 20, 30, 40, 50};
		//double type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums2 라는 지역 변수에 담아 보세요
		double[] nums2 = {10.1, 15.1, 11.1, 13.1, 12.1};
		//boolean type 5개를 저장하고 있는 배열
		boolean[] bo = new boolean[5];
		boolean[] truth = {true, false, true, true, false};
		//String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] str = new String[5];
		String[] str1 = {"k", "김", "양", "min","L"};
		
		//배열 객체의 복제본 얻어내기
		int[] result = nums.clone();
		int[] result2 = nums; //참조값 복사
		
		//배열의 크기 얻어내기
		int size = nums.length;
		
		//배열은 순서가 있는 데이터 이다. 특정 index 의 item 참조하는 방법
		int first = nums[0];
		int second = nums[1];
		int third = nums[2];
	}
}

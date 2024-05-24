package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.PostDto;

/*
 * 	1. PostDto 클래스를 만들어 보세요
 * 	   PostDto 에는 글 번호, 작성자, 제목을 담을 수 있어야 합니다.
 * 	   즉 3개의 필드를 만들세요 (필드명은 자유)
 * 	   dto 작성 규약에 맞게 만들어 주세요 ( eclipse generate 기능 활용)
 * 	   test.mypac 패키지에 만들기
 * 
 * 	2. PostDto 객체에 임의의 글 3개의 정보를 담아 보세요.
 * 	   총 3개의 PostDto 객체가 생성이 되어야 한다.
 * 	
 * 	3. PostDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 위에서 생성한 PostDto
 * 	   객체를 ArrayList 에 담아 보세요.
 * 
 * 	4. 반복문 돌면서 ArrayList 에 담긴 글 목록을 콘솔창에 이쁘게 출력해 보세요.
 */
public class QuizMain3 {
	public static void main(String[] args) {
		List<PostDto> post = new ArrayList<PostDto>(); // 2
		
		PostDto p1 = new PostDto();
		p1.setNum(1);
		p1.setWriter("김구라");
		p1.setTitle("산책");
		
		PostDto p2 = new PostDto(2, "해골", "바다");
		
		PostDto p3 = new PostDto();
		p3.setNum(3);
		p3.setWriter("홍길동");
		p3.setTitle("해돋이");
		
		List<PostDto> list = new ArrayList<PostDto>(); // 3
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for (int i = 0; i < list.size(); i++) { // 4
			System.out.println("글 번호: " + list.get(i).getNum());
			System.out.println("작성자: " + list.get(i).getWriter());
			System.out.println("제목: " + list.get(i).getTitle());
			System.out.println("");
		}
	}
}

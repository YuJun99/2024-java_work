package test.main;
/*
 * 	run 했을 때 콘솔창에 경과 시간이 출력되는 프로그래밍을 해 보세요.
 * 
 * 	0분 1초
 * 	0분 2초
 * 	0분 3초
 * 	.
 * 	.
 * 	.
 * 	1분 0초
 * 	1분 1초
 */
public class QuizMain {
	public static void main(String[] args) {
		int sec = 1;
		int min = 0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				if(sec == 60) {
					min++;
					sec = 0;
				}
				System.out.println(min+"분 "+ sec +"초");
				sec++;
		}
	}
}

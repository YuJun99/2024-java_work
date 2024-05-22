package test.main;

import java.util.*;
/*
    2차 배열 앞에 첫 인덱스 순서 저장.
    뒤에 값 기준으로 정렬
    앞에 인덱스 순서만 정렬
*/
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            int A = sc.nextInt();
            arr[i][0] = i;
            arr[i][1] = A;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
        	@Override
        	public int compare(int[] o1, int[] o2) {
        		return o1[1] - o2[1]; 
        	}
        });
        for (int i = 0; i < N; i++) {
			System.out.print(arr[i][0] + " ");
		}
    }
}
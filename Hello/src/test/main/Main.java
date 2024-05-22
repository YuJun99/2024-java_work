package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
/*
    2차 배열 앞에 첫 인덱스 순서 저장.
    뒤에 값 기준으로 정렬
    앞에 인덱스 순서만 정렬
*/
public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(st.nextToken());
            arr[i][0] = i;
            arr[i][1] = A;
            
            for (int j = 0; j < i; j++) {
				if(arr[i][1] == arr[j][1]) {
					
				}
			}
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
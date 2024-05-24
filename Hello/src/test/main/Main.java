package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
/*
    2차 배열 앞에 첫 인덱스 순서 저장.
    뒤에 값 기준으로 정렬
    앞에 인덱스 순서만 정렬
    -10 -9 2 4 4
    0 1 2 3 3
    
    2 4 -10 4 -9
    2 3 0 3 1
*/
public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(); // 2 4 -10 4 -9
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr1 = new int[N];
        
        for (int i = 0; i < N; i++) {
        	int a = Integer.parseInt(st.nextToken());
			list.add(a);
			arr1[i] = a; // {2, 4, -10, 4, -9}
		}
        br.close();
        
        Set<Integer> set1 = new HashSet<>(list);
        List<Integer> list1 = new ArrayList<>(set1); // 중복 제거 후 리스트에 값 추가
        
        Collections.sort(list1); // -10 -9 2 4
        
        int size = list1.size();
        int[][] arr = new int[size][2];
        for (int i = 0; i < size; i++) {
			arr[i][0] = i;
			arr[i][1] = list1.get(i); // {{0, -10}, {1, -9}, {2, 2}, {3, 4}}
		}
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
        	for(int j = 0; j < size; j++) {
        		if(arr1[i] == arr[j][1]) {
        			bw.write(arr[j][0] + " ");;
        		}
        	}
        }
        bw.flush();
        bw.close(); // 버퍼 지우고 닫기
    }
}
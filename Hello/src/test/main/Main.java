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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
        	int a = Integer.parseInt(st.nextToken());
			list.add(a);	// 2 4 -10 4 -9
			set.add(a);		// 2 4 -10 -9
		}
        int[] numbers = new int[set.size()];
        int idx = 0;
        for (int i : set) {
			numbers[idx++] = i;		// {2, 4, -10, -9}
		}
        Arrays.sort(numbers);		// {-10, -9, 2, 4}
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
			int j = Arrays.binarySearch(numbers, list.get(i));	// 해당 인덱스 값이 나옴
			sb.append(j + " ");
		}
        System.out.println(sb);
    }
}
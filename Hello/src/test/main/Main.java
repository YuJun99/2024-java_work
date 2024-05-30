package test.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
//		var br = new BufferedReader(InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list1 = new ArrayList<Integer>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			list1.add(a);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			list2.add(a);
		}
		for(int item : list2) {
			if(list1.contains(item) == true) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
	}
}
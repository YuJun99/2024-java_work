package test.main;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] xy = new int[N][2];
        
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < 2; j++) {
        		int A = sc.nextInt();
        		xy[i][j] = A;
        	}
        }
        Arrays.sort(xy, );
        
        for(int i = 0; i < N; i++) {
        	System.out.println(xy[i][0] + " " + xy[i][1]);
        }
    }
}
package backjun;


import java.util.Arrays;
import java.util.Scanner;

public class no1956 {
	static int[][] dp;
	static int[][] map; 
	static int v;
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		v = sc.nextInt();
		int e = sc.nextInt();
		dp = new int[v+1][v+1];
		map = new int[v+1][v+1];
		int[] result = new int[v+1];
		for( int i = 0 ; i < e ; i++ ) {
			map[sc.nextInt()][sc.nextInt()] = sc.nextInt();
		}
		for( int i = 1; i < v+1 ; i++ ) { // 출발 마을
			for( int j = 1; j < v+1; j++ ) {
				if(map[i][j]!=0) cycle(i,j,map[i][j]);
			}
		}
		for( int i = 1; i < v+1 ; i++ ) { // 출발 마을
				result[i] = dp[i][i];
		}
		Arrays.sort(result);
		for( int i = 0 ; i < v ; i++ ) {
			if( result[i] != 0 ) {
				System.out.println(result[i]); break;
			}
		}
	}
	private static void cycle( int start , int now, int d) {
		if(dp[start][now] != 0) return;
		dp[start][now] = map[start][now];
		
		if(map[now][start] != 0) {
			dp[start][start] = d + map[now][start];
		}
		
		for( int i = 1 ; i < v+1 ; i++ ) {
			if(map[now][i] != 0) {
				dp[start][i] = dp[start][now] + map[now][i];
				cycle(start,i,dp[start][i]);
			}
		}
		
	}
}

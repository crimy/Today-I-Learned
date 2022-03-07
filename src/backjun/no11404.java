package backjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class no11404 {
	static int[][] dp;
	static int inf = 100100;
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int m = sc.nextInt();
		dp = new int[n+1][n+1];
		for( int i = 1; i <= n ; i++ ) {
			Arrays.fill(dp[i], inf );
		}
		for( int i = 0 ; i < m ; i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if( c < dp[a][b] ) dp[a][b] = c;
		}
		Floyd(n);
		for( int i = 1; i <= n ; i++ ) {
			for( int j = 1; j <= n ; j++ ) {
				if( dp[i][j] != inf )
					System.out.print( dp[i][j] );
				else System.out.print( "0" );
				if( j == n && i != n ) System.out.println("");
				else System.out.print(" ");
			}
			
		}
	}
	public static void Floyd(int n) {
		for( int k = 1; k <= n ; k++ ) {
			for( int i = 1; i <= n; i++ ) {
				if( i != k ) {
					for( int j = 1; j <= n; j ++ ) {
						if( j != k && j != i )	
							if( dp[i][j] > dp[i][k] + dp[k][j] ) {
								dp[i][j] = dp[i][k] + dp[k][j];
							}
					}
				}
			}
		}
	}
}

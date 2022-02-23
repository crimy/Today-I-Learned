package backjun;

import java.util.Scanner;

public class no17404 {
	
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] rgb = new int[n][3]; // 색별 페인트 칠 비용
		int[][] dp = new int[n][3]; // 비용의 총합 (누적)
		int ans = 10000; // 충분히 큰 임의의 최소값 설정
		
		for( int i = 0 ; i < n ; i++ ) {			
			for( int j = 0 ; j < 3 ; j++ ) {
				rgb[i][j] = sc.nextInt();
			}
		}
		//
		sc.close();
		
		for( int i = 0 ; i < n ; i++ ) {
			for( int j = 0 ; j < 3 ; j++ ) {
				if( i == j ) {
					dp[0][j] = rgb[0][j]; // 첫집의 색 고정
				} else {
					dp[0][j] = 1001; // 1000이 한도이므로 최대값설정
				}
			}
		
			for( int k = 1; k < n ; k++ ) {
				dp[k][0] = Math.min( dp[k-1][1], dp[k-1][2] ) + rgb[k][0]; // 경우의수 별 더 작은 비용 계산
				dp[k][1] = Math.min( dp[k-1][0], dp[k-1][2] ) + rgb[k][1];
				dp[k][2] = Math.min( dp[k-1][0], dp[k-1][1] ) + rgb[k][2];
			}
			for( int t = 0 ; t < 3 ; t++ ) {
				if( t == i ) continue;
				ans = Math.min(ans, dp[n-1][t]);
			}
				
		}
		
		System.out.println( ans );


		
	}
}



/*
 * 
 * R G B R B R
 *   R G
 *     B

*/
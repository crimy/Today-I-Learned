package backjun;

import java.util.Scanner;

public class no17404 {
	
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] rgb = new int[n][3]; // ���� ����Ʈ ĥ ���
		int[][] dp = new int[n][3]; // ����� ���� (����)
		int ans = 10000; // ����� ū ������ �ּҰ� ����
		
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
					dp[0][j] = rgb[0][j]; // ù���� �� ����
				} else {
					dp[0][j] = 1001; // 1000�� �ѵ��̹Ƿ� �ִ밪����
				}
			}
		
			for( int k = 1; k < n ; k++ ) {
				dp[k][0] = Math.min( dp[k-1][1], dp[k-1][2] ) + rgb[k][0]; // ����Ǽ� �� �� ���� ��� ���
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
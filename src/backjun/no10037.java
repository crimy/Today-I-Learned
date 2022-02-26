package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class no10037 {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] p = new int[n+1][n+1];
		int[][] dp = new int[n+1][n+1];
		
		for( int i = 0; i < n ; i++ ) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			p[from][to] = p[to][from] = 1;
		}
		for( int i = 1; i <= n; i++ ) {
			Arrays.fill(dp[i], 1);
		}
		
		for( int f = 1; f <= n ; f++ ) {
			for(int t = 1; t <= n ; t++ ) {
				if( dp[f][t] == 1) {
					if( p[f][t] == 1 ) {
						dp[f][t] = 0;
					}
				}
			}
		}
		int[] result = new int[n+1];
		for( int f = 1; f <= n ; f++ ) {			
			for( int t = 1; t <= n; t ++ ) {
				result[f] += dp[f][t];
			}
		}
		Arrays.sort(result);
		System.out.println(result[n]);
		
	}
	
}


/*




*/
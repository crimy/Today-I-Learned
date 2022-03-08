package backjun;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class no10266 {
	static int[][] arr;
	public static void main( String[] args ) throws IOException { 
		Scanner sc = new Scanner(System.in);
		boolean result;
		int n = sc.nextInt();
		arr = new int[3][n+1];
		for( int i = 1; i <= 2 ; i++ ) {
			for( int j = 1; j <= n; j++ ) {
				arr[i][j] = sc.nextInt();
			}
			Arrays.sort(arr[i]);
		}
		if( n != 2 ) result = solve(n);
		else result = solve2();
		
		if( result == true ) System.out.println( "possible" );
		else System.out.println( "impossible" );
		
	}
	private static boolean solve2() {
		int d = arr[1][2] - arr[1][1];
		int d2 = arr[2][2] - arr[2][1];
		if( d == d2 || d + d2 == 360000 ) return true;
		else return false;
	}
	private static boolean solve(int n) {
		int[][] arr2 = new int[3][2*n+2];

		// arr2[1] : 표본이 될 1번시계 바늘사이 각 
		for( int j = 1; j <= n; j++ ) {
			if( j != n ) arr2[1][j] = arr[1][j+1] - arr[1][j];
			else { arr2[1][j] = 36000 - (arr[1][j]-arr[1][1]) ; }
		}
		// arr2[2] : 비교를 위한 2번시계의 2번 반복되는 바늘사이 각
		for( int j = 1; j <= n; j++ ) {
			if( j != n ) {
				arr2[2][j] = arr[2][j+1] - arr[2][j];
				arr2[2][2*j] = arr2[2][j];
			} else {
				arr2[2][j] = 36000 - (arr[2][j]-arr[2][1]) ;
				arr2[2][2*j] = arr2[2][j];
			}
		}
		int i = 1;
		int j = 1;
		int flag = 0; // 현재 일치 갯수
		while( flag < n-1 && i <= n ) {
			if( arr2[1][i] == arr2[2][j] ) {
				flag++;
				i++; j++;
			} else {
				if( j == n || j == 2 * n ) {
					i = i - flag + 1;
					j = 1;
					flag = 0;
				} else {
					j++;
					flag = 0;
				}
			}
		}
		if( flag == n - 1 ) return true;
		return false;		
	}
}

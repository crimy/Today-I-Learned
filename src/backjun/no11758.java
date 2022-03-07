package backjun;

import java.util.Scanner;

public class no11758 {

	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		int[][] p = new int[2][3];
		
		for( int i = 0 ; i < 3 ; i++ ) {
			p[0][i] = sc.nextInt();
			p[1][i] = sc.nextInt();
		}

		int result = ccw(p);
		System.out.println(result);
	}

	private static int ccw(int[][] p) {
		int ccw = ( p[0][0] * p[1][1] + p[0][1] * p[1][2] + p[0][2] * p[1][0] )
				- ( p[0][1] * p[1][0] + p[0][2] * p[1][1] + p[0][0] * p[1][2] );
		if ( ccw > 0 ) return 1;
		else if ( ccw < 0 ) return -1;
		else return 0;
	 }
}

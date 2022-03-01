package backjun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class no1949 {

	static int[] po;
	static int[][] dp;
	static List<Integer>[] list;
	
	public static void main( String[] args ) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		po = new int[n+1];
		dp = new int[n+1][2];
		
		for( int i = 0 ; i < n+1 ; i++ ) {
			Arrays.fill(dp[i], -1); // dp -1로 초기값 설정
		}
		for( int i = 1; i < n+1 ; i++ ) {
			po[i] = sc.nextInt(); // 각 마을 별 인구수 배열 입력
		}
		
		list = new ArrayList[n+1];
		for( int i = 0; i < n+1; i++ ) {
			list[i] = new ArrayList<>(); // Tree구조 연결관계 list
		}
		
		for( int i = 0 ; i < n-1 ; i++ ) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			list[from].add(to);
			list[to].add(from);	// 연결관계 입력
		}
		Math.max( select(1,-1,1) +po[1] , select(1,-1,0) );
	}			// ( 1번마을이 선정시 , 1번마을 선정하지않을시 ) 중에서 더 큰값.

	private static int select(int now, int prev, int flag) {
		int len = list[now].size();
		
		if( dp[now][flag] != -1 ) return dp[now][flag]; 
		// 이미 select를 시행한 마을이면, 해당 dp값 리턴후 종료.
		
		dp[now][flag] = 0; // 현재 dp 초기화
		
		for( int i = 0 ; i < len ; i++ ) { 
			int next = list[now].get(i); // list로부터 다음 select 대상 선별
			if( next != prev ) { // 되돌아가는 경우 제외
				if( flag == 1 ) { // 이전 마을을 선정했다면,
					dp[now][flag] += select(next, now, 0); // 다음 select 시행
				} else { // 이전 마을이 선정되지않았다면, 
					dp[now][flag] += Math.max(select(next,now,1)+po[next], select(next,now,0)); // now 마을을 선정 , 다음마을부터 DFS하는 것 중 최대값.
				}
			}
		}
		return dp[now][flag];
	}
}

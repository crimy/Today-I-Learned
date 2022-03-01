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
			Arrays.fill(dp[i], -1); // dp -1�� �ʱⰪ ����
		}
		for( int i = 1; i < n+1 ; i++ ) {
			po[i] = sc.nextInt(); // �� ���� �� �α��� �迭 �Է�
		}
		
		list = new ArrayList[n+1];
		for( int i = 0; i < n+1; i++ ) {
			list[i] = new ArrayList<>(); // Tree���� ������� list
		}
		
		for( int i = 0 ; i < n-1 ; i++ ) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			list[from].add(to);
			list[to].add(from);	// ������� �Է�
		}
		Math.max( select(1,-1,1) +po[1] , select(1,-1,0) );
	}			// ( 1�������� ������ , 1������ �������������� ) �߿��� �� ū��.

	private static int select(int now, int prev, int flag) {
		int len = list[now].size();
		
		if( dp[now][flag] != -1 ) return dp[now][flag]; 
		// �̹� select�� ������ �����̸�, �ش� dp�� ������ ����.
		
		dp[now][flag] = 0; // ���� dp �ʱ�ȭ
		
		for( int i = 0 ; i < len ; i++ ) { 
			int next = list[now].get(i); // list�κ��� ���� select ��� ����
			if( next != prev ) { // �ǵ��ư��� ��� ����
				if( flag == 1 ) { // ���� ������ �����ߴٸ�,
					dp[now][flag] += select(next, now, 0); // ���� select ����
				} else { // ���� ������ ���������ʾҴٸ�, 
					dp[now][flag] += Math.max(select(next,now,1)+po[next], select(next,now,0)); // now ������ ���� , ������������ DFS�ϴ� �� �� �ִ밪.
				}
			}
		}
		return dp[now][flag];
	}
}

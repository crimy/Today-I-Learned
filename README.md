# Today-I-Learned
This is a auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).
--------------------------

Index

1. [22.02.22](#14725번)
2. [22.02.26](#10037번)
3. [22.02.27](#1949번)
4. [22.03.01](#1956번)
--------------------------


## 14725번
22.02.22

https://www.acmicpc.net/problem/14725
14725.
Tree로 접근하여 풀이했으나, 출력 순서에 있어 순회 알고리즘이 차이가 있음. 타 자료 찾아본 뒤 수정 필요

----------------------------

## 10037번

22.02.26
https://www.acmicpc.net/problem/10037

### 문제

Farmer John has N (1 <= N <= 50,000) pastures, conveniently numbered 1...N, connected by M (1 <= M <= 100,000) bidirectional paths. Path i connects pasture A_i (1 <= A_i <= N) to pasture B_i (1 <= B_i <= N) with A_i != B_i. It is possible for two paths to connect between the same pair of pastures.

Bessie has decided to decorate the pastures for FJ's birthday. She wants to put a large sign in each pasture containing either the letter 'F' or 'J', but in order not to confuse FJ, she wants to be sure that two pastures are decorated by different letters if they are connected by a path.

The sign company insists on charging Bessie more money for an 'F' sign than a 'J' sign, so Bessie wants to maximize the number of 'J' signs that she uses. Please determine this number, or output -1 if there is no valid way to arrange the signs.

모든 pasture를 F와 J 중의 두 문자로 장식하는데 Path i로 연결된 두 pasture는 다른 문자로 장식돼야한다. J의 비용이 더 저렴하기때문에 J가 최대한 많이 들어가도록 하여 최대로 사용할 수 있는 갯수를 구한다.

<div class="colorscripter-code" style="color:#010101;font-family:Consolas, 'Liberation Mono', Menlo, Courier, monospace !important; position:relative !important;overflow:auto"><table class="colorscripter-code-table" style="margin:0;padding:0;border:none;background-color:#fafafa;border-radius:4px;" cellspacing="0" cellpadding="0"><tr><td style="padding:6px;border-right:2px solid #e5e5e5"><div style="margin:0;padding:0;word-break:normal;text-align:right;color:#666;font-family:Consolas, 'Liberation Mono', Menlo, Courier, monospace !important;line-height:130%"><div style="line-height:130%">1</div><div style="line-height:130%">2</div><div style="line-height:130%">3</div><div style="line-height:130%">4</div><div style="line-height:130%">5</div></div></td><td style="padding:6px 0;text-align:left"><div style="margin:0;padding:0;color:#010101;font-family:Consolas, 'Liberation Mono', Menlo, Courier, monospace !important;line-height:130%"><div style="padding:0 6px; white-space:pre; line-height:130%">for(&nbsp;int&nbsp;i&nbsp;=&nbsp;0;&nbsp;i&nbsp;&lt;&nbsp;n&nbsp;;&nbsp;i++&nbsp;)&nbsp;{</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int&nbsp;from&nbsp;=&nbsp;sc.nextInt();</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int&nbsp;to&nbsp;=&nbsp;sc.nextInt();</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;p[from][to]&nbsp;=&nbsp;p[to][from]&nbsp;=&nbsp;1;</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</div></div></td><td style="vertical-align:bottom;padding:0 2px 4px 0"><a href="http://colorscripter.com/info#e" target="_blank" style="text-decoration:none;color:white"><span style="font-size:9px;word-break:normal;background-color:#e5e5e5;color:white;border-radius:10px;padding:1px">cs</span></a></td></tr></table></div>
    


먼저 , 2차원 배열 p에 연결된 pasture의 정보를 입력한다.

그리고 경우의 수 별로 배열 1로채워진 2차원 배열 dp를 같은 크기로 만들고 

<div class="colorscripter-code" style="color:#010101;font-family:Consolas, 'Liberation Mono', Menlo, Courier, monospace !important; position:relative !important;overflow:auto"><table class="colorscripter-code-table" style="margin:0;padding:0;border:none;background-color:#fafafa;border-radius:4px;" cellspacing="0" cellpadding="0"><tr><td style="padding:6px;border-right:2px solid #e5e5e5"><div style="margin:0;padding:0;word-break:normal;text-align:right;color:#666;font-family:Consolas, 'Liberation Mono', Menlo, Courier, monospace !important;line-height:130%"><div style="line-height:130%">1</div><div style="line-height:130%">2</div><div style="line-height:130%">3</div><div style="line-height:130%">4</div><div style="line-height:130%">5</div><div style="line-height:130%">6</div><div style="line-height:130%">7</div><div style="line-height:130%">8</div><div style="line-height:130%">9</div></div></td><td style="padding:6px 0;text-align:left"><div style="margin:0;padding:0;color:#010101;font-family:Consolas, 'Liberation Mono', Menlo, Courier, monospace !important;line-height:130%"><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for(&nbsp;int&nbsp;f&nbsp;=&nbsp;1;&nbsp;f&nbsp;&lt;=&nbsp;n&nbsp;;&nbsp;f++&nbsp;)&nbsp;{</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;for(int&nbsp;t&nbsp;=&nbsp;1;&nbsp;t&nbsp;&lt;=&nbsp;n&nbsp;;&nbsp;t++&nbsp;)&nbsp;{</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(&nbsp;dp[f][t]&nbsp;==&nbsp;1)&nbsp;{</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if(&nbsp;p[f][t]&nbsp;==&nbsp;1&nbsp;)&nbsp;{</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;dp[f][t]&nbsp;=&nbsp;0;</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</div><div style="padding:0 6px; white-space:pre; line-height:130%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</div></div><div style="text-align:right;margin-top:-13px;margin-right:5px;font-size:9px;font-style:italic"><a href="http://colorscripter.com/info#e" target="_blank" style="color:#e5e5e5text-decoration:none">Colored by Color Scripter</a></div></td><td style="vertical-align:bottom;padding:0 2px 4px 0"><a href="http://colorscripter.com/info#e" target="_blank" style="text-decoration:none;color:white"><span style="font-size:9px;word-break:normal;background-color:#e5e5e5;color:white;border-radius:10px;padding:1px">cs</span></a></td></tr></table></div>


가정이 모든 pasture를 J로 채워둔 상태에서 한 pasture를 선택해 그로부터 인접한 J를 1차적으로 F로 바꾸고, 그 후 남아있는 J로부터 인접한 J를 다시 F로 바꾸기 때문에 dp에서 시작점이 될 J를 정한다.
첫 for문 으로 시작점이 될 J를 정하고, 목표인 [f][t]가 J고, p[f][t]가 1이라면, 즉 두 pasture가 연결됐다면, dp[f][t]는 0, F가 된다.

------------------------------

## 1949번

22.02.27

# [Gold II] 우수 마을 - 1949 

[문제 링크](https://www.acmicpc.net/problem/1949) 

### 성능 요약

메모리: 47684 KB, 시간: 576 ms

### 분류

다이나믹 프로그래밍(dp), 트리에서의 다이나믹 프로그래밍(dp_tree), 트리(trees)

### 문제 설명

<p>N개의 마을로 이루어진 나라가 있다. 편의상 마을에는 1부터 N까지 번호가 붙어 있다고 하자. 이 나라는 트리(Tree) 구조로 이루어져 있다. 즉 마을과 마을 사이를 직접 잇는 N-1개의 길이 있으며, 각 길은 방향성이 없어서 A번 마을에서 B번 마을로 갈 수 있다면 B번 마을에서 A번 마을로 갈 수 있다. 또, 모든 마을은 연결되어 있다. 두 마을 사이에 직접 잇는 길이 있을 때, 두 마을이 인접해 있다고 한다.</p>

<p>이 나라의 주민들에게 성취감을 높여 주기 위해, 다음 세 가지 조건을 만족하면서 N개의 마을 중 몇 개의 마을을 '우수 마을'로 선정하려고 한다.</p>

<ol>
	<li>'우수 마을'로 선정된 마을 주민 수의 총 합을 최대로 해야 한다.</li>
	<li>마을 사이의 충돌을 방지하기 위해서, 만일 두 마을이 인접해 있으면 두 마을을 모두 '우수 마을'로 선정할 수는 없다. 즉 '우수 마을'끼리는 서로 인접해 있을 수 없다.</li>
	<li>선정되지 못한 마을에 경각심을 불러일으키기 위해서, '우수 마을'로 선정되지 못한 마을은 적어도 하나의 '우수 마을'과는 인접해 있어야 한다.</li>
</ol>

<p>각 마을 주민 수와 마을 사이의 길에 대한 정보가 주어졌을 때, 주어진 조건을 만족하도록 '우수 마을'을 선정하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 정수 N이 주어진다. (1 ≤ N ≤ 10,000) 둘째 줄에는 마을 주민 수를 나타내는 N개의 자연수가 빈칸을 사이에 두고 주어진다. 1번 마을부터 N번 마을까지 순서대로 주어지며, 주민 수는 10,000 이하이다. 셋째 줄부터 N-1개 줄에 걸쳐서 인접한 두 마을의 번호가 빈칸을 사이에 두고 주어진다.</p>

### 출력 

 <p>첫째 줄에 '우수 마을'의 주민 수의 총 합을 출력한다.</p>

https://velog.io/@crimy950/2022.02.27-TIL

-----------------------------

## 1956번 

22.03.01

### 문제

V개의 마을와 E개의 도로로 구성되어 있는 도시가 있다. 도로는 마을과 마을 사이에 놓여 있으며, 일방 통행 도로이다. 마을에는 편의상 1번부터 V번까지 번호가 매겨져 있다고 하자.

당신은 도로를 따라 운동을 하기 위한 경로를 찾으려고 한다. 운동을 한 후에는 다시 시작점으로 돌아오는 것이 좋기 때문에, 우리는 사이클을 찾기를 원한다. 단, 당신은 운동을 매우 귀찮아하므로, 사이클을 이루는 도로의 길이의 합이 최소가 되도록 찾으려고 한다.

도로의 정보가 주어졌을 때, 도로의 길이의 합이 가장 작은 사이클을 찾는 프로그램을 작성하시오. 두 마을을 왕복하는 경우도 사이클에 포함됨에 주의한다.

```java

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
```

재귀호출을 사용하여 나름대로 직접 고민해서 프로그래밍했다. 예제입,출력에는 정답을 냈지만 제출의 결과는 오답처리.
그 이유는 아무래도 예제의 경우 1번에서 1번으로 돌아오는 싸이클, 2번에서 2번으로 돌아오는 싸이클, 한 싸이클 내에서 최소값을 구할 필요가 없다. 
1은 돌아오지 못하고, 2와 3은 경로가 하나 뿐이기 때문. 여러 싸이클을 고려해서 최소값을 구하는 알고리즘을 추가하지 않았다.
그리고 현재와 같은 구조를 유지하면서 위와 같은 알고리즘을 추가하는 것은 힘들것으로 보인다.
플로이드 와샬 알고리즘을 공부해보자.

https://velog.io/@crimy950/2022.03.01-TIL

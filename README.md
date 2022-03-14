# Today-I-Learned
This is a auto push repository for Baekjoon Online Judge created with [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub).
--------------------------

Index

1. [22.02.22](#14725번)
2. [22.02.26](#10037번)
3. [22.02.27](#1949번)
4. [22.03.01](#1956번)
5. [22.03.03](#11758번)
6. [22.03.07](#11404번)
7. 22.03.10
	+ [중복제거](#중복제거)
	+ [주식판매](#주식판매)
	+ [배열 밀기](#배열_밀기)
8. 22.03.11
	+ [중복 포함](#중복포함)
	+ [유일한 수](#유일한수)
	+ [공통되는 수](#공통되는수)
	+ [1 더하기](#1더하기)
9. 22.03.14
	+ [string뒤집기](#string뒤집기)
	+ [int뒤집기](#int뒤집기)
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


-------------------------

## 11758번

22.03.03

### 문제

2차원 좌표 평면 위에 있는 점 3개 P1, P2, P3가 주어진다. P1, P2, P3를 순서대로 이은 선분이 어떤 방향을 이루고 있는지 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 P1의 (x1, y1), 둘째 줄에 P2의 (x2, y2), 셋째 줄에 P3의 (x3, y3)가 주어진다. (-10,000 ≤ x1, y1, x2, y2, x3, y3 ≤ 10,000) 모든 좌표는 정수이다. P1, P2, P3의 좌표는 서로 다르다.

### 출력

P1, P2, P3를 순서대로 이은 선분이 반시계 방향을 나타내면 1, 시계 방향이면 -1, 일직선이면 0을 출력한다.

신발끈 공식을 활용해서 풀이했다.

![image](https://user-images.githubusercontent.com/97273627/156486026-d586d73f-ed24-484d-8ad2-5bcd9dd56745.png)

해당 이미지에서 세 점의 관계를 구하기 위해 , 
( x_1 * y_2 + x_2 * y_3 + x_3 * y_1 ) - ( y_1 * x_2 + y_2 * x_3 + y_3 * x_1 ) 의 값을 구하고
결과가 0보다 작으면 시계 반대방향, 크면 시계방향, 0이라면 일직선임을 알 수 있다.

int[][] p 에 세 점의 좌표를 입력하고 ccw 공식으로 풀이해서 완료했다.

---------------------------

## 11404번

22.03.07

### 문제

n(2 ≤ n ≤ 100)개의 도시가 있다. 그리고 한 도시에서 출발하여 다른 도시에 도착하는 m(1 ≤ m ≤ 100,000)개의 버스가 있다. 각 버스는 한 번 사용할 때 필요한 비용이 있다.

모든 도시의 쌍 (A, B)에 대해서 도시 A에서 B로 가는데 필요한 비용의 최솟값을 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 도시의 개수 n이 주어지고 둘째 줄에는 버스의 개수 m이 주어진다. 그리고 셋째 줄부터 m+2줄까지 다음과 같은 버스의 정보가 주어진다. 먼저 처음에는 그 버스의 출발 도시의 번호가 주어진다. 버스의 정보는 버스의 시작 도시 a, 도착 도시 b, 한 번 타는데 필요한 비용 c로 이루어져 있다. 시작 도시와 도착 도시가 같은 경우는 없다. 비용은 100,000보다 작거나 같은 자연수이다.

시작 도시와 도착 도시를 연결하는 노선은 하나가 아닐 수 있다.

### 출력

n개의 줄을 출력해야 한다. i번째 줄에 출력하는 j번째 숫자는 도시 i에서 j로 가는데 필요한 최소 비용이다. 만약, i에서 j로 갈 수 없는 경우에는 그 자리에 0을 출력한다.

플로이드 와샬 알고리즘을 복습하기 위해 비슷한 유형의 문제를 풀이해봤다.

```java

for( int i = 1; i <= n ; i++ ) {
			Arrays.fill(dp[i], inf );
		}
		for( int i = 0 ; i < m ; i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if( c < dp[a][b] ) dp[a][b] = c;
		}
		
```
먼저 초기값 입력을 위해 Scanner를 이용해 값을 대입해준다. 여기서 입력 조건에 노선이 하나가 아닐 수 있다. 라는 것을 보지 못해서 c < dp[a][b]의 조건을 추가하지 않았고, 그래서 정답이 얻어지지 않았다. 여러 노선 중 비용이 적은 노선을 선택해 입력해줘야 하기 때문에 해당 조건을 추가했다.

```java

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
	
```
플로이드 와샬 알고리즘을 이용하기 위한 함수. 경유지 k , 시작점 i, 도착점 j 의 값에 따른 반복 수행으로 경유를 통해 최단거리를 도출해낸다.

----------------------------


## 중복제거
22.03.10

<h2>  Remove Duplicates from Sorted Array</h2><hr><div><p>Given an integer array <code>nums</code> sorted in <strong>non-decreasing order</strong>, remove the duplicates <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank"><strong>in-place</strong></a> such that each unique element appears only <strong>once</strong>. The <strong>relative order</strong> of the elements should be kept the <strong>same</strong>.</p>

<p>Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the <strong>first part</strong> of the array <code>nums</code>. More formally, if there are <code>k</code> elements after removing the duplicates, then the first <code>k</code> elements of <code>nums</code>&nbsp;should hold the final result. It does not matter what you leave beyond the first&nbsp;<code>k</code>&nbsp;elements.</p>

<p>Return <code>k</code><em> after placing the final result in the first </em><code>k</code><em> slots of </em><code>nums</code>.</p>

<p>Do <strong>not</strong> allocate extra space for another array. You must do this by <strong>modifying the input array <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a></strong> with O(1) extra memory.</p>

<p><strong>Custom Judge:</strong></p>

<p>The judge will test your solution with the following code:</p>

<pre>int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i &lt; k; i++) {
    assert nums[i] == expectedNums[i];
}
</pre>

<p>If all assertions pass, then your solution will be <strong>accepted</strong>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,1,2]
<strong>Output:</strong> 2, nums = [1,2,_]
<strong>Explanation:</strong> Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [0,0,1,1,1,2,2,3,3,4]
<strong>Output:</strong> 5, nums = [0,1,2,3,4,_,_,_,_,_]
<strong>Explanation:</strong> Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>-100 &lt;= nums[i] &lt;= 100</code></li>
	<li><code>nums</code> is sorted in <strong>non-decreasing</strong> order.</li>
</ul>
</div>

### 풀이 

새로운 커뮤니티에서 접한 문제라 익숙치 않은 유형이었고, 영어를 해석하느라 다소 모호하게 이해한 부분이 있어 실제 난이도보다 조금 더 어렵게 느껴졌다.
풀이 방식은 생각보다 간단했다. 실제 nums에 새로 입력할 index와 기존의 nums를 탐색할 index를 따로 둬서 탐색하는 index는 for문을 통해 자동으로 증가하도록 하고 새로 입력할 index는 이전의 값과 다른 값이 입력돼있을 경우를 판별해 증가시켜 입력한다.
그를 이용해 중복돼서 연속되는 값을 제거하면서 새로 nums를 입력할 수 있고, unique한 값의 갯수 또한 입력하는 index를 통해 카운트 할 수 있다.

--------------------------

## 주식판매
## Best Time to Buy and Sell Stock II

<p>On each day, you may decide to buy and/or sell the stock. You can only hold <strong>at most one</strong> share of the stock at any time. However, you can buy it then immediately sell it on the <strong>same day</strong>.</p>

<p>Find and return <em>the <strong>maximum</strong> profit you can achieve</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 7
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> prices = [1,2,3,4,5]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= prices.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>0 &lt;= prices[i] &lt;= 10<sup>4</sup></code></li>
</ul>
</div>

### 풀이

수익의 최고값을 얻어야 한다는 점에서 Dynamic Programming같은 복잡한 알고리즘을 사용해야 한다고 생각했지만 보다 단순한 방법이 쉽고 정확한 방법이었다.
주식을 팔았던 날 바로 살 수 있다는 조건 때문이었다. 다음날 가격이 오르는 날은 모두 구매하여 모두 다음날 판매하도록 하면 수익을 낼 수 있는 모든 경우의 수를 포함하여 매매를 하는 것이 되기 때문에 그 방법이 최고값의 수익을 내게 된다.

---------------------

## 배열_밀기

<h2>  Rotate Array</h2><hr><div><p>Given an array, rotate the array to the right by <code>k</code> steps, where <code>k</code> is non-negative.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [-1,-100,3,99], k = 2
<strong>Output:</strong> [3,99,-1,-100]
<strong>Explanation:</strong> 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>0 &lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong></p>

<ul>
	<li>Try to come up with as many solutions as you can. There are at least <strong>three</strong> different ways to solve this problem.</li>
	<li>Could you do it in-place with <code>O(1)</code> extra space?</li>
</ul>
</div>

### 풀이

간단하게 생각하여 단순히 k값만큼 반복하여 한칸씩 배열의 값을 오른쪽으로 밀어주는 식으로 풀이를 진행했다. 하지만 약간의 함정이 있었는데, 구동 시간의 제한으로 상당히 큰 크기의 Test Input을 시험하였을 때 이런 방법으로는 시간이 초과된다.
그래서 한번에 쉬프트를 진행하는 방법으로 풀이해야한다는 걸 알았고, 여기서 문제는 k 값이 배열 크기보다 클 경우, 작을 경우, 같을 경우 모두를 고려하여 적절한 index 값을 입력해서 쉬프트를 해야 한다는 것이다.
% 연산을 이용해 index 값을 입력했는데, k 값이 배열 크기보다 클 경우 배열의 크기를 벗어나는 % 연산 결과값이 나와 런타임 에러가 발생한다.
이를 해결하기 위해 쉬프트되는 index에 한번더 % 연산을 시행해줘서 마무리했다.

-------------------------

### 중복포함
22.03.11

<h2>  Contains Duplicate</h2><hr><div><p>Given an integer array <code>nums</code>, return <code>true</code> if any value appears <strong>at least twice</strong> in the array, and return <code>false</code> if every element is distinct.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,1]
<strong>Output:</strong> true
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> false
</pre><p><strong>Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [1,1,1,3,3,4,3,2,4,2]
<strong>Output:</strong> true
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
</ul>
</div>

### 풀이 

단순하게 크기 순으로 nums를 정렬하여 for문을 통해 다음 값과 같은 값이 발견되면 true를 return한다.

---------------------------

### 유일한수

<h2>  Single Number</h2><hr><div><p>Given a <strong>non-empty</strong>&nbsp;array of integers <code>nums</code>, every element appears <em>twice</em> except for one. Find that single one.</p>

<p>You must&nbsp;implement a solution with a linear runtime complexity and use&nbsp;only constant&nbsp;extra space.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [2,2,1]
<strong>Output:</strong> 1
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [4,1,2,1,2]
<strong>Output:</strong> 4
</pre><p><strong>Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [1]
<strong>Output:</strong> 1
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>-3 * 10<sup>4</sup> &lt;= nums[i] &lt;= 3 * 10<sup>4</sup></code></li>
	<li>Each element in the array appears twice except for one element which appears only once.</li>
</ul>
</div>

### 풀이 
반드시 중복되는 수는 짝수번째 index에서 나오기 때문에
[1,2,2] 일 경우 0번. [4,1,2,1,2] 일 경우 [1,1,2,2,4] 로 4번.
역시 크기 순으로 정렬하여 index를 2씩 증가하며 탐색한 뒤 다음 값과 달라지는 값이 있으면 해당 값을 리턴하도록 하였다.
이렇게 했더니 문제점이 마지막에 유일한 수가 나왔을 경우 return이 되지않았다. 그래서 if문에서 해당 조건을 만족하지 않으면 마지막 index의 값을 리턴하도록 했다.

------------------------

### 공통되는수

<h2>  Intersection of Two Arrays II</h2><hr><div><p>Given two integer arrays <code>nums1</code> and <code>nums2</code>, return <em>an array of their intersection</em>. Each element in the result must appear as many times as it shows in both arrays and you may return the result in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> nums1 = [1,2,2,1], nums2 = [2,2]
<strong>Output:</strong> [2,2]
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>Output:</strong> [4,9]
<strong>Explanation:</strong> [9,4] is also accepted.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong></p>

<ul>
	<li>What if the given array is already sorted? How would you optimize your algorithm?</li>
	<li>What if <code>nums1</code>'s size is small compared to <code>nums2</code>'s size? Which algorithm is better?</li>
	<li>What if elements of <code>nums2</code> are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?</li>
</ul>
</div>

### 풀이
처음에는 nums1, nums2 중 크기가 작은 배열과 같은 크기로 배열을 만들어 리턴했지만, 지정되지 않은 값이 0으로 입력돼 오류가 발생했다.
ArrayList를 이용해 미리 겹치는 값을 저장한 후 , 해당 값을 nums1 과 nums2 에서 가질 수 없는 값인 -1로 바꿔주고 list에 저장했다.
int size 를 선언하여 미리 리턴할 배열의 크기를 정해두고, 겹치는 값이 발견될 때마다 증가시켰다.

----------------------
### 1더하기

<h2>  Plus One</h2><hr><div><p>You are given a <strong>large integer</strong> represented as an integer array <code>digits</code>, where each <code>digits[i]</code> is the <code>i<sup>th</sup></code> digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading <code>0</code>'s.</p>

<p>Increment the large integer by one and return <em>the resulting array of digits</em>.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> digits = [1,2,3]
<strong>Output:</strong> [1,2,4]
<strong>Explanation:</strong> The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> digits = [4,3,2,1]
<strong>Output:</strong> [4,3,2,2]
<strong>Explanation:</strong> The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> digits = [9]
<strong>Output:</strong> [1,0]
<strong>Explanation:</strong> The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= digits.length &lt;= 100</code></li>
	<li><code>0 &lt;= digits[i] &lt;= 9</code></li>
	<li><code>digits</code> does not contain any leading <code>0</code>'s.</li>
</ul>
</div>

### 풀이
처음엔 int value를 선언하여 값을 int로 직접 더해서 다시 다른 배열에 집어넣는 방식을 선택했다. 배열의 크기를 선택하기 편할 것 같아 log10과 Math.pow를 이용해서 해당 값의 자릿수와 각 자리의 값을 추출해서 사용했다.
이럴 때 문제점이 test input 중 int가 표현할 수 있는 최대값을 넘는 값이 있었다. 
그래서 배열만을 이용하는 방식으로 변경해서 다시 시도했다.
1의 자리수에 1을 더한 후 차례대로 마지막 배열부터 10이라는 값이 발견되면 0으로 바꾸고, 그 윗 자리 값을 1더하는 반복문을 사용했다.
가장 큰 자리 수의 값이 10이 되면, 새로운 배열을 만들어 1 , 0 으로 시작하고 뒤의 값은 digits와 같은 값을 갖도록 하여 리턴했다.
이렇게 했더니 한자리 수에서 ArrayIndexOutOfBounds Exception이 발생했고, 이를 해결하기 위해 한자릿수는 예외적으로 처리했다.

------------------

### string뒤집기

<h2>  Reverse String</h2><hr><div><p>Write a function that reverses a string. The input string is given as an array of characters <code>s</code>.</p>

<p>You must do this by modifying the input array <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> with <code>O(1)</code> extra memory.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>
<pre><strong>Input:</strong> s = ["h","e","l","l","o"]
<strong>Output:</strong> ["o","l","l","e","h"]
</pre><p><strong>Example 2:</strong></p>
<pre><strong>Input:</strong> s = ["H","a","n","n","a","h"]
<strong>Output:</strong> ["h","a","n","n","a","H"]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s[i]</code> is a <a href="https://en.wikipedia.org/wiki/ASCII#Printable_characters" target="_blank">printable ascii character</a>.</li>
</ul>
</div>

### 풀이

문자열을 거꾸로 뒤집어서 나타낸다. char[] 인 temp를 만들어 clone으로 같은 배열을 대입하고, temp의 값을 이용해서 s에 새로운 값을 대입했다.

-----------------

### int뒤집기

<h2>  Reverse Integer</h2><hr><div><p>Given a signed 32-bit integer <code>x</code>, return <code>x</code><em> with its digits reversed</em>. If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then return <code>0</code>.</p>

<p><strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong></p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:</strong> x = 123
<strong>Output:</strong> 321
</pre>

<p><strong>Example 2:</strong></p>

<pre><strong>Input:</strong> x = -123
<strong>Output:</strong> -321
</pre>

<p><strong>Example 3:</strong></p>

<pre><strong>Input:</strong> x = 120
<strong>Output:</strong> 21
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
</div>

### 풀이

answer에 int값을 윗 자리수부터 Math.pow와 Math.log10을 이용해서 자리수의 값을 대입하고 x에서 해당 값을 뺀다.
그리고 테스트한 후 음수에서 문제가 발생했고, 음수가 대입될 경우 x에 미리 -1을 곱한 후 flag로 음수에 대한 표시를 하고, return하는 answer에 다시 -1을 곱하는 방식으로 


import java.util.*;
class Solution {
	public int[] solution(int[][] board, int k){
		int[] answer = new int[2];
		int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
		int go = 0;
		for(int time = k; time != 0; time--) {
			if(board.length > answer[0] + direction[go][0] -1
			|| board.length > answer[1] + direction[go][1] -1) {
				if(board[answer[0] + direction[go][0]][answer[1] + direction[go][1]] == 0){
					answer = new int[] {answer[0] + direction[go][0], answer[1] + direction[go][1]};
					System.out.println(answer);
				}
			} else {
				if(go != 3) {
					System.out.println(go);
					go++;
				}
				else {
					go=0;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		int[][] arr1 = {{0, 0, 0, 0, 0},
			{0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0},
			{1, 0, 1, 0, 1},
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = {{0, 0, 0, 1, 0, 1},
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 1},
			{1, 1, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = {{0, 0, 1, 0, 0},
			{0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0},
			{1, 0, 0, 0, 1},
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr3, 25)));

	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalRound = Integer.parseInt(scanner.next());
		int[][] countMap = new int[totalRound][];
		boolean[][] hintMap = new boolean[totalRound][];
		for(int i=0; i < totalRound; i++) {
			int maxIndex = Integer.parseInt(scanner.next());
			countMap[i] = new int[maxIndex];
			hintMap[i] = new boolean[maxIndex];
			for(int j=0; j < maxIndex; j++) {
				String counts = String.valueOf(scanner.nextInt());
				for(int k=0; k < maxIndex; k++) {
					countMap[i][k] = Integer.parseInt(counts.substring(k,k+1));
				}
				char[] hints = scanner.next().toCharArray();
				for(int k=0; k < maxIndex; k++) {
					hintMap[i][k] = hints[k] == '*';
				}

			}
		}
		for(int[] counts : countMap) {
			System.out.println("count : ");
			for(int num:counts) {
				System.out.print(num + " ");
			}
			System.out.println("");
		}

	}
}

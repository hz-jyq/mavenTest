import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String maxName = null,maxId = null,minName = null,minId = null;
		int maxScore = -1,minSocre = 105;
		for(int i = 0; i < n; i++) {
			String name = scanner.next();
			String id = scanner.next();
			int score = scanner.nextInt();
			if(score > maxScore) {
				maxScore = score;
				maxName = name;
				maxId = id;
			}
			if(score < minSocre) {
				minSocre = score;
				minName = name;
				minId = id;
			}
		}
		System.out.println(maxName + " " + maxId);
		System.out.println(minName + " " + minId);
	}
}

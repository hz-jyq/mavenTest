import java.util.Scanner;


public class Main {
	/*public final static InputStream in = null;
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(bufferedReader.readLine());
		String str = bufferedReader.readLine();
		String[] params = str.split(" ");
		int j = 0;
		for (String param : params) {
		   int result=Integer.getInteger(param);
			while (i != 1) {
				if (i % 2 == 0) {
					i = i / 2;
					if(result==i)params[0]="1";
				} else {
					i = (3 * i + 1) / 2;
				}
			}
		}
	}*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[105];
		for(int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			if(arr[num] == 0) arr[num] = -1;
			while(num > 1) {
				if(num % 2 == 0) num /= 2;
				else num = (3 * num + 1) / 2;
				if(num <= 100) arr[num] = 1;
			}
		}
		boolean isFirst = true;
		for(int i = 100; i > 1; i--) {
			if(arr[i] == -1) {
				if(!isFirst) System.out.print(" ");
				System.out.print(i);
				isFirst = false;
			}	
		}
		System.out.println();
 	}
}
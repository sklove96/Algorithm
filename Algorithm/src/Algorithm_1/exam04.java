package Algorithm_1;

public class exam04 {
	public static void main(String[] args) {
		
		//2단~9단
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j <=9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}
}

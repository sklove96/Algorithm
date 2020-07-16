package Algorithm_1;

import java.util.Scanner;

class exam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		
		if(n > 0)
			System.out.println("양수");
		else if(n < 0)
			System.out.println("음수");
		else
			System.out.println("0입니다");
		

	}

}

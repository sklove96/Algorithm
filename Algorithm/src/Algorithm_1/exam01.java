package Algorithm_1;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값");
		
		System.out.println("a의 값: ");
		int a = scanner.nextInt();
		
		System.out.println("b의 값: ");
		int b = scanner.nextInt();
		
		System.out.println("c의 값: ");
		int c = scanner.nextInt();
		
		//nextBoolean, nextByte 등등 있음 (자료형에 따라 값 받음)
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값 : "+max);
				

	}

}

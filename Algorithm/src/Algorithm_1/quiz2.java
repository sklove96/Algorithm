package Algorithm_1;

import java.util.Scanner;

class quiz2 {
	static int med3(int a, int b, int c) {
		
		if(a >= b) if(b >= c)
			return b;
		
		else if (a <= c)
			return a;
		
		else return c;
		
		else if (a > c)
			return a;
		
		else if (b > c)
			return c;
		
		else return b;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 수의 중앙값 구하기");
		System.out.println("a의 값: ");
		int a = sc.nextInt();
		
		System.out.println("b의 값: ");
		int b = sc.nextInt();
		
		System.out.println("c의 값");
		int c = sc.nextInt();
		
		System.out.println("세 수의 중앙값 : "+med3(a,b,c));
	}

}

//세 수의 중앙값 구하기
//a의 값: 
//1
//b의 값: 
//3
//c의 값
//2
//세 수의 중앙값 : 2

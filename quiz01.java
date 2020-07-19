package Algorithm_1;

import java.util.Scanner;

class quiz01 {
	static int quiz01(int a, int b, int c, int d){
		
		int max = a;
		if(b>max) b = max;
		if(c>max) c = max;
		if(d>max) d = max;
		
		return max;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("a :");
		a = sc.nextInt();
		
		System.out.println("b :");
		b = sc.nextInt();
		
		System.out.println("c :");
		c = sc.nextInt();
		
		System.out.println("d :");
		d = sc.nextInt();
		
		int max= quiz01(a, b, c, d);
		
		System.out.println("최댓값 :"+max);
		
		

	}

}

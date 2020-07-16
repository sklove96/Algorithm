package Algorithm_1;

import java.util.Scanner;

class exam03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.println("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
			
		//for문 이용
		//for(i=0;i<=n;i++){
		// sum += i;}
		}
		System.out.println("1부터"+n+"의 값은: "+sum);
		System.out.println("최종적인 i의 값: "+i);
	}
	
}

//배열 요소의 최댓값 구하기
package Algorithm_2;

import java.util.Scanner;

class exam02 {
	static int maxOf(int[] a) {
		
		int max = a[0];
		for(int i = 1; i < a.length; i++)
			if (a[i] > max)
				max=a[i];
		return max;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람의 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i <num; i++) {
			System.out.print("height["+i+"] :");
			height[i] = sc.nextInt();
		}
		System.out.println("최댓값 :"+maxOf(height));

	}

}

//결과
//키의 최댓값 구하기
//사람의 수 : 4
//height[0] :155
//height[1] :177
//height[2] :160
//height[3] :165
//최댓값 :177

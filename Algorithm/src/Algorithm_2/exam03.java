//1000이하의 소수 구하기
package Algorithm_2;

class exam03 {
	public static void main(String[] Args) {
		
		int counter = 0;
		
		for(int n = 2; n <= 1000; n++) {			
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n % i ==0)
					break; //더 이상의 반복 불필요
			}
			if (n == i)
				System.out.println(n);
		}
		System.out.println("나눗셈 수행 횟수:"+counter);		
	}	
}

//나눗셈 수행 횟수:78022
//1000이하의 소수 구하기 (개선된 코드)
package Algorithm_2;

class exam04 {
	public static void main(String[] args) {
		
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500]; //소수 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수
		
		for(int n = 3; n <= 1000; n += 2) {			
			int i;
			for(i = 1; i < ptr; i++) {
				counter++;
				if(n % prime[i] == 0)
					break;
			}
			if (ptr == i)
				prime[ptr++] = n;
		}
		for(int i = 0; i < ptr; i++)
			System.out.println(prime[i]);
			
			System.out.println("나눗셈 수행 횟수: "+counter);
	}

}

//나눗셈 수행 횟수: 14622
//그 해 경과 일 수
package Algorithm_2;

import java.util.Scanner;

class exam05 {
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //윤년
	};
	//윤년이면 1, 평년이면 0
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1:0;
	}
	//y년m월d일의 경과일 수 구함
	static int exam05(int y, int m, int d) {
		int days = d;
		
		for(int i = 1; i < m; i++)            //1월~ (m-1)월의 일 수 구함
			days+= mdays[isLeap(y)][i-1]; //윤년이면 1, 평년이면 0
		return days; //다시 한 번		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일 수 구하기");
		
		do {			
			System.out.println("년: "); int year = sc.nextInt();
			System.out.println("월: "); int month = sc.nextInt();
			System.out.println("일: "); int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", exam05(year, month, day));
			
			System.out.println("한 번 더?(1:예/0:아니오)");
			retry = sc.nextInt();				
		}while (retry == 1);

	}

}

/*
 * 그 해 경과 일 수 구하기
 * 년: 2019
 * 월: 3
 * 일: 15
 * 그 해 74일째입니다.
 * 한 번 더?(1:예/0:아니오
 */

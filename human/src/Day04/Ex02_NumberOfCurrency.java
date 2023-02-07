package Day04;

import java.util.Scanner;

/**
 * 화폐 매수 구하기
 * 
 * 금액 	: 534760
 * 50000	:	10개
 * 10000	:	3개
 * 5000		:	0개
 * 1000		:	4개
 * 500		:	1개
 * 100		:	2개
 * 50		:	1개
 * 10		:	1개
 * 5		:	0개
 * 1		:	0개
 * 
 * 위와 같이 금액을 입력하면,
 * 큰 화폐단위부터 계산하여 화폐단위별로 화폐매수를
 * 출력하는 프로그램을 작성하시오.
 * 
 * @author h
 *
 */
public class Ex02_NumberOfCurrency {
	/*
	 	(순서도)
	 	1. 필요한 변수 선언
	 	- (입력금액), (화폐매수), (화폐단위)
	 	
	 	2. (입력금액) 입력
	 	3. 화폐매수 계산
	 	 [조건] : 큰 화폐 단위부터 계산하다.
	 	 3-1. 화폐매수 계산
	 	 		10		  537620  / 50000
	 	 	  (화폐매수) = (입력금액) / (화폐단위)
	 	
	 	3-2. 잔액 계산
	 	i)	(잔  액) = (입력금액) - (화폐단위x화폐매수)
	 	ii)	(잔  액) = (입력금액) % (화폐단위)
	 	
	 	3-3. 화폐단위 변환
	 		번갈아 가면서, /5, /2 연산을 반복한다.
	 		(화폐단위) = (화폐단위) / 5
	 		(화폐단위) = (화폐단위) / 2
	 		  
	 	4. 3번의 과정을 반복
	 	   -반복조건 : (화폐단위) 1보다 크거나 같으면 반복
	 	   
	 	5. 3-1에서 구한 화폐매수를 출력한다.
	*/
	
	public static void main(String[] args) {
		// 1. 필요한 변수 선언
		// (입력금액), (화폐매수), (화폐단위)
		int input;				// 입력금액
		int count;				// 화폐매수
		int money = 50000;		// 화폐단위  : 큰 화폐단위부터 시작
		boolean sw = true;		// 화폐단위 변환 스위치 변수
		
		// 2. 금액 입력
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		// 4. 3번의 과정을 반복
		while( money >= 1 ) {
			// 3-1. 화폐매수 계산
			// 		(화폐매수) = (입력금액) / (화폐단위)
			count = input / money;
			// 5. 화폐매수를 출력
			System.out.println(money + "\t : " + count + "개");
			
			// 3-2. 잔액 계산
			// i)	(잔  액) = (입력금액) - (화폐단위x화폐매수)
			//ii)	(잔  액) = (입력금액) % (화폐단위)
			// input = input - (money*count);
			input = input % money;
			
			// 3-3. 화폐단위 변환
			//    	(화폐단위) = (화폐단위 / 5)
			//    	(화폐단위) = (화폐단위 / 2)
			if( sw ) {
				money = money / 5;
				// sw = false;
			} else {
				money = money / 2;
				//sw = true;
			}
			sw = !sw;
		}
		
	}

}





















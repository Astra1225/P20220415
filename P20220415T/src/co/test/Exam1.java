package co.test;

import java.util.Scanner;

// 변수 선언과 제어문 활용.
// 정수값을 받는 변수를 3개 선언하고 num1, num2, num3 의 변수에 저장.
// 제일 큰 값을 구하도록 기능을 구현하세요.
// 결과 => 3 수 중에서 가장 큰값은 100 입니다.
public class Exam1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 코드 작성.
		
		int num1=0, num2=0, num3=0;
		int maxValue;
		
		System.out.print("첫 번째 값을 입력:");
		num1 = scn.nextInt();
		System.out.print("두 번째 값을 입력:");
		num2 = scn.nextInt();
		System.out.print("셋 번째 값을 입력:");
		num3 = scn.nextInt();
		
		if(num1 > num2 && num1 > num3 ) {
			maxValue = num1;
		} else if(num2 > num1 && num2 > num3){
			maxValue = num2;
		} else {
			maxValue = num3;
		}
		System.out.printf("%d, %d, %d 중에 가장 큰 값은 %d이다.",num1, num2, num3, maxValue);
	}
}

package co.test;

import java.util.Scanner;
// 배열의 사용.
// 크기가 10인 배열에 1 ~ 10까지의 임의의 수를 저장.
// 평균값보다 큰 값을 새로운 배열에 저장하도록 하세요.
public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 수 입력:");
		int[] array = new int[10];		
		int sum =0;
		
		for(int j=0; j<10; j++) {
			int i = (int)(Math.random()*10+1);
			System.out.print(i + " ");
			array[j] = i;
			sum += array[j];
		}
		System.out.println();
		int avg = sum /10;
		if(avg > sum) {
			avg = sum;
		}
		System.out.println("배열값은"+array.length +", " + "평균은" + avg);
	}
}
		
		

package test01;

import java.util.Iterator;
import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시합니다.");
		System.out.print("단수는:");
		int n = stdIn.nextInt();
		
		
		
		for(int i =1; i<=n; i++) { //행 갯수
			for(int j=1; j <=n-i; j++) { //피라미드생성을 위한 공백 생성
			System.out.print(' ');
			}
			for(int a = 1; a<=2*i-1; a++) { //열 갯수
				System.out.print(i%10);
			}System.out.println();
		}
		

	}

}

package test01;

import java.util.Iterator;
import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� �Ƕ�̵带 ǥ���մϴ�.");
		System.out.print("�ܼ���:");
		int n = stdIn.nextInt();
		
		
		
		for(int i =1; i<=n; i++) { //�� ����
			for(int j=1; j <=n-i; j++) { //�Ƕ�̵������ ���� ���� ����
			System.out.print(' ');
			}
			for(int a = 1; a<=2*i-1; a++) { //�� ����
				System.out.print(i%10);
			}System.out.println();
		}
		

	}

}

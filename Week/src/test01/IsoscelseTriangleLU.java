package test01;

import java.util.Iterator;
import java.util.Scanner;

public class IsoscelseTriangleLU {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���� ���� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ���:");
		int n = stdIn.nextInt();
		
		System.out.println();
		
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		

	}

}

package test01;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n ;
		do {
			System.out.println("2�̻��� ������:");
			n=stdIn.nextInt();
		}while(n<2);

		for(int i =2; i<n; i++) {
		
			if(n%i==0)
				break;
		if(n==i) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		}
	}

}

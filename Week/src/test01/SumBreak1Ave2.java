package test01;

import java.util.Scanner;

public class SumBreak1Ave2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		System.out.print("�� ���� ���ұ��?:");
	    int n = stdIn.nextInt();
	    int sum = 0;
	    int i;
	    for( i=0;i<n;i++) {
	    	System.out.print("����:");
	    	int t = stdIn.nextInt();
	    	if(sum+t>1000) {
	    		System.out.println("�հ谡 1,000�� �Ѿ����ϴ�.");
	    		System.out.println("������ ���� �����մϴ�.");
	    	break;
	    	}
	    	
	    	sum += t;
	    }System.out.println("�հ��" + sum + "�Դϴ�.");
	    if(i != 0)
	System.out.println("�����" + sum/n + "�Դϴ�.");
	    
	    
	    }
		

	}



package test01;

import java.util.Scanner;

public class SumBreak1Ave {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ ���մϴ�.");
		System.out.print("�� ���� ���ұ��?:");
	    int n = stdIn.nextInt();
	    int sum = 0;
	    for(int i=0;i<n;i++) {
	    	System.out.print("����(0���� ����):");
	    	int t = stdIn.nextInt();
	    	if(t==0) break;
	    	
	    	sum+=t;
	    }System.out.println("�հ��" + sum + "�Դϴ�.");
	System.out.println("�����" + sum/n + "�Դϴ�.");
	    
	    
	    }
		

	}



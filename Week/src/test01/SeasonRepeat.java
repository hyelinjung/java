package test01;

import java.util.Scanner;

public class SeasonRepeat {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("������ ã���ϴ�.");
		int retry;
		do {
			
			int month;
do {
	
	System.out.print("�� ���Դϳ�?:");
	 month =stdIn.nextInt();
}while(month<1 || month>12);

if(month>= 3 && month <=5)
	System.out.println("���Դϴ�.");
else if(month>= 6 && month <=8)
	System.out.println("�����Դϴ�.");
else if(month>=9  && month <=11)
	System.out.println("�����Դϴ�.");
else if(month== 1 || month ==12 || month ==2)
	System.out.println("�����Դϴ�.");

System.out.print("�ٽ� �ϰڽ��ϱ�?:1...Yes/0...No:" );
retry=stdIn.nextInt();
	}while(retry==1);

}
}

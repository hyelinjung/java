package p1;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
	//char c3 = c2 + 1;//������ ����
	
		int result1 = c2 + 1;
		
		char c3 = (char)result1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(result1);
	}

}

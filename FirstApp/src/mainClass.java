import java.util.Scanner;

public class mainClass {
	public mainClass() {
		System.out.println("�ȳ��ϼ���^^;");
		System.out.println();		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �Է� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° �Է� : ");
		int b = sc.nextInt();
		System.out.println();
		int c = a + b;
		System.out.print("�� : " + c);
	}

	public static void main(String[] args) {
		mainClass mc = new mainClass();
	}
}

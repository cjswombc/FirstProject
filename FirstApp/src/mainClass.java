import java.util.Scanner;

public class mainClass {
	public mainClass() {
		System.out.println("안녕하세요 ^^;");
		System.out.println();		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int b = sc.nextInt();
		System.out.println();
		int c = a + b;
		System.out.print("답이란? : " + c);
	}

	public static void main(String[] args) {
		mainClass mc = new mainClass();
	}
}

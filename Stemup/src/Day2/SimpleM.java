package Day2;
import java.util.Scanner;
public class SimpleM {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter operation 1:chech balance 2:withdraw 3:deposit 4:exit");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("you can check balance");
			break;
		case 2:
			System.out.println("you can withdraw");
			break;
		case 3:
			System.out.println("you can deposit");
			break;
		case 4:
			System.out.println("you can exit");
			break;
		}
		
		
	}

}

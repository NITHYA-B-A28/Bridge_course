package Day2;
import java.util.Scanner;
public class PosNeg {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enetr an integer");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("number is positive");
		}else if(a<0) {
			System.out.println("number is negative");
		}else {
			System.out.println("number is exactly zero");
		}
		
	}

}

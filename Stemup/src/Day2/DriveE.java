package Day2;
import java.util.Scanner;
public class DriveE {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("eligible to drive");
		}else System.out.println("not eligible to drive");
	}

}

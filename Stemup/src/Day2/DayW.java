package Day2;
import java.util.Scanner;
public class DayW {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number between 1-7");
		int a=sc.nextInt();
		if(a>=1&&a<7) {
			switch(a) {
			case 1:
			System.out.println("Sunday");
			break;
			case 2:
				System.err.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			}
		}
		
	}

}

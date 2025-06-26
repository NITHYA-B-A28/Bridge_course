package Day3;
import java.util.Scanner;
public class FactC {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int fact=1;
		if(a!=0) {
			for(int i=1;i<=a;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
			}else {
				System.out.println("1");
		}
	}

}

package Day3;
import java.util.Scanner;
public class SumZ {
	public static void main(String[]args) {
		int sum=0;
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a= sc.nextInt();
		if(a==0) {
			System.out.println(sum);
			break;
		}
		sum=sum+a;
		}
	}

}

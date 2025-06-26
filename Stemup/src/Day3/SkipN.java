package Day3;
import java.util.Scanner;
public class SkipN {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int sum=0;
		while(count<5) {
			System.out.println("enter a number: ");
			int a=sc.nextInt();
			count++;
			if(a<0) {
				continue;
			}else {
				sum=sum+a;
			}
		}
		System.out.println("sum is "+sum);
	}


}

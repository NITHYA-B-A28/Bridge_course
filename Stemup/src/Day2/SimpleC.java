package Day2;
import java.util.Scanner;
public class SimpleC {
	public static void main(String[]args) {
		double res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		double a=sc.nextDouble();
		System.out.println("enter a number");
		double b=sc.nextDouble();
		System.out.println("enter a operation");
		String c=sc.next();
		if(c.equals("+")) {
			res=a+b;
		}else if(c.equals("-")){
			res=a-b;
		}else if(c.equals("*")){
			res=a*b;
		}else if(c.equals("/")){
			if(b!=0) {
			res=a/b;
			}
			else System.out.println("error");
		}
		System.out.println(res);

	}

}

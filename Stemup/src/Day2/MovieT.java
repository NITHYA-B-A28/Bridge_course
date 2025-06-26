package Day2;
import java.util.Scanner;
public class MovieT {
	public static void main(String[]args) {
		int money=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("student status");
		boolean s=sc.nextBoolean();
		if(age<5 || age>65) {
			money=5;
		}else if(age>=5 && age<=18) {
			if(s==true) {
				money=8;
			}
		}else money=12;
	System.out.println(money);
	}

}

package Day3;
import java.util.*;
public class RandomG {
	public static void main(String[]args) {
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		int num=ran.nextInt(10+1);
		System.out.println("guess a number 1-10");
		while(true) {
			System.out.println("enter the number");
			int a=sc.nextInt();
			if(a==num) {
				System.out.println("correct");
				break;
			}else if(a>num) {
				System.out.println("guess a smaller number");
			}else{
				System.out.println("guess a greater number");
		}
			
	}
	}
}

 

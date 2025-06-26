package Day2;
import java.util.Scanner;
public class AgeCheck {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENETR THE AGE");
		int myAge=sc.nextInt();
		boolean r= myAge>18? true:false;
		System.out.println(r);
		r=myAge>=25? true:false;
		System.out.println(r);
		r=myAge!=30?true:false;
		System.out.println(r);
		r=myAge<=65?true:false;
		System.out.println(r);
		
		
				
	}
	

}

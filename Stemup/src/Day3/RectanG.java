package Day3;
import java.util.Scanner;
public class RectanG {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rows and columns");
	int b=sc.nextInt();
	int l=sc.nextInt();
	for(int i=0;i<b;i++) {
		for(int j=0;j<l;j++) {
			System.out.print("*");
		}System.out.println();
	}
	
	
}
}

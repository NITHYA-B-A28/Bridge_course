package Day3;
import java.util.Scanner;
public class CountA {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='A') {
				count++;
			}
		}System.out.println(count);
	}

}

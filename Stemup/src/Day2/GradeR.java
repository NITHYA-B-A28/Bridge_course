package Day2;
import java.util.Scanner;
public class GradeR {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter grade");
		int g=sc.nextInt();
		if(g>=90 && g<=100) {
			System.out.println("excellent");
		}else if(g>=80 && g<=89) {
			System.out.println("very good");
		}else if(g>70 && g<=79) {
			System.out.println("good");
		}else if(g>=60 && g<=69) {
			System.out.println("pass");
		}else System.out.println("fail");
        	
        		
	}

}

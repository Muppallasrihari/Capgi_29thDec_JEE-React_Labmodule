/**
 * Create a method to check if a number is an increasing number
 * @author srihari muppalla
 *
 */
import java.util.*;
public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		;
		if(checkNumber(n)) {
			System.out.println("The number is an increasing number.");
		}
		else {
			System.out.println("The number is not an increasing number.");
		}
		

	}
	
	private static boolean checkNumber(int n) {
		boolean flag=true;
		int m=n;
		int currentDigit=m%10;
		m=m/10;
		while(m>0) {
			if(currentDigit<m%10) {
				flag=false;
				break;
			}
			currentDigit=m%10;
			m=m/10;
		}
		return flag;
		
	}

}

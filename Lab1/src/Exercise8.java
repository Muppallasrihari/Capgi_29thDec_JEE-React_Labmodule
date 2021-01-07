/**
 * Create a method to check if a number is an increasing number
 * @author srihari muppalla
 *
 */
import java.util.*;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(checkNumber(num)) {
			System.out.println(num+" is a power of 2.");
		}
		else {
			System.out.println(num+" is not a power of 2.");
		}
		

	}
	
	private static boolean checkNumber(int n) {
		if(n==0) {
			return false;
		}
		while(n!=1) {
			if(n%2!=0) {
				return false;
			}
			n=n/2;
		}
		return true;
	}

}

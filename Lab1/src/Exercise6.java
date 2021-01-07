/**
 * Create a class with a method to find the difference between the sum of the squares and 
   the square of the sum of the first n natural numbers.
 * @author srihari muppalla
 *
 */
import java.util.*;
public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("The difference is :"+calculateDifference(n));  

	}
	
	private static int calculateDifference(int num) {
		int sum1=0,sum2=0;
		for(int i=1;i<=num;i++) {
			sum1+=i*i;
		}
		for(int i=1;i<=num;i++) {
			sum2+=i;
		}
		int difference=sum1-(sum2*sum2);
		
		return difference;
	}

}

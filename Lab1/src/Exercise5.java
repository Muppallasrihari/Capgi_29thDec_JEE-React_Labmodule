/**
 * Create a class with a method which can calculate the sum of first n natural numbers which 
  are divisible by 3 or 5.
 * @author srihari muppalla
 *
 */
import java.util.*;
public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int num=sc.nextInt();
		System.out.println("The sum of the numbers divisible by 3 and 5 is :"+CalculateSum(num));

	}
	private static int CalculateSum(int n) {
		int i,sum=0;
		for(i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

}

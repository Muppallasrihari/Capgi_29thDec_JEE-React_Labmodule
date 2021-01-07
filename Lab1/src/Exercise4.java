/**
 * Write a Java program that prompts the user for an integer and then prints out all the 
   prime numbers up to that Integer?
 * @author srihari muppalla
 *
 */
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1,num,count,divisor;
		System.out.println("Enter the number upto which we have to print prime numbers:");
		num=sc.nextInt();
		while(i<=num) {
			count=0;
			divisor=2;
			while(divisor<=i/2) {
				if(i%divisor==0) {
					count++;
					break;
				}
				divisor++;
			}
			
			if(count==0 && i!=1) {
				System.out.print(i+" ");
			}
			i++;
		}
		

	}

}

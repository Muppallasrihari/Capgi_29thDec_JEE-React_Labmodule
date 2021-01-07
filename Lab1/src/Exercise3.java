/**
 * The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are
   1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that
    uses both recursive and non-recursive functions to print the nth value of the Fibonacci 
    sequence?
 * @author srihari muppalla
 *
 */
import java.util.*;
public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,a=1,b=1,c=0,n;
		System.out.print("Enter value of n: ");
		n=sc.nextInt();
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<n-2;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(" "+c);
		}
		System.out.println();
		System.out.print(n+"th number of the series is: "+c);
		}
	}


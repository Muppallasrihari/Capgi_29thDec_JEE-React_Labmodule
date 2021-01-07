/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 * @author srihari muppalla
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		int num=123;
		int output=SumOfCubes(num);
		System.out.println("The sum of cubes of the given number is: "+output);
	}
	private static int SumOfCubes(int number) {
		int m=number,sum=0,n;
		while(m>0) {
			n=m%10;
			sum+=n*n*n;
			m=m/10;
		}
		return sum;
	}

}

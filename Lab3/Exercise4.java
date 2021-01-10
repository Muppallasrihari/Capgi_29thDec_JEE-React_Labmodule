/**
 * Create a method that accepts a number and modifies it such that the each of the digit in the newly 
   formed number is equal to the difference between two consecutive digits in the original number. 
   The digit in the units place can be left as it is. 
 * @author sri hari muppalla
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		int input=45862;
		modifyNumber(input);

	}
	
	private static int modifyNumber(int num) {
		StringBuffer stBuffer=new StringBuffer("");
		String str=String.valueOf(num);
		char [] chars= str.toCharArray();
		int number1,number2,difference=0;
		
		for(int i=0;i<chars.length-1;i++) {
			number1=(int)(chars[i]);
			number2=(int)(chars[i+1]);
			difference=Math.abs(number1-number2);
			stBuffer.append(difference);
		}
		stBuffer.append(chars[chars.length-1]);
		System.out.println(stBuffer);	
				return 0;
	}

}

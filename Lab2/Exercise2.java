/**
 * Create a method that can accept an array of String objects and sort in alphabetical order. 
   The elements in the left half should be completely in uppercase and the elements in the right 
   half should be completely in lower case. Return the resulting array.
   Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
 * @author sri hari muppalla
 *
 */
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		String [] str={"chinnu","hari","sRi","muppAlla"};
		sortStrings(str);
	}
	
	private static String sortStrings(String arr[]) {
		Arrays.sort(arr);
		String [] str1=new String[arr.length];
		if(arr.length%2==0) {
			for(int i=0;i<arr.length/2;i++) {
				str1[i]=arr[i].toUpperCase();
			}
			for(int i=arr.length/2;i<arr.length;i++) {
				str1[i]=arr[i].toLowerCase();
			}
		}
		else {
			for(int i=0;i<arr.length/2+1;i++) {
				str1[i]=arr[i].toUpperCase();
			}
			for(int i=arr.length/2+1;i<arr.length;i++) {
				str1[i]=arr[i].toLowerCase();
			}
		}
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		return null;
	}
	

}

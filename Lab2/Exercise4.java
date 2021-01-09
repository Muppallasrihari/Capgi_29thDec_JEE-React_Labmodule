

/**
 * Create a method which accepts an integer array and removes all the duplicates in the array. 
   Return the resulting array in descending order
 * @author sri hari muppalla
 *
 */
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		int input[]= {2,3,6,6,6,8,8,9,10,10,12};
		modifyArray(input);
	}
	
	private static int[] modifyArray(int arr[]) {
		int i=1;
		int j=0;
		while(i<arr.length) {
			if(arr[i]==arr[j]) {
				i++;
			}
			else {
				arr[++j]=arr[i++];
			}
		}
		int out[]=new int[j+1];
		for(int k=0; k<out.length; k++){
            out[k] = arr[k];
        }
		descending(out);
		for(int x=0;x<out.length;x++) {
			System.out.print(out[x]+" ");
		}
		return null;
	}
	
	private static int[] descending(int arr[]) {
		int temp;
		for (int a = 0; a < arr.length; a++) 
        {
            for (int b = a + 1; b < arr.length; b++) 
            {
                if (arr[a] < arr[b]) 
                {
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
            }
        }
		return arr;
	}

}


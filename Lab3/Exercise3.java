/**
 * 
 * @author sri hari muppalla
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		String str="java";
		System.out.println("The replaced word is: "+alterString(str.toCharArray()));

	}
	
	 private static boolean isVowel(char ch) 
	    { 
	        if (ch != 'a' && ch != 'e' && ch != 'i'
	                && ch != 'o' && ch != 'u')  
	        { 
	            return false; 
	        } 
	        return true; 
	    }
	 private static String alterString(char [] arr) {
		 for(int i=0;i<arr.length;i++) {
			 if(!isVowel(arr[i])) {
				 if(arr[i]=='z') {
					 arr[i]='b';
				 }
				 else {
					 arr[i]=(char)( arr[i]+1);
					 if(isVowel(arr[i])) {
						 arr[i]=(char)(arr[i]+1);
					 }
				 }
			 }
			 
		 }
		 return String.valueOf(arr);
	 }

}

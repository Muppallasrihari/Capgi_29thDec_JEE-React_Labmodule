/**
 * Create a class containing a method to create the mirror image of a String. The method should 
   return the two Strings separated with a pipe(|) symbol .
 * @author sri hari muppalla
 *
 */
import java.lang.*;
public class Exercise2 {

	public static void main(String[] args) {
		StringBuffer stbuf=new StringBuffer("EARTH");
		System.out.println(stbuf +"|"+stbuf.reverse());

	}

}

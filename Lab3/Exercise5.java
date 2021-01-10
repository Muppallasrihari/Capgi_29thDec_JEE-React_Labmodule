import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


/**
 * : Write a Java program that displays the number of characters, lines and words in a text? 
 * @author sri hari muppalla
 *
 */
public class Exercise5 {

	public static void main(String[] args) throws IOException {
		
		int noOfLines=1,noOfWords=0;
		char ch;
		String input="C:\\Users\\sri hari muppalla\\Desktop\\Code\\Lab3\\src\\test.txt";
		FileInputStream file=new FileInputStream(input);
		int length=file.available();
		for(int i=0;i<=length;i++) {
			ch=(char)file.read();
			if(ch=='\n') {
				noOfLines++;
			}
			else if(ch==' ') {
				noOfWords++;
			}
		}
		
		System.out.println("Number of characters are: "+length);
		System.out.println("Number of words are: "+(noOfWords+noOfLines));
		System.out.println("Number of lines are: "+noOfLines);
	}

}

/**
 * Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
   On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
 * @author srihari muppalla
 *
 */
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Red \n2.Green \n3.Yellow");
		System.out.println("Select the colour:");
		String input=sc.nextLine();
		if(input.equals("1")) {
			System.out.println("Stop");;
		}
		else if(input.equals("2")) {
			System.out.println("Go");
		}
		else if(input.equals("3")) {
			System.out.println("Ready");
		}
	}

}

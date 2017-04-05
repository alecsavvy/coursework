/*
 
 Alec Savoy
 CIS 212 Assignment 1
 Number Counter
 
 Used Scanner library to receive input from user and add to a counter.
 cmd -3: prints current counter value
 cmd -2: clears counter and sets it back to 0
 cmd -1: exits the application
 
 cmd is initialized in the while loop so it loses it's previous value gets overwritten
 counter is initialized to 0 so printing the counter as the first command doesn't crash the application
 
 inputing a non-integer to the console will crash the program because input is only using nextInt()
 the assignment does not require us to handle non-integer values
 
 */

import java.util.Scanner;

public class NumCounter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String options = "Enter a positive integer (-3 to print, -2 to reset, -1 to quit):";
		Integer cmd;
		Integer counter = 0;
		
		while (true){
			System.out.println(options);
			cmd = input.nextInt();
			if (cmd == -3){
				String show = "Sum: " + counter.toString();
				System.out.println(show);
			} else if (cmd == -2){
				counter = 0;
			} else if (cmd == -1){
				System.out.println("Done");
				break;
			} else {
				counter += cmd;
			}
			
		}
		input.close();

	}

}

/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Feb 2018
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxLogsCalculator {
	
	public static void main(String[] args) {
		//Calculate the max number of logs
		String input = null;
		double lengthOfLog = 0.0;
		double maxWeightCapacity = 1100;
		double weightPerMetre = 20;
		double maxTotalLength = maxWeightCapacity / weightPerMetre;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		while(true) {
			System.out.println("Enter the length of the logs: ");
			try {
				//Get user input
				input = reader.readLine();
			} catch (IOException noInput) {
				noInput.printStackTrace();
			}
			try {
				//Convert string to double
				lengthOfLog = Double.parseDouble(input);
				break;
			} catch (NumberFormatException stringInput) {
				System.out.println("Please enter a number");
			}
		}
		
		double maxNumberOfLogs = maxTotalLength / lengthOfLog;
		System.out.println("A maximum of " + maxNumberOfLogs + " logs can "
				+ "fit on the truck.");
	}
}

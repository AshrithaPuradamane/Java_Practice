/* Write a program to accept gender ("Male" or "Female") and age (1-120) from command
line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
8.3% Gender ==> Male Age ==>61-120*/
package com.java.practice;

public class CommandLineArgs {

	public static void main(String[] args) {
		String gender = null;
		int age = 0;
		if (args.length != 2) {
			System.out.println("Please enter gender(Male or Female) and age(1-120) as commandline agruments");
		} else {
			gender = args[0];
			try {
				age = Integer.parseInt(args[1]);
			} catch (NumberFormatException e) {
				System.out.println("Age should be number");
			}
			if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
				System.out.println("Please enter male or female as 1st command line argument");
			} else if (age < 1 && age > 120) {
				System.out.println("Age should be between 1 to 120");
			} else {
				if (gender.equalsIgnoreCase("female") && age >= 1 && age <= 58) {
					System.out.println("Interest is 8.2%.");
				} else if (gender.equalsIgnoreCase("female") && age >= 59 && age <= 120) {
					System.out.println("Interest is 7.6%.");
				} else if (gender.equalsIgnoreCase("male") && age >= 1 && age <= 60) {
					System.out.println("Interest is 9.2%.");
				} else if (gender.equalsIgnoreCase("female") && age >= 61 && age <= 120) {
					System.out.println("Interest is 8.3%.");
				}
			}
		}
	}

}

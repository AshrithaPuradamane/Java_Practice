/* Write a program to check if the program has received command line arguments or not.
If the program has not received the values then print "No Values", else print all the
values in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2)
java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length
property of an array to check its length */
package com.java.practice;

public class CommandLineArgument {
	public static void main(String[] args) {
		System.out.println("Commandline arguments:");
		if(args.length > 0) {
			System.out.println(String.join(",", args));
		}else {
		System.out.println("No Values");
		}
	}
}

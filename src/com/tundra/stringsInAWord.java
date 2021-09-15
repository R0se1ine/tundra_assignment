package com.tundra;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class stringsInAWord {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Input a string of your choice : ");
		String inputString= sc.next();
		Dictionary.isEnglishWord(inputString);
		sc.close();

	}

}

package com.tundra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

	public static void isEnglishWord(String inputString) throws FileNotFoundException {
		Scanner s = new Scanner(new File( System.getProperty("user.dir")+"//wordsRepo.txt"));
		ArrayList<String> dictionary = new ArrayList<String>();
		while (s.hasNext()){
			dictionary.add(s.next());
		}
		
		ArrayList <String> matches = new ArrayList <String> ();

        for(String word : dictionary) {

            Boolean nonMatch = true;

            for( char ch : word.toCharArray() ) {

                String str = Character.toString(ch);

                if ( word.length() - word.replace(str, "").length() !=
                		inputString.length() - inputString.replace(str, "").length() ) {
                    nonMatch = false;
                    break;
                }
            }
            if (nonMatch) {
               matches.add( word );
            }
        }

        System.out.println(matches);
	}

}

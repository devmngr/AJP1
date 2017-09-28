package BibleSort;

import java.io.*;
import java.util.*;

public class textReader {

	public static String[] readFile(String fileName) throws Exception
	{

		ArrayList<String> wordList = new ArrayList<String>();
		String [] result =null;
		
		try{
			BufferedReader input = new BufferedReader(new FileReader(fileName));
			String line  = input.readLine();
			String delimiter = new String(" ");
			
			while (line != null)
			{
				String[] wordLine = line.split(delimiter);
				for (int i = 0; i < wordLine.length; i++) {
					wordList.add(wordLine[i]);
				}
				
				line = input.readLine();
			}
			
			result = new String[wordList.size()];
			
			wordList.toArray(result);

			input.close();
		
		
		}
		
		catch (FileNotFoundException e){
			System.out.println("File not found");
		}
		
		return result;
	}

}

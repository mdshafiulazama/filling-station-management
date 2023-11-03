package fileio;

import java.lang.*;
import java.io.*;

public class TransactionDetails
{
	private File file;				
	private FileWriter writer;		
	private FileReader reader;		
	private BufferedReader bfr;	
	
	
	public void writeInFile(String s)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			file = new File("fileio/History.txt");	//Declaring a file named named History.txt for creating.
			file.createNewFile();					//If the file does not exists, creates and opens the file. else, just opens the file
			writer = new FileWriter(file, true);	//creating the writer object to write in the file.
			writer.write(s+"\r"+"\n");				//writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
			writer.flush();							//After writing, we need to flush to indicate that we have completed writing.
			writer.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		/*
			reading from a file genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		
		try
		{
			reader = new FileReader(file);			//creating the reader object to read from a file.
			bfr = new BufferedReader(reader);		//creating the BufferedReader object using the reader object to read the file content.
			String text="", temp;					//declaring two string variables to read the file content and storing them.
			
			while((temp=bfr.readLine())!=null)		//reading one line from the file, storing it in the variable temp and checking whether it is null or not. It will be null at the end of reading from the file.
			{
				text=text+temp+"\n"+"\r";			//storing the temp string in text by concating it with text and "n" and "\r" is used to go to a newline.
			}
			
			System.out.println(text);				//printing the whole string in console.
			reader.close();							//closing the file.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
}
package com.labProgram;

import java.io.*;
public class FileReading {

	public static void main(String[] args) {
		File f1=new File("C:\\Users\\bardan\\Desktop\\Alert\\Java-files\\File-Write1.txt");
		try {
			FileWriter file2=new FileWriter("C:\\Users\\bardan\\Desktop\\Alert\\Java-files\\File-Write1.txt");
			FileReader file1=new FileReader("C:\\Users\\bardan\\Desktop\\Alert\\Java-files\\File-Write1.txt");
			if(f1.exists())
			{
			String detail="My name is Aadit Sharma.I live in Pepsicola.";
			file2.write(detail);
			file2.close();
			
			int i;
			while((i=file1.read())!=-1)
			{
				System.out.print((char)i);
			}
			}
			else
			{
				file1.close();
				file2.close();
				throw new Exception("...");
			}
				file1.close();
		}
		catch(Exception e)
		{
			System.out.println("File doesnot exists.");
		}

}
}

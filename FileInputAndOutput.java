package com.labProgram;

import java.io.*;
public class FileInputAndOutput {

	public static void main(String[] args) {
		File file1=new File("C:\\Users\\bardan\\Desktop\\Alert\\Java-files\\File-Write.txt");
		try {
			
				if(file1.createNewFile())
				{
					FileOutputStream file2 = new FileOutputStream("C:\\Users\\bardan\\Desktop\\Alert\\Java-files\\File-Write.txt");
					String name="My name is Aadit Sharma";
					byte b[] = name.getBytes();
					file2.write(b);
					file2.close();	
					System.out.println("Successfully written");
					}
				else
				{
					throw new Exception();
				}
		}
		
			catch(Exception e)
			{
				System.out.println("Error to create file.");
			}
		
	}

}

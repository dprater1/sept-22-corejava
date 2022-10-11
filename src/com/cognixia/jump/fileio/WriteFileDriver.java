package com.cognixia.jump.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class WriteFileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		FileWriter fileWriter = null;
		BufferedWriter buffWriter = null;
		PrintWriter printWriter = null;

		try {
			file = new File("resources/temp.txt");

			if (file.exists()) {
				fileWriter = new FileWriter(file, true);
				buffWriter = new BufferedWriter(fileWriter);
				printWriter = new PrintWriter(buffWriter);

				// create some helper methods below to see different ways to write our files
				//writeToFile(buffWriter, "Hello");
				//appendToFile(buffWriter, "New String added.");
				writeWithPrintWriter(printWriter, "Print Writer wrote this!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (buffWriter != null) {
				try {
					buffWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (printWriter != null) {
				printWriter.close();
			}
		}

	}

	private static void writeWithPrintWriter(PrintWriter printWriter, String string) {
		// TODO Auto-generated method stub
		printWriter.println();
		printWriter.print(string);
		printWriter.println(string);
		printWriter.println(string);
	}

	private static void appendToFile(BufferedWriter buffWriter, String string) throws IOException{
		for(int i = 0; i < 3; i++){
			buffWriter.append("\n"+string);
		}

	}
	//propagated by try catch in main method, so throwing exception here will be caught above, no need for try catch
	// in method in this case
	private static void writeToFile(BufferedWriter buffWriter, String string) throws IOException{
		
		for(int i = 0; i < 3; i++){
			buffWriter.write(string);
		}

	}

}
